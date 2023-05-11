package hw.lesson19.part1.animals;

public class Horse extends Animal {
    private static int horseCounter;
    public Horse(String name, String food, int foodCounter, String location, int counter, HealthState state) {
        super(name, food, foodCounter, location, counter, state);
        horseCounter++;
    }

    @Override
    public void makeSound() {
        System.out.println("Иго-го поёт лошадка!" + "\n");
    }

    public void eat(int feed) {
        this.foodCounter -= feed;
        System.out.println("Лошадь ест " + food + ", Остаток еды: " + foodCounter + "." + "\n");
    }

    @Override
    public String toString() {
        return "Вид: Лошадь," + "\n" +
                "Кличка: " + name + ",\n" +
                "Страна обитания: " + location + ",\n" +
                "Состояние здоровья: " + state.getHealth() + ",\n" +
                "Сколько особей: " + horseCounter + "\n";
    }
}


