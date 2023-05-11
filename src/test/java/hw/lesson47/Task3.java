package hw.lesson47;

public class Task3 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]); //максимальное число
        int col = Integer.parseInt(args[1]); //количество цифр в одной строке
        snakePrint(n, col);
    }

    static void snakePrint(int n, int col) {
        for (int i = 0; i <= n / col; i++) {
            if (i % 2 == 0) {
                for (int j = 1; j <= col; j++) {
                    int print = j + i * col;
                    System.out.print((n >= print ? print : " ") + " ");
                }
            } else {
                for (int j = col; j >= 1; j--) {
                    int print = j + i * col;
                    System.out.print((n >= print ? print : " ") + " ");
                }
            }
            System.out.print("\n");
        }
    }
}




