package hw.fruitbase.customers;

import hw.fruitbase.Cargo;
import hw.fruitbase.Delivery;
import hw.fruitbase.Fruit;

import java.util.*;

public class UniqueCustomer extends Customer {


    public UniqueCustomer(String name) {
        super(name);
    }

    @Override
    public void takeFruits(Delivery cargo) {
        List<Fruit> uniqueFruits = new ArrayList<>();
        for (int i = 0; i < cargo.getFruits().size(); i++) {
            Fruit fruit = cargo.getFruits().get(i);
            if (!uniqueFruits.contains(fruit)) {
                uniqueFruits.add(fruit);
                cargo.removeFruit(fruit);
                i--;
            }
        }
        purchases.addAll(uniqueFruits);
    }
}