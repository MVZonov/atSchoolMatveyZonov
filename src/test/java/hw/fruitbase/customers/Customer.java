package hw.fruitbase.customers;

import hw.fruitbase.Cargo;
import hw.fruitbase.Delivery;
import hw.fruitbase.Fruit;
import java.util.*;

public abstract class Customer {
    protected List<Fruit> purchases;
    protected String name;

    public Customer(String name) {
        this.purchases = new ArrayList<>();
        this.name = name;
    }

    public abstract void takeFruits(Delivery cargo);

    public void printPurchases() {
        System.out.println("Покупки покупателя " + name + ":");
        for (Fruit purchase : purchases) {
            System.out.println(purchase);
        }
    }
}

