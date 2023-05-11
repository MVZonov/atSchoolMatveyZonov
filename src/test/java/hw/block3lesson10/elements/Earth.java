package hw.block3lesson10.elements;

import hw.block3lesson10.elements.subElements.*;

public class Earth extends NatureElement {
    @Override
    public NatureElement connect(NatureElement element) {
        if (element instanceof Fire) {
            System.out.println("Earth + Fire = Lava");
            return new Lava();
        } else if (element instanceof Air) {
            System.out.println("Earth + Air = Dust");
            return new Dust();
        } else if (element instanceof Earth) {
            System.out.println("Earth + Earth = Pressure");
            return new Pressure();
        } else if (element instanceof Water) {
            System.out.println("Earth + Water = Mud");
            return new Mud();
        } else throw new UnsupportedOperationException("нельзя соединить элементы");
    }
}