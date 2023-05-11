package hw.lesson19.part1.animals;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Куки", "Brit premium", 44, "Химки", 1, HealthState.BAD);
        Cat cat = new Cat("Мурёшка", "Кити-кэт", 18, "Нижний Новгород", 1, HealthState.BAD);
        Cat cat1 = new Cat("Мурёшка1", "Кити-кэт", 18, "Нижний Новгород", 1, HealthState.BAD);
        Horse horse = new Horse("Конь", "Овёс", 165, "Москва", 1, HealthState.BAD);
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(horse);
        dog.makeSound();
        cat.makeSound();
        horse.makeSound();
        dog.eat(2);
        Vet vet = new Vet("Эрнст");
        vet.treatAnimal(dog);
        vet.treatAnimal(cat);
        vet.treatAnimal(horse);
        horse.sleep();
    }
}

