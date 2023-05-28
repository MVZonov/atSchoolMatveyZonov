package hw.block7lesson9.Task1;

import java.util.HashMap;
import java.util.Iterator;


public class Basket<T extends Plant> {
    private HashMap<T, Void> items = new HashMap<>();

    public void addItem(T item) {
        items.put(item, null);
    }

    public Iterator<T> iterator() {
        return items.keySet().iterator();
    }
}