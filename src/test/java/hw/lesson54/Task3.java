package hw.lesson54;

public class Task3 {
//    Через аргумент командной строки передается строка.
//    Используя StringBuilder, напишите программу,
//    которая в переданной строке заменяет все нули на единицы и наоборот.
//    Остальные символы не должны изменится.
//    Выведите результирующую строку.
//    Пример аргумента: 01a10vt0101c
//    Вывод: 10a01vt1010c
//    Проверку на наличие и корректность аргумента делать не надо.
public static void main(String[] args) {
    StringBuilder sb = new StringBuilder(args[0]);
    System.out.println(sb);
    System.out.println(sb.toString().replace("1", "|.|").replace("0", "|#|").replace("|.|", "0").replace("|#|", "1"));
}
}
