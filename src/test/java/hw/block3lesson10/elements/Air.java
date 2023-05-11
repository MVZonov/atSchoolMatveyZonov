package hw.block3lesson10.elements;

import hw.block3lesson10.elements.subElements.*;

public class Air extends NatureElement {
    @Override
    public NatureElement connect(NatureElement element) {
        if (element instanceof Fire) {
            System.out.println("Air + Fire = Energy");
            return new Energy();
        } else if (element instanceof Air) {
            System.out.println("Air + Air = Pressure");
            return new Pressure();
        } else if (element instanceof Earth) {
            System.out.println("Air + Earth = Dust");
            return new Dust();
        } else if (element instanceof Water) {
            System.out.println("Air + Water = Rain");
            return new Rain();
        } else throw new UnsupportedOperationException("нельзя соединить элементы");
    }
}

