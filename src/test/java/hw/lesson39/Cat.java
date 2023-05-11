package hw.lesson39;

public class Cat extends Animal {
    int age;
    String eyeСolor;
    int weight;
    String furColor;

    public Cat(int age, String eyeСolor, String furColor) {
        this.age = age;
        this.eyeСolor = eyeСolor;
        this.furColor = furColor;
    }

    public Cat(int age) {
        this.age = age;
    }

    public Cat(int age, String eyeСolor) {
        this.age = age;
        this.eyeСolor = eyeСolor;
    }

    public Cat(String eyeСolor) {
        this.eyeСolor = eyeСolor;
    }

    public Cat(int age, String eyeСolor, int weight, String furColor) {
        this.age = age;
        this.eyeСolor = eyeСolor;
        this.weight = weight;
        this.furColor = furColor;
    }

    @Override
    public String toString() {
        return "Возраст кошки: " + age +
                ", цвет глаз: " + eyeСolor +
                ", окрас: " + furColor +
                ", вес: " + weight;
    }
}
