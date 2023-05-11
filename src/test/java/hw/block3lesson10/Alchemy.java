package hw.block3lesson10;

import hw.block3lesson10.elements.NatureElement;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import static hw.block3lesson10.elements.NatureElement.create;

public class Alchemy {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Необходимо передать как минимум два аргумента");
            return;
        }

        List<NatureElement> elements = new ArrayList<>();

        try {
            for (int i = 0; i < args.length; i++) {
                String arg = args[i];
                NatureElement element = create(arg);
                elements.add(element);
            }
        } catch (NoSuchElementException e) {
            System.out.println("Неизвестный элемент");
            e.printStackTrace();
            return;
        }

        if (!(elements.size() % 2 == 0)) {
            System.out.println("Для одного из аргументов нет пары. Программа завершена.");
            return;
        }

        for (int i = 0; i < elements.size() - 1; i += 2) {
            try {
                NatureElement result = elements.get(i).connect(elements.get(i + 1));
                System.out.println("Результат: " + result.getClass().getSimpleName());
            } catch (UnsupportedOperationException e) {
                System.out.println("Ошибка: " + e.getMessage() + " " + elements.get(i).getClass().getSimpleName() + " и " +
                        elements.get(i + 1).getClass().getSimpleName());
            }
        }
    }
}

