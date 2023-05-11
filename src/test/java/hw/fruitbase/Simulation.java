package hw.fruitbase;

import hw.fruitbase.customers.Customer;
import hw.fruitbase.customers.FreshCustomer;
import hw.fruitbase.customers.UniqueCustomer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Simulation {
    public static void main(String[] args) {
        try {
            if (args.length > 0) {
                FruitBase fruitBase = new FruitBase();
                List<Customer> customers = new ArrayList<>();
                extractPath(args[0]);
                if ((args[0].contains("-e") || args[0].contains("--export") || args[0].contains("-i") ||
                        args[0].contains("--import")) && args[1].contains("=")) {
                    switch (args[0]) {
                        case "-e":
                        case "--export":
                            fruitBase.exportCatalogue(args[2]);
                            break;
                        case "-i":
                        case "--import":
                            fruitBase.importCatalogue(args[2]);
                            break;
                    }
                } else {
                    switch (args[0]) {
                        case "-e":
                        case "--export":
                            fruitBase.exportCatalogue();
                            break;
                        case "-i":
                        case "--import":
                            fruitBase.importCatalogue();
                            break;
                        case "-e=":
                        case "--export=":
                            fruitBase.exportCatalogue(args[2]);
                            break;
                        case "-i=":
                        case "--import=":
                            fruitBase.importCatalogue(args[2]);
                            break;
                    }
                }

                Delivery cargo = fruitBase.takeOrder(args);
                final BigDecimal maxPrice = cargo.getFruits().stream().map(Fruit::getPrice)
                        .max(BigDecimal::compareTo).orElse(BigDecimal.ZERO);
                customers.add(new UniqueCustomer("Давид"));
                customers.add(new FreshCustomer("Эдуард"));
                customers.add(new Customer("Олег") {
                    @Override
                    public void takeFruits(Delivery cargo) {
                        List<Fruit> expensiveFruits = new ArrayList<>();
                        for (int i = 0; i < cargo.getFruits().size(); i++) {
                            Fruit fruit = cargo.getFruits().get(i);
                            if (fruit.getPrice().compareTo(maxPrice.multiply(BigDecimal.valueOf(0.75))) >= 0) {
                                expensiveFruits.add(fruit);
                                cargo.removeFruit(fruit);
                                i--;
                            }
                        }
                        purchases.addAll(expensiveFruits);
                    }
                });
                for (Customer customer : customers) {
                    customer.takeFruits(cargo);
                    customer.printPurchases();
                }
            } else {
                System.out.println("Нет введённых аргументов");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Не найден файл");
        } catch (IOException e) {
            System.out.println("Ошибка при экспорте каталога");
        } catch (ClassNotFoundException e) {
            System.out.println("Невозможно импортировать каталог из файла : неподдерживаемая версия");
        } catch (NoSuchElementException e) {
            System.out.println("Фрукты закончились");

        }
    }

    private static String extractPath(String arg) {
        String[] argumentParts = arg.split("=");
        String path = "defaultCatalogue.file";
        if (argumentParts.length == 2) {
            path = argumentParts[1];
        }
        return path;
    }
}