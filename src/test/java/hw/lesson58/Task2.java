package hw.lesson58;

public class Task2 {
//    Через аргументы командной строки передаются "слова" - последовательность строчных латинских букв и цифр. Каждый аргумент - отдельное "слово".
//    Напишите программу, которая выводит слова наибольшей длины.
//    Сделайте проверку на наличие аргументов командной строки.
//    Если аргументы не переданы, то выведите соответствующее сообщение и завершите программу.
//    Сделайте проверку, что "слова" состоят только из строчных латинских букв и цифр.
//    Иначе выведите сообщение об ошибке и завершите программу.
//    Например:
//    Ввод: 123 abcd b33f 0s 12
//    Вывод: abcd b33f
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Введено " + args.length + " аргументов командной строки.");
        } else {
            String[] strArray = new String[args.length];
            for (int i = 0; i < args.length; i++) {
                strArray[i] = (args[i]);
            }
//            Проверка на слова:
            for (int i = 0; i < strArray.length; i++) {
                for (int j = 0; j < strArray[i].length() - 1; j++) {
                    if (!((strArray[i].charAt(j) >= 'a' && strArray[i].charAt(j) <= 'z') ||
                            (strArray[i].charAt(j) >= '0' && strArray[i].charAt(j) <= '9'))) {
                        System.out.println("Программа остановлена. Вы ввели недопустимые символы или символ.\n" +
                                "Возможно использование только строчных латинских букв и цифр.");
                        System.exit(0);
                    }
                }
            }
//            Вывод массива:
            for (int i = 0; i < strArray.length; i++) {
                System.out.print(strArray[i] + " ");
            }
//            Вывод слов наибольшей длины:
            System.out.println();
            int maxLengthString = 0;
            for (int i = 0; i < strArray.length; i++) {
                if (strArray[i].length() > maxLengthString) {
                    maxLengthString = strArray[i].length();
                }
            }
            for (int i = 0; i < strArray.length; i++) {
                if (strArray[i].length() == maxLengthString) {
                    System.out.println(strArray[i]);
                }
            }
        }
    }
}