package ge.sdsu.session20240130.house;

public class Kitchen extends Room {
    private boolean hasSink;
    private boolean hasOven;

    public Kitchen(boolean hasSink, boolean hasOven, double area, String flooringType){
//        super();
        super(area, flooringType);
        this.hasSink = hasSink;
        this.hasOven = hasOven;
    }

    @Override
    public String toString() {
        return "Kitchen{" +
                "hasSink=" + hasSink +
                ", hasOven=" + hasOven +
                ", area: " + super.getArea() +
                ", flooringType: " + super.getFlooringType() +
                '}';
    }

    public boolean hasSink() {
        return hasSink;
    }

    public void setHasSink(boolean hasSink) {
        this.hasSink = hasSink;
    }

    public boolean hasOven() {
        return hasOven;
    }

    public void setHasOven(boolean hasOven) {
        this.hasOven = hasOven;
    }
}
