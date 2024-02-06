package ge.sdsu.session20240130.house;

public class Kitchen extends Room{

    private boolean hasOven;
    private boolean hasSink;

    public Kitchen(boolean hasOven, boolean hasSink, int area, String flooringType) {
        super(area, flooringType);
        this.hasOven = hasOven;
        this.hasSink = hasSink;
    }

    public boolean hasOven() {
        return hasOven;
    }

    public boolean hasSink() {
        return hasSink;
    }
}
