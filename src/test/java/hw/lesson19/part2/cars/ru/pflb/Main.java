package hw.lesson19.part2.cars.ru.pflb;

import hw.lesson19.part2.cars.ru.pflb.details.Engine;
import hw.lesson19.part2.cars.ru.pflb.professions.Driver;
import hw.lesson19.part2.cars.ru.pflb.vehicles.*;

public class Main {
    public static void main(String[] args) {
        Person carDriver = new Driver("Макс", 19, 1, 1234);
        Person lorryDriver = new Driver("Дядя Ваня", 65, 63, 7898);
        Person sportCarDriver = new Driver("Colin McRae", 39, 21, 6467);
        Engine carEngine = new Engine("Renault", 100);
        Engine lorryEngine = new Engine("Камаз", 154);
        Engine sportCarEngine = new Engine("ВАЗ", 77);
        Car car = new Car("Рено Логан", VehicleClass.SMALL, 1100, carDriver, carEngine);
        Lorry lorry = new Lorry("Kamaz", VehicleClass.SPORTS_CAR, 2500, lorryDriver, lorryEngine, LoadingAmount.LARGE);
        SportCar sportCar = new SportCar("Tesla model S", VehicleClass.LARGE, 1100, sportCarDriver, sportCarEngine, 549);
        System.out.println(car);
        System.out.println(lorry);
        System.out.println(sportCar);
    }
}
