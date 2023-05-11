package hw.block4lesson4.Task3;

public class Main {
    public static void main(String[] args) {
        Queue q1 = new QueueImpl1();
        Queue q2 = new QueueImpl2();

        for (String arg : args) {
            int value = Integer.parseInt(arg);
            q1.add(value);
            q2.add(value);
        }

        System.out.println("Очередь #1:");
        System.out.println("Добавленные элементы: " + q1.toString());
        while (!q1.isEmpty()) {
            if (q1.isSingle()) {
                int value = q1.remove();
                System.out.println("Удален элемент: " + value + ", элементы отсутствуют");
                continue;
            }
            int value = q1.remove();
            System.out.println("Удален элемент: " + value + ", оставшиеся элементы: " + q1.toString());
        }


        System.out.println("\nОчередь #2:");
        System.out.println("Добавленные элементы: " + q2.toString());
        while (!q2.isEmpty()) {
            if (q2.isSingle()) {
                int value = q2.remove();
                System.out.println("Удален элемент: " + value + ", элементы отсутствуют");
                continue;
            }
            int value = q2.remove();
            System.out.println("Удален элемент: " + value + ", оставшиеся элементы: " + q2.toString());
        }
    }
}