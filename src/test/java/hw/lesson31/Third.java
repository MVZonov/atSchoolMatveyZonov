package hw.lesson31;

public class Third {
    public static void main(String[] args) {
//        Напишите программу, которая получает два положительных числа через программные аргументы командной строки и
//        выводит true, если первое из чисел нацело делится на другое. Проверку на кол-во введенных аргументов делать не надо.
//        Попробуйте решить задание без использования if.
//        Проверку на кол-во введенных аргументов делать не надо.
//        Выведите исходные значения и результат. Например:
//        1)Дано: a = 4, b = 5
//        false
//        2)Дано: a = 15, b = 5
//        true

        int a2 = Integer.parseInt(args[0]);
        int b2 = Integer.parseInt(args[1]);
        int a3 = Integer.parseInt(args[2]);
        int b3 = Integer.parseInt(args[3]);
        System.out.println("Аргумент1: " + args[0] + ", Аргумент2: " + args[1] + ", Аргумент3: " + args[2] + ", Аргумент4: " + args[3]);
        boolean first = (a2 % b2) == 0;
        boolean second = (a3 % b3) == 0;
        System.out.println("Дано: a2 = 4, b2 = 5. Результат: " + first);
        System.out.println("Дано: a3 = 15, b3 = 5. Результат: " + second);
    }
}
