package hw.lesson43;

public class Task3 {
//    Через аргументы командной строки передается число - года (целое, положительное, не превышает 30000).
//    Напишите программу вычисляющую является ли данный год високосным.
//    Напомним, что год является високосным, если его номер кратен 4, но не кратен 100, а также если он кратен 400.
//    Требуется вывести слово YES, если год является високосным и NO - в противном случае.
//    Проверку на наличие аргументов делать не надо.
//    Надо проверить, что переданное число находится в заданном диапазоне.
//    В противном случае нужно вывести пользователю сообщение об ошибке, и завершить программу.
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        if ((a % 4 == 0 & a % 100 != 0 | a % 400 == 0) & a <= 30000) System.out.println("Yes");
        else if (a > 30000) System.out.println("Введите число меньше или равно 30000");
        else System.out.println("No");
    }
}