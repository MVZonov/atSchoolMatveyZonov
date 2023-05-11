package hw.lesson47;

public class Task1 {
//    Напишите программу, которая получает два целых числа m и n
//    через аргументы командной строки и печатает целые числа x:
//    m <= x <= n, которые делятся на 3, но не делятся на 5.
public static void main(String[] args) {
    int m = Integer.parseInt(args[0]);
    int n = Integer.parseInt(args[1]);
    for(; m < n; m++) {
        if (m % 3 == 0 && m % 5 != 0) {
            System.out.println(m);
        }
    }
}
}
