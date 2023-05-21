package hw.block7lesson6.Task2;

import hw.block7lesson6.Task2.fruits.Apple;
import hw.block7lesson6.Task2.fruits.Banana;
import hw.block7lesson6.Task2.fruits.Fruit;
import hw.block7lesson6.Task2.vegitables.Cucumber;
import hw.block7lesson6.Task2.vegitables.Tomato;
import hw.block7lesson6.Task2.vegitables.Vegetable;

import java.util.Iterator;

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
        makeSalad(fruitBasket);
        makeSalad(vegetableBasket);
    }

    public static void makeSalad(Basket<? extends Plant> basket) {
        System.out.println("Готовим салатик:");
        Iterator<? extends Plant> iterator = basket.iterator();
        while (iterator.hasNext()) {
            Plant plant = iterator.next();
            System.out.println("Режем " + plant.getName());
        }
        System.out.println("Угощайся!");
    }
}

