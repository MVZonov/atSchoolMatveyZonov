/*родительский класс всех элементов NatureElement
      содержит метод connect, который в качестве параметра получает другой NatureElement
          содержит пустое тело
      содержит статический метод create
          в качестве параметра принимает строку - название базового элемента
          по названию создает базовый элемент
          если название неизвестно, то печатается сообщение "Неизвестный элемент" и возвращается null.*/
package hw.block3lesson10.elements;

import hw.block3lesson10.elements.subElements.*;

import java.util.NoSuchElementException;

public abstract class NatureElement {
    public NatureElement connect(NatureElement element) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    };

    public static NatureElement create(String elementName) throws NoSuchElementException {
        switch (elementName) {
            case "Fire":
                return new Fire();
            case "Air":
                return new Air();
            case "Earth":
                return new Earth();
            case "Water":
                return new Water();
            case "Mud":
                return new Mud();
            case "Dust":
                return new Dust();
            case "Energy":
                return new Energy();
            case "Lava":
                return new Lava();
            case "Pressure":
                return new Pressure();
            case "Rain":
                return new Rain();
            case "Sea":
                return new Sea();
            case "Steam":
                return new Steam();
            default:
                throw new NoSuchElementException();
        }
    }
}