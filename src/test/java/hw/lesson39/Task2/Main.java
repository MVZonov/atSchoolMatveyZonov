package hw.lesson39.Task2;
public class Main {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;
        double x = 1.1, y = 2.2, z = 3.3;
        Summa summa = new Summa();
        System.out.println(summa.sum(a, b));
        System.out.println(summa.sum(a, b, c));
        System.out.println(summa.sum(x, y));
        System.out.println(summa.sum(x, y, z));
        System.out.println(summa.sum(a, x, y));
    }
}
