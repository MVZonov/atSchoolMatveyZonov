package hw.lesson54;

public class Task5 {
//    Напишите метод "static boolean isInteger(String str)", который получает на вход строку и возвращает true, если строка str состоит только из цифр.
//    С использованием этого метода напишите программу,
//    которая проверяет является ли строка, переданная через аргументы командной строки, целым числом, и выводит результат проверки.
//    Проверку на наличие аргументов делать не надо.
//            Например:
//            1)
//    Входная строка: "1234567890"
//    Вывод: Строка является целым числом
//2)
//    Входная строка: "1,234E567890"
//    Вывод: Строка не является целым числом
public static void main(String[] args) {
    String test = args[0];
    if (isInteger(test)) {
        System.out.println("Строка является целым числом");
    } else {
        System.out.println("Строка не является целым числом");
    }
}
    static boolean isInteger(String str) {
        boolean isOnlyDigits = true;
        for (int i = 0; i < str.length() && isOnlyDigits; i++) {
            if (!Character.isDigit(str.charAt(i))) {
                isOnlyDigits = false;
            }
        }
        return isOnlyDigits;
    }
}
