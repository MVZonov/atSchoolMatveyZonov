package hw.lesson39;

import static hw.lesson39.Animal.testStaticMethod;

public class Main {
    public static void main(String[] args) {
        Cat murka = new Cat(9, "Зелёный", "Тигровый");
        Cat barsik = new Cat(11);
        Cat fenya = new Cat("Красный злой");
        Cat schustrik = new Cat(3,"Голубой");
        Cat fat = new Cat(19, "Зелёный", 22,"Тигровый");
        System.out.println("Мурке " + murka.age + " лет.");
        System.out.println("Барсику " + barsik.age + " лет.");
        System.out.println("Глаза Фени цвета: " + fenya.eyeСolor + ".");
        System.out.println("Шустрику "+schustrik.age+" года, глаза цвета: "+schustrik.eyeСolor+".");
        System.out.println(fat);
//Задание 3:
        Animal.testStaticMethod();
        Cat.testStaticMethod();
        testStaticMethod();
//Задание 4:
        System.out.println(Animal.planet);
        Cat.planet="Луна";
        System.out.println(Cat.planet);
        System.out.println(Animal.planet);
    }
}
