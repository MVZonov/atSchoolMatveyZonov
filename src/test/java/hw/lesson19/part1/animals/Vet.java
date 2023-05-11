package hw.lesson19.part1.animals;

public class Vet {
    String vetName;

    public Vet(String vetName) {
        this.vetName = vetName;
    }
    
    void treatAnimal(Animal animal) {
        if (animal.state == HealthState.BAD) {
            animal.state = HealthState.GOOD;
            System.out.println("Ветеринарный врач " + vetName + " вылечил: " + animal.name + ", состояние здоровья животного: " + animal.state + "." + "\n");
        }
    }
}
