package ge.sdsu.session20240403;

public class CustomQueue {

    private int[] data;
    private static final int DEFAULT_CAPACITY = 10;

    private int end = 0;

    public CustomQueue() {
        this(DEFAULT_CAPACITY);
    }

    public CustomQueue(int capacity) {
        this.data = new int[capacity];
    }

    public int add(int value) throws Exception {
        if (isFull()) {
            throw new Exception("Queue is full");
        }
        data[end] = value;
        end++;
        return value;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }

        int value = data[0];
        for (int i = 1; i < end; i++) {
            data[i - 1] = data[i];
        }

        // 1 2 3 4
        // 2 3 4 4
        end--;
        return value;
    }

    public boolean isFull() {
        return end == data.length;
    }

    public boolean isEmpty() {
        return end == 0;
    }

    public void display() {
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " <-");
        }
        System.out.println("END");

    }
}
