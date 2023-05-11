package hw.lesson19.part2.cars.ru.pflb.details;

public class Engine {
    String vendor;
    int power;

    public Engine(String vendor, int power) {
        this.vendor = vendor;
        this.power = power;
    }

    public String getVendor() {
        return vendor;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "(" +
                "Производитель: " + vendor +
                ", Мощьность(Кв): " + power + ")";
    }
}
