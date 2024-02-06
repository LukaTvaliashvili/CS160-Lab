package ge.sdsu.session20240130.house;

public class Room {
    private int area;
    private String flooringType;

    public Room(int area, String flooringType) {
        this.area = area;
        this.flooringType = flooringType;
    }

    public int getArea() {
        return area;
    }

    public String getFlooringType() {
        return flooringType;
    }
}
