package hw.lesson54;

public class Task2 {
    //    Через аругмент командной строки передается строка - путь до некоторого файла -
//    содержащая знак «/» или «\». Например, "/bin/java" или "C:\Program Files\Java\bin\java".
//    Напишите программу, которая для обоих вариантов разделителей, может вывести отдельно путь и имя файла.
//    Если имя файла отсутствует, т.е. строка оканчивается на "\" или "/",
//    то выдать ошибку: "Введен некорректный путь до файла."
//    Пример:
//            1) Через аргументы передается "/bin/java", выводится:
//    Путь: /bin/
//    Имя файла: java
//2) Через аргументы передается "C:\Program Files\Java\bin\java", выводится:
//    Путь: C:\Program Files\Java\bin\
//    Имя файла: java
//3) Через аргументы передается "/", выводится:
//    Введен некорректный путь до файла.
//    Проверку на наличие и корректность аргумента делать не надо.
    static void action(String a, int b) {
        System.out.println("Путь: " + a.substring(0, b + 1));
        System.out.println("Имя файла: " + a.substring(b + 1));
    }
    public static void main(String[] args) {
        String a = args[0];
        int last1 = a.lastIndexOf("/");
        int last2 = a.lastIndexOf("\\");
        if (a.endsWith("/") || a.endsWith("\\")) {
            System.out.println("Введен некорректный путь до файла.");
        } else {
            if (last2 > 0) {
                action(a, last2);
            } else if (last1 > 0) {
                action(a, last1);
            } else {
                System.out.println("Проверьте правильность ввода.");
            }
        }
    }
}
