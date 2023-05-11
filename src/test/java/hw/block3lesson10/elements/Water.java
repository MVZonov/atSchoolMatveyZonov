package hw.block3lesson10.elements;

import hw.block3lesson10.elements.subElements.*;

public class Water extends NatureElement {
    @Override
    public NatureElement connect(NatureElement element) {
        if (element instanceof Fire) {
            System.out.println("Water + Fire = Steam");
            return new Steam();
        } else if (element instanceof Air) {
            System.out.println("Water + Air = Rain");
            return new Rain();
        } else if (element instanceof Earth) {
            System.out.println("Water + Earth = Mud");
            return new Mud();
        } else if (element instanceof Water) {
            System.out.println("Water + Water = Sea");
            return new Sea();
        } else if (element instanceof Energy) {
            System.out.println("Water + Energy = Steam");
            return new Steam();
        } else throw new UnsupportedOperationException("нельзя соединить элементы");
    }
}