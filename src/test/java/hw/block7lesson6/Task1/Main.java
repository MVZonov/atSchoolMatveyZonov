package hw.block7lesson6.Task1;

import hw.block7lesson6.Task1.fruits.*;
import hw.block7lesson6.Task1.vegitables.*;

public class Main {
    public static void main(String[] args) {
        Fruit apple = new Apple();
        Fruit banana = new Banana();
        Vegetable cucumber = new Cucumber();
        Vegetable tomato = new Tomato();

        Basket<Fruit> fruitBasket = new Basket<>();
        Basket<Vegetable> vegetableBasket = new Basket<>();

        fruitBasket.addItem(apple);
        fruitBasket.addItem(banana);
        vegetableBasket.addItem(cucumber);
        vegetableBasket.addItem(tomato);
        System.out.println(fruitBasket);
        System.out.println(vegetableBasket);
    }
}