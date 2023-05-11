package hw.lesson58;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Task5 {
//    Напишите программу, которая создает зубчатый массив целочисленных элементов, сгенеренных случайным образов в диапазоне -9 до 9.
//    Массив должен содержать не более 5 строк и каждая строка иметь не более 7 столбцов.
//    Выведите массив на экран в порядке убывания сумм элементов строк.
    public static void main(String[] args) {
        int row = ((int) (Math.random() * 4) + 1);
        int[][] raggedArr = new int[row][];
        for (int i = 0; i < row; i++) {
            int columns = ((int) (Math.random() * 6) + 1);
            int[] innerArray = new int[columns];
            fillArray(innerArray);
            raggedArr[i] = innerArray;
        }
        for (int[] rows : raggedArr) {
            System.out.println(Arrays.toString(rows));
        }
//        Сложение элементов:
        for (int[] ints : raggedArr) {
            int total = IntStream.of(ints).sum();
            System.out.println(total);
        }
//        Сортировка:
        boolean isSorted = false;
        int[] buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < raggedArr.length - 1; i++) {
                if (rowSumm(raggedArr[i]) < rowSumm(raggedArr[i + 1])) {
                    isSorted = false;
                    buf = raggedArr[i];
                    raggedArr[i] = raggedArr[i + 1];
                    raggedArr[i + 1] = buf;
                }
            }
        }
        for (int[] rows : raggedArr) {
            System.out.println(Arrays.toString(rows));
        }
    }

    static void fillArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = ((int) (Math.random() * 18) - 9);
        }
    }

    static int rowSumm(int[] a) {
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            result += a[i];
        }
        return result;
    }
}
