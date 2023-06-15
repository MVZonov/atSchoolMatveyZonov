package hw.block7lesson9.Task2;

import hw.block7lesson9.Task2.vegitables.Cucumber;
import hw.block7lesson9.Task2.vegitables.Tomato;

public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();
        Tomato tomato = new Tomato();
        Cucumber cucumber = new Cucumber();
        basket.addItem(tomato);
        basket.addItem(tomato);
        basket.addItem(cucumber);
        basket.addItem(cucumber);
        basket.addItem(cucumber);
        System.out.println(basket);
        System.out.println(basket.size());
    }
}

