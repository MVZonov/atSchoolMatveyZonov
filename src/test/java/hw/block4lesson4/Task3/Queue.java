package hw.block4lesson4.Task3;

public interface Queue {
    void add(int value);

    int remove();

    boolean isEmpty();

    boolean isSingle();

    String toString();
}