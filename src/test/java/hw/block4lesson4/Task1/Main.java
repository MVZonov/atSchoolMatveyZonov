package hw.block4lesson4.Task1;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Не передано название операции.");
            return;
        }

        if (args.length == 1) {
            System.out.println("Не переданы числа для операции.");
            return;
        }

        String operationName = args[0];
        Function function;
        switch (operationName) {
            case "Half":
                function = new Half();
                break;
            case "Double":
                function = new Double();
                break;
            case "Exact":
                function = new Exact();
                break;
            case "Square":
                function = new Square();
                break;
            case "Wave":
                function = new Function() {
                    private int previousX = 0;
                    public int evaluate(int x) {
                        int result = x + previousX;
                        previousX = x;
                        return result;
                    }
                };
                break;
            case "SquareEven":
                function = x -> x % 2 == 0 ? x * x : x;
                break;
            default:
                System.out.println("Операция " + operationName + " не поддерживается.");
                return;
        }

        int[] numbers = new int[args.length - 1];
        for (int i = 0; i < numbers.length; i++) {
            try {
                numbers[i] = Integer.parseInt(args[i + 1]);
            } catch (NumberFormatException e) {
                System.out.println("Аргумент \"" + args[i + 1] + "\" не является числом.");
                return;
            }
        }
        int[] result = applyFunction(numbers, function);

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(result));
    }

    public static int[] applyFunction(int[] arr, Function function) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = function.evaluate(arr[i]);
        }
        return result;
    }
}
