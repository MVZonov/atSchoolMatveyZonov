package hw.fruitbase.fruits;

import hw.fruitbase.Fruit;

import java.math.BigDecimal;

public class Orange extends Fruit {
    public Orange(double weight, BigDecimal price) {
        super("Orange", weight, price, Freshness.FRESH);

    }
}
