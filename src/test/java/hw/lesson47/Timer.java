package hw.lesson47;

public class Timer {
    //    Реализуйте класс Timer, который содержит:
//            - целочисленное поле seconds - общее число секунд, устанавливается в конструкторе
//- статический метод void waitSecond() - метод реализует паузу
//    одной секунды. Реализовать с помощью цикла.
//            - метод printTime вывода оставшегося времени в минутах и секундах.
//- объектный метод start() - запускает обратный отсчет
//    и каждую секунды выводит оставшееся количество секунд.
//    Напишите программу-таймер обратного отсчета в минутах и секундах,
//    используя созданные класс Timer.
//    Через аргументы командной строки передается число секунд.
//    Проверку на наличие аргумента делать не надо.
//    Нужно проверить, что введенное число больше или равно нуля.
//    В противном случае выведите сообщение об ошибке
//    и завершите программу.
//            Например, для 61 секунды формат вывода:
//            01:01
//            01:00
//            00:59
//            ...
//            00:01
//            00:00
    int second;

    Timer(int s) {
        this.second = s;
    }

    public static void main(String[] args) {
        int second = Integer.parseInt(args[0]);
        Timer timer = new Timer(second);
        if (second >= 0) {
            timer.start();
        } else {
            System.out.println("Введённое число меньше 0.");
        }
    }

    public static void waitSecond() {
        for (int i = 0; i < 1; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        }
    }

    public void printTime(int s) {
        int min = s / 60;
        int sec = s % 60;
        String formattedMin = String.format("%02d", min);
        String formattedSec = String.format("%02d", sec);
        System.out.println(formattedMin + ":" + formattedSec);

    }

    public void start() {
        for (int i = second; i >= 0; i--) {
            printTime(second);
            waitSecond();
            second--;
        }
    }
}
