package hw.fruitbase.customers;

import hw.fruitbase.Cargo;
import hw.fruitbase.Delivery;
import hw.fruitbase.Fruit;

import java.util.ArrayList;
import java.util.List;

public class FreshCustomer extends Customer {

    public FreshCustomer(String name) {
        super(name);
    }

    @Override
    public void takeFruits(Delivery cargo) {
        List<Fruit> freshFruits = new ArrayList<>();
        for (int i = 0; i < cargo.getFruits().size(); i++) {
            Fruit fruit = cargo.getFruits().get(i);
            if (fruit.isFresh()) {
                freshFruits.add(fruit);
                cargo.removeFruit(fruit);
                i--;
            }
        }
        purchases.addAll(freshFruits);
    }
}
