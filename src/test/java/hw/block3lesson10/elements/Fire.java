package hw.block3lesson10.elements;

import hw.block3lesson10.elements.subElements.Energy;
import hw.block3lesson10.elements.subElements.Lava;
import hw.block3lesson10.elements.subElements.Steam;

public class Fire extends NatureElement {
    @Override
    public NatureElement connect(NatureElement element) {
        if (element instanceof Fire) {
            System.out.println("Fire + Fire не производит новый элемент");
            return new Fire();
        } else if (element instanceof Air) {
            System.out.println("Fire + Air = Energy");
            return new Energy();
        } else if (element instanceof Earth) {
            System.out.println("Fire + Earth = Lava");
            return new Lava();
        } else if (element instanceof Water) {
            System.out.println("Fire + Water = Steam");
            return new Steam();
        } else throw new UnsupportedOperationException("нельзя соединить элементы");
    }
}