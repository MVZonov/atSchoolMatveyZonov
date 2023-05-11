package hw.lesson47;

public class Task4 {
    //    В основном классе программы объявлена и инициализиована целочисленная переменная n.
//    Реализуйте метод boolean isPrime(int x), который возвращает true, если x - простое число.
//    Реализуйте метод int nextInt(int x),
//    который возвращает случайно сгенерированное целое число от 0 до x, x не включая.
//    Используя эти методы, напишите программу, которая генерит целые
//    числа до тех пор, пока не сгенерит простое число.
//    Для генерации простых чисел можно пользоваться классом
//    java.lang.Math или java.util.Random.
    public static void main(String[] args) {
        int x = 564;
        int random = nextInt(x);
        while (isPrime(random) == false) {
            random = nextInt(x);
        }
        System.out.println(random);
    }

    static boolean isPrime(int x) {
        if (x < 2) {
            return false;
        }
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }


    static int nextInt(int x) {
        int randomNumber = (int) (Math.random() * x);
        return randomNumber;
    }
}

//    static int nextInt(int x) {
//        int randomNumber = return randomNumber;
//    }
//return (int) (Math.random() * x);


