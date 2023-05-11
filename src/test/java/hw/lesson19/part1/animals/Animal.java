package hw.lesson19.part1.animals;

public abstract class Animal {
    String name;
    String food;
    int foodCounter;
    String location;
    int counter;
    HealthState state;

    public Animal(String name, String food, int foodCounter, String location, int counter, HealthState state) {
        this.name = name;
        this.food = food;
        this.foodCounter = foodCounter;
        this.location = location;
        this.counter = counter;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public abstract void makeSound();

    public abstract void eat(int feed);

    public void sleep() {
        System.out.println("Животное спит, не беспокоить!" + "\n");
    }

    @Override
    public String toString() {
        return "Кличка: " + name + ",\n" +
                "Страна обитания: " + location + ",\n" +
                "Состояние здоровья: " + state.getHealth() + ",\n" +
                "Сколько особей: " + counter;
    }
}
