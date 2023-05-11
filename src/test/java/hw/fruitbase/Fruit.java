package hw.fruitbase;

import hw.fruitbase.fruits.Freshness;

import java.io.Serializable;
import java.math.BigDecimal;

public abstract class Fruit implements Serializable  {
    /* Вес измеряется в кг и имеет тип double. Цена измеряется в у.е. и имеет тип BigDecimal
    содержит общедоступный метод по-умолчанию для получения значения веса getWeight
    содержит общедоступный метод по-умолчанию для получения значения цены getPrice
    содержит общедоступный метод по-умолчанию для получения значения цены getName
    */
    public double weight; //вес
    public BigDecimal price; //цена
    public String name; //название фрукта
    public Freshness freshness;
    private static final long serialVersionUID = 1L;

    public Fruit(String name, double weight, BigDecimal price, Freshness freshness) {
        this.weight = weight;
        this.price = price;
        this.name = name;
        this.freshness = freshness;
    }

    public double getWeight() {
        return weight;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
    public boolean isFresh() {
        return freshness.equals(Freshness.FRESH);
    }

    @Override
    public String toString() {
        return "Фрукт: " + name +
                ", вес: " + weight +
                ", цена: " + price ;
    }
}
