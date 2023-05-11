package hw.lesson31;

public class Fourth {
    public static void main(String[] args) {
//        Напишите программу, которая вычисляет и выводит сумму, которую вы получите через t лет при размещении суммы P
//        на счете под ежегодный процент r.
//                Это расчитывается по формуле: P*e^(r*t).
//                Для вычисления экспоненты воспользуйтесь функцией стандартной библиотеки Math.exp(). Значение суммы P,
//        процент r и кол-во лет t необходимо получать через аргументы командной строки. Проверку на кол-во введенных аргументов делать не надо.
//                Например:
//        1)Дано: P = 40000, r = 5, t = 5
//        51361.016667509655

        double P= Double.parseDouble((args[0]));
        double r = Double.parseDouble((args[1]));
        double t = Double.parseDouble((args[2]));
        double x = Math.exp(r*t);
        System.out.println(P*x);
    }
}
