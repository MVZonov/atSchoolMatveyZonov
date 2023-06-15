package hw.block7lesson9.Task2.vegitables;

import hw.block7lesson9.Task2.Plant;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<String, Plant> plantMap = new HashMap<>();
        Cucumber cucumber = new Cucumber();
        plantMap.put("a",cucumber);
        plantMap.put("df",cucumber);
        plantMap.put("a23",cucumber);
        plantMap.forEach((name, plant) -> System.out.println(name + " " + plant.getClass().getSimpleName()));
        String o = "J";
        String k = "J";
        System.out.println(o.hashCode());
        System.out.println(k.hashCode());
    }
}
