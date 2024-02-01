package ge.sdsu.session20240130.composition;

public class RAM {

    private int capacity;
    private int frequency;

    public RAM(int capacity, int frequency){
        this.capacity = capacity;
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "RAM{" +
                "capacity=" + capacity +
                ", frequency=" + frequency +
                '}';
    }
}
