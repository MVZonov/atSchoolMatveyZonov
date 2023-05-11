package hw.lesson43;

public class Task4 {
//    В программу через аргументы командной строки передаются
//    три натуральных числа – стороны треугольника.
//    Необходимо определить тип треугольника с данными сторонами
//            (остроугольный, тупоугольный, прямоугольный)
//    вывести одно из слов:
//            - right для прямоугольного треугольника,
//- acute для остроугольного треугольника,
//- obtuse для тупоугольного треугольника
//- или impossible, если входные числа не образуют треугольника.
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        if (a - b > c || a - c < b || b - c < a || b - a < c || c - a < b || c - b < a)
        {
            System.out.println("impossible");
        }
        else if (a * a == (b * b + c * c)) System.out.println("right");
        else if (a * a > (b * b + c * c)) System.out.println("obtuse");
        else if (a * a < (b * b + c * c)) System.out.println("acute");
    }
}
