package hw.block3lesson10.elements.subElements;

import hw.block3lesson10.elements.NatureElement;
import hw.block3lesson10.elements.Water;

public class Energy extends NatureElement {
    @Override
    public NatureElement connect(NatureElement element) throws UnsupportedOperationException {
        if (element instanceof Water) {
            System.out.println("Energy + Water = Steam");
            return new Steam();
        } else throw new UnsupportedOperationException("нельзя соединить элементы");
    }
}
