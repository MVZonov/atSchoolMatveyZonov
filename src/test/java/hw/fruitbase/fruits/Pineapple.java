package hw.fruitbase.fruits;

import hw.fruitbase.Fruit;

import java.math.BigDecimal;

public class Pineapple extends Fruit {
    public Pineapple(double weight, BigDecimal price) {
        super("Pineapple", weight, price, Freshness.FRESH);

    }
}
