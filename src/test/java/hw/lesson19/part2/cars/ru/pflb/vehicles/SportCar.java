package hw.lesson19.part2.cars.ru.pflb.vehicles;

import hw.lesson19.part2.cars.ru.pflb.Person;
import hw.lesson19.part2.cars.ru.pflb.details.Engine;

public class SportCar extends Car {
    int maxVelocity;

    public SportCar(String model, VehicleClass vehicleClass, int weight, Person driver, Engine engine, int maxVelocity) {
        super(model, vehicleClass, weight, driver, engine);
        this.maxVelocity = maxVelocity;
    }

    @Override
    public String toString() {
        return "Модель: " + getModel() + "\n" +
                "Класс: " + getVehicleClass() + "\n" + "Характеристики:\n" +
                "Вес(кг): " + getWeight() + "\n" +
                "Максималььная скорость(км/ч): " + maxVelocity + "\n" +
                "Двигатель: " + getEngine() + "\n" +
                "Водитель: " + getDriver() + "\n\n";
    }
}
