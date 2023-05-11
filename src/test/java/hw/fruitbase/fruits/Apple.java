package hw.fruitbase.fruits;

import hw.fruitbase.Fruit;

import java.math.BigDecimal;

public class Apple extends Fruit {
    public Apple(double weight, BigDecimal price) {
        super("Apple", weight, price, Freshness.FRESH);

    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
