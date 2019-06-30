import java.util.Arrays;

public class ConveyorList {

    private int size = 0;
    private static final int DEFAULT_CAPACITY = 16;
    private int[] elements;


    ConveyorList(int capacity) {
        this.elements = new int[capacity];
    }

    ConveyorList() {
        this.elements = new int[DEFAULT_CAPACITY];
    }

    boolean add(int e) {
        if (size == elements.length) {
            System.arraycopy(elements, 1, elements, 0, elements.length - 1);
            elements[size - 1] = e;
        } else elements[size++] = e;
        return true;
    }

    @Override
    public String toString() {
        return Arrays.toString(elements);
    }
}
