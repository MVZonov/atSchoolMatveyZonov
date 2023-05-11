package hw.lesson47;

import java.util.Objects;

public class Task5 {
    //    Реализуйте класс Calculator со статическими методами:
//            - int add(int x, int y) - выполнение x + y
//- int sub(int x, int y) - выполнение x - y
//- int mult(int x, int y) - выполнение x * y
//- int divide(int x, int y) - выполнение x / y.
//    Имеет проверку y == 0 или нет.
//    Если равно, то пишется сообщение, что операция не может быть выполнена,
//    и программа завершается, используя System.exit(0);
//    Используя класс Calculator, напишите программу, которая будет
//    получать через аргументы командной строки два целых числа,
//    знак операции и после этого выводить результат операции.
//    через аргументы командной строки.
//    Пример ввода аргументов:
//            10 + 12
//            10 - 12
//            10 * 12
//            10 / 0
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        String action = args[1];
        int y = Integer.parseInt(args[2]);
        switch (action) {
            case "+":
                System.out.println(add(x, y));
                break;
            case "-":
                System.out.println(sub(x, y));
                break;
            case "*":
                System.out.println(mult(x, y));
                break;
            case "/":
                System.out.println(divide(x, y));
                break;
            default:
                System.out.println("Операция не поддерживается.\nСписок поддерживаемых операций: + - * /");
        }
    }

    static int add(int x, int y) {
        return x + y;
    }

    static int sub(int x, int y) {
        return x - y;
    }

    static int mult(int x, int y) {
        return x * y;
    }

    static int divide(int x, int y) {
        if (y == 0) {
            System.out.println("Операция не может быть выполнена.");
            System.exit(0);
        }
        return x / y;
    }
}
