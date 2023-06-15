package hw.block7lesson9.Task2.vegitables;

public class Tomato implements Vegetable {
    String name = "Томат";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " " + getClass().getSimpleName();
    }
}
