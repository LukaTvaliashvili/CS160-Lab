package ge.sdsu.session20240130.composition;

public class Monitor {

    private String brand;
    private double diagonal;

    private int frequency;

    public Monitor(String brand, double diagonal, int frequency) {
        this.brand = brand;
        this.diagonal = diagonal;
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "brand='" + brand + '\'' +
                ", diagonal=" + diagonal +
                ", frequency=" + frequency +
                '}';
    }
}
