package ge.sdsu.session20240130.house;

public class Room {

    private double area; // default - 0.0
    private String flooringType; // default - null

    public Room() {}

    public Room(double area, String flooringType){
        this.area = area;
        this.flooringType = flooringType;
    }

    @Override
    public String toString() {
        return "Room{" +
                "area=" + area +
                ", flooringType='" + flooringType + '\'' +
                '}';
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getFlooringType() {
        return flooringType;
    }

    public void setFlooringType(String flooringType) {
        this.flooringType = flooringType;
    }
}
