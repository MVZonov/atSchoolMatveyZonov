package hw.lesson19.part2.cars.ru.pflb.vehicles;

import hw.lesson19.part2.cars.ru.pflb.Person;
import hw.lesson19.part2.cars.ru.pflb.details.Engine;

public class Car {
    private String model;
    private VehicleClass vehicleClass;
    private int weight;
    private Person driver;
    private Engine engine;

    public String getModel() {
        return model;
    }

    public VehicleClass getVehicleClass() {
        return vehicleClass;
    }

    public int getWeight() {
        return weight;
    }

    public Person getDriver() {
        return driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public Car(String model, VehicleClass vehicleClass, int weight, Person driver, Engine engine) {
        this.model = model;
        this.vehicleClass = vehicleClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    @Override
    public String toString() {
        return "Модель: " + model + "\n" +
                "Класс: " + vehicleClass + "\n" + "Характеристики:\n" +
                "Вес(кг): " + weight + "\n" +
                "Двигатель: " + engine + "\n" +
                "Водитель: " + driver + "\n\n";
    }
}
