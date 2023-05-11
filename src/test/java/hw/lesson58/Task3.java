package hw.lesson58;

public class Task3 {
//    Реализуйте метод void bubbleSort(int[] a),
//    который сортирует целочисленные элементы в массиве a по возрастанию (первый элемент - минимальный) согласно алгоритму пузырьковой сортировки.
//    Используя метод fillArray из первого задания и метод bubbleSort, напишите программу, которая создает массив из 20 целочисленных элементов, выводит элементы в одну строку, разделив пробелами.
//            Затем, используя метод bubbleSort, сортирует созданный массив
//    и выводит элементы отсортированного массива в одну строку, разделив пробелами.
    public static void main(String[] args) {
        int[] array = new int[20];
        fillArray(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;
                    buf = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buf;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    static void fillArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = ((int) (Math.random() * 18) - 9);
        }
    }

}
