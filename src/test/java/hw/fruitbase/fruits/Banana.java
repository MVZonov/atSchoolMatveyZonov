package hw.fruitbase.fruits;

import hw.fruitbase.Fruit;

import java.math.BigDecimal;

public class Banana extends Fruit {
    public Banana(double weight, BigDecimal price) {
        super("Banana", weight, price, Freshness.FRESH);
    }
}
