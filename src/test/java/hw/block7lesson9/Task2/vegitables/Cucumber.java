package hw.block7lesson9.Task2.vegitables;


import java.util.Objects;

public class Cucumber implements Vegetable {
    String name = "Огурец";
    private static int counter = 0;

    public Cucumber() {
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cucumber cucumber = (Cucumber) o;
        return Objects.equals(name, cucumber.name);
    }

    @Override
    public int hashCode() {
        return counter++;
    }

    @Override
    public String toString() {
        return name + " " + getClass().getSimpleName();
    }
}
