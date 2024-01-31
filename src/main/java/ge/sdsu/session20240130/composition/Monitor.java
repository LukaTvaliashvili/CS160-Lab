package ge.sdsu.session20240130.composition;

public class Monitor {

    private String brand;
    private int frequency;

    private double diagonal;

    public Monitor(String brand, int frequency, double diagonal) {
        this.brand = brand;
        this.frequency = frequency;
        this.diagonal = diagonal;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "brand='" + brand + '\'' +
                ", frequency=" + frequency +
                ", diagonal=" + diagonal +
                '}';
    }
}
