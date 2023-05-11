package hw.block3lesson10.elements.subElements;

import hw.block3lesson10.elements.NatureElement;

public class Pressure extends NatureElement {
    @Override
    public NatureElement connect(NatureElement element) throws UnsupportedOperationException  {
        throw new UnsupportedOperationException("нельзя соединить элементы");
    }
}
