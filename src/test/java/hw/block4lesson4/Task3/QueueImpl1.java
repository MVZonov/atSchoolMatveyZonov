package hw.block4lesson4.Task3;

import java.util.LinkedList;

public class QueueImpl1 implements Queue {
    private LinkedList<Integer> queue = new LinkedList<>();

    @Override
    public void add(int value) {
        queue.add(value);
    }

    @Override
    public int remove() {
        return queue.removeFirst();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public boolean isSingle() {
        return queue.size() == 1;
    }

    @Override
    public String toString() {
        return queue.toString();
    }
}