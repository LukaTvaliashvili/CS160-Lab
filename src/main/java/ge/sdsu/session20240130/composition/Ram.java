package ge.sdsu.session20240130.composition;

public class Ram {

    private int capacity;
    private int frequency;

    public Ram(int capacity, int frequency) {
        this.capacity = capacity;
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "Ram{" +
                "capacity=" + capacity +
                ", frequency=" + frequency +
                '}';
    }
}
