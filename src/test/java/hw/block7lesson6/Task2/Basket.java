package hw.block7lesson6.Task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;


public class Basket<T extends Plant> {
    private HashMap<T, Void> items = new HashMap<>();

    public void addItem(T item) {
        items.put(item, null);
    }

    public Iterator<T> iterator() {
        return items.keySet().iterator();
    }
}