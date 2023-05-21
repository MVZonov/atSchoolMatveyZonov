package hw.block7lesson6.Task3;

import hw.block7lesson6.Task3.fruits.Apple;
import hw.block7lesson6.Task3.fruits.Banana;
import hw.block7lesson6.Task3.vegitables.Cucumber;
import hw.block7lesson6.Task3.vegitables.Tomato;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<Plant> plants = new ArrayList<>();
        plants.add(new Apple());
        plants.add(new Banana());
        plants.add(new Tomato());
        plants.add(new Cucumber());

        Map<String, Plant> plantMap = new HashMap<>();
        plants.forEach((plant) -> plantMap.put(plant.getName(), plant));
        plantMap.forEach((name, plant) -> System.out.println(name + " " + plant.getClass().getSimpleName()));
    }
}

