package hw.lesson54;

public class Task1 {
//    В классе объявлена статическая переменная строкого типа со значением (кавычки не включены):
//            «Циклом называется многократное выполнение одних и тех же действий.»
//    Используя только методы класса String (без циклов, условий), напишите программу, которая печатает количество букв (без пробелов и точки)
//    в переменной до определенного символа (не включая его).
//    Значение символа передается через аргумент командной строки.
//            Пример:
//    Через аргументы передается "Ц", Вывод: 0.
//    Через аргументы передается "а", Вывод: 7.
//    Через аргументы передается ".", Вывод: 57.

//    Для чего создаёшь стринг как объект, а не используешь литераллы? Мы рассказывали зачем и как нужно создавать строки
//    про хранение в памяти. используй pool строк
    static String s = "Циклом называется многократное выполнение одних и тех же действий.";

    public static void main(String[] args) {
        String a = args[0];
        System.out.println(s.replace(" ", "").indexOf(a));
        System.out.println(s);
    }
}