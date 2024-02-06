package ge.sdsu.session20240130.house;

public class Bathroom extends Room{

    private boolean hasShower;
    private boolean hasBathTub;

    public Bathroom(boolean hasShower, boolean hasBathTub, int area, String flooringType) {
        super(area, flooringType);
        this.hasShower = hasShower;
        this.hasBathTub = hasBathTub;
    }

    public boolean hasShower() {
        return hasShower;
    }

    public boolean hasBathTub() {
        return hasBathTub;
    }
}
