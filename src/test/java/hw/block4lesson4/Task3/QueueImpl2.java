package hw.block4lesson4.Task3;

import java.util.Collections;
import java.util.LinkedList;

public class QueueImpl2 implements Queue {
    private LinkedList<Integer> queue = new LinkedList<>();

    @Override
    public void add(int value) {
        if (queue.isEmpty()) {
            queue.add(value);
        } else {
            int i = 0;
            queue.add(i, value);
        }
    }

    @Override
    public int remove() {
        int min = Collections.min(queue);
        queue.remove(Integer.valueOf(min));
        return min;
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