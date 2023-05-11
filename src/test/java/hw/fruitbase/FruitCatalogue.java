package hw.fruitbase;

import hw.fruitbase.fruits.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class FruitCatalogue implements Serializable {
    //    содержит поле массив Fruit - список записей известных фруктов
//    содержит конструктор без параметров
//        при создании во внутренний массив добавляются записи-экзмепляры известных фруктов
//    содержит метод findFruit, доступный только в пакете
//        по переданному слову проверяет есть ли информация о таком фрукте
//        если есть, то возвращает Fruit. Если нет, то возвращает null.
    List<Fruit> fruits;
    private static final long serialVersionUID = 1L;


    public FruitCatalogue() {
        fruits = Arrays.asList(
                new Apple(1, BigDecimal.valueOf(6.99)),
                new Orange(1, BigDecimal.valueOf(7.97)),
                new Banana(1, BigDecimal.valueOf(8.97)),
                new Pineapple(1, BigDecimal.valueOf(17.97)),
                new Fruit("Kiwi", 1, BigDecimal.valueOf(16.66), Freshness.FRESH){},
                new Fruit("Mango", 1, BigDecimal.valueOf(18.23), Freshness.FRESH){}
        );
    }

    public Fruit findFruit(String yourFruit) {
        for (int i = 0; i < fruits.size(); i++) {
            if (yourFruit.equals(fruits.get(i).getName())) {
                return fruits.get(i);
            }
        }
        return null;
    }


    @Override
    public String toString() {
        return "FruitCatalogue{" +
                "fruits=" + fruits +
                '}';
    }
}