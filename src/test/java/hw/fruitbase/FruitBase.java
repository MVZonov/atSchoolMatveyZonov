package hw.fruitbase;

import java.io.*;

public class FruitBase implements Serializable {
    //        содержит поле FruitCatalogue
//        содержит конструктор без параметров
//        в нем инициализируется поле FruitCatalogue
//        содержит общедоступный метод для обработки заказа takeOrder
//        в этом методе происходит поиск слов из заказа в FruitCatalogue
//        если хотя бы одно название найдено, то формируется груз Cargo с информацией о найденных фруктах
//        Если среди запроса не встретились известные названия,
//                то возвращается груз Cargo с нулевым количеством фруктов
//        содержит метод main
//        здесь происходит выполнение программы согласно описанию выше
//        основные шаги:
//        создается фруктовая база
//        проверяется наличие заказа от пользователя
//        если есть заказ, то он передается в метод takeOrder
//        выводим результат
    FruitCatalogue catalogue;
    private static final long serialVersionUID = 1L;
    String defaultFilePath = new File("").getAbsolutePath() + "\\save_catalogue.ser";

    public FruitBase() throws FileNotFoundException {
        catalogue = new FruitCatalogue();
    }

    public Delivery takeOrder(String[] order) {
        Delivery cargo = new Cargo();
        for (int i = 0; i < order.length; i++) {
            Fruit fruit = catalogue.findFruit(order[i]);
            if (fruit != null) {
                cargo.addFruit(fruit);
            }
        }
        return cargo;
    }

    public void exportCatalogue() throws IOException {
        exportCatalogue(defaultFilePath);
    }

    public void exportCatalogue(String filePath) throws IOException {
        FileOutputStream outputStream = new FileOutputStream(filePath);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(catalogue);
        objectOutputStream.close();
        System.out.println("Каталог экспортирован " + catalogue);

    }

    public void importCatalogue() throws IOException, ClassNotFoundException {
        importCatalogue(defaultFilePath);
    }

    public void importCatalogue(String filePath) throws IOException, ClassNotFoundException {
        FileInputStream intputStream = new FileInputStream(filePath);
        ObjectInputStream objectInputStream = new ObjectInputStream(intputStream);
        FruitCatalogue catalogue = (FruitCatalogue) objectInputStream.readObject();
        intputStream.close();
        this.catalogue = catalogue;
        System.out.println("Каталог импортирован " + catalogue);
    }
}



