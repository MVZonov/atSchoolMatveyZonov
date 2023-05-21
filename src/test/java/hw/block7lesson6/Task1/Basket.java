package hw.block7lesson6.Task1;

import hw.block7lesson6.Task1.fruits.Fruit;
import hw.block7lesson6.Task1.vegitables.Vegetable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Basket<T> {
    private final T[] items;

    public Basket() {
        items = (T[]) new Object[5];
    }

    public void addItem(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return;
            }
        }
    }

    @Override
    public String toString() {
        return "Basket{" +
                "items=" + Arrays.toString(items) +
                '}';
    }
}