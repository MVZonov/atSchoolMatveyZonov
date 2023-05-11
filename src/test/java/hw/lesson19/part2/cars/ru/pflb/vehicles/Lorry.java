package hw.lesson19.part2.cars.ru.pflb.vehicles;

import hw.lesson19.part2.cars.ru.pflb.Person;
import hw.lesson19.part2.cars.ru.pflb.details.Engine;

public class Lorry extends Car {
    LoadingAmount loadingAmount;

    public Lorry(String model, VehicleClass vehicleClass, int weight, Person driver, Engine engine, LoadingAmount loadingAmount) {
        super(model, vehicleClass, weight, driver, engine);
        this.loadingAmount = loadingAmount;
    }

    @Override
    public String toString() {
        return "Модель: " + getModel() + "\n" +
                "Класс: " + getVehicleClass() + "\n" + "Характеристики:\n" +
                "Вес(кг): " + getWeight() + "\n" +
                "Грузоподъемность(кг): " + loadingAmount + "\n" +
                "Двигатель: " + getEngine() + "\n" +
                "Водитель: " + getDriver() + "\n\n";
    }
}
