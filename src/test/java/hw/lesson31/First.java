package hw.lesson31;

public class First {
    public static void main(String[] args) {
        //        Даны две целые переменные a, b. Напишите программу, после исполнения которой значения переменных поменялись бы местами (новое значение a равно старому значению b и наоборот).
//                Выведите исходные значения и результат. Например:
//        Дано: a = 4, b = 5
//        После перестановки: a = 5, b = 4

        int a = 4, b = 5, c = a;
        a = b;
        b = c;
        System.out.println(a + " " + b);
    }
}
