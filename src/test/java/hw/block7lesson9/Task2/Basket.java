package hw.block7lesson9.Task2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.stream.Collectors;


public class Basket<T extends Plant> {
    private HashMap<T, Void> items = new HashMap<>();

    public void addItem(T item) {
        items.put(item, null);
    }

    public Iterator<T> iterator() {
        return items.keySet().iterator();
    }

    public int size() {
        return items.size();
    }

    @Override
    public String toString() {
        return "Basket: " + items.keySet();
    }
}