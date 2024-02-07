package ge.sdsu.session20240130.house;

public class Bathroom extends Room {
    private boolean hasShower;
    private boolean hasBathtub;

    public Bathroom(double area, String flooringType, boolean hasShower, boolean hasBathtub) {
        super(area, flooringType);
        this.hasShower = hasShower;
        this.hasBathtub = hasBathtub;
    }

    public boolean hasShower() {
        return hasShower;
    }

    public void setHasShower(boolean hasShower) {
        this.hasShower = hasShower;
    }

    public boolean hasBathtub() {
        return hasBathtub;
    }

    public void setHasBathtub(boolean hasBathtub) {
        this.hasBathtub = hasBathtub;
    }

    @Override
    public String toString() {
        return "Bathroom{" +
                "hasBathtub=" + hasBathtub +
                ", hasShower=" + hasShower +
                ", area: " + super.getArea() +
                ", flooringType: " + super.getFlooringType() +
                '}';
    }
}
