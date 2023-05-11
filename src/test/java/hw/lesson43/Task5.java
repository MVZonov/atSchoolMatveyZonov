package hw.lesson43;

public class Task5 {
    //    Товар стоит a руб. b коп. За него заплатили c руб. d коп.
//    Напишите программу, расчитывающую сдачу.
//    Целые числа a, b, c, d передаются через аргументы командной строки.
//    Проверку на наличие аргументов делать не надо.
//    Нужно добавить проверку, что числа больше или равны нулю.
//    В противном случае нужно вывести пользователю сообщение об ошибке,
//    и завершить программу.
//    Так же нужно проверить, что уплаченной суммы хватает для оплаты товара.
//    В противном случае нужно вывести соответствующее сообщение и завершить программу.
//    Формат вывода:
//    Сдача составит e рублей и f копеек.
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int d = Integer.parseInt(args[3]);
        int totalKopeksPrice = a * 100 + b;
        int totalKopecsGiven = c * 100 + d;
        int finalChangeRubles = (totalKopecsGiven - totalKopeksPrice) / 100;
        int finalChangeKopeks = (totalKopecsGiven - totalKopeksPrice) % 100;
        if (a < 0 || b < 0 || c < 0 || d < 0) {
            System.out.println("Одно или несколько введённых значений отрицательные.");
        } else if (totalKopeksPrice > totalKopecsGiven) {
            System.out.println("Не хвататет денег.");
        } else
            System.out.println("Сдача: " + finalChangeRubles + " Руб, " + finalChangeKopeks + " Коп.");
    }
}
