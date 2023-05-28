package hw.block7lesson9.Task1;

import hw.block7lesson9.Task1.fruits.*;
import hw.block7lesson9.Task1.vegitables.*;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Plant> plants = new ArrayList<>();
        plants.add(new Apple());
        plants.add(new Banana());
        plants.add(new Tomato());
        plants.add(new Cucumber());

        ArrayList<Fruit> multifruit = plants.stream()
                .filter(p -> p instanceof Fruit)
                .map(p -> (Fruit) p)
                .collect(Collectors.toCollection(ArrayList::new));

        multifruit.forEach(f -> System.out.println(f.getName()));
    }
}

