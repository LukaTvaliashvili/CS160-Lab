package ge.sdsu.session20240130.house;

import java.util.List;

public class House {
    private List<Room> rooms;
    private Kitchen kitchen;
    private Bathroom bathroom;

    public House(List<Room> rooms){
        this.rooms = rooms;
    }

    public double calculateArea(){
        double sum = 0;
        for (Room room: rooms){
            sum += room.getArea();
        }
        return sum;
    }

    public boolean hasShower(){
        return this.bathroom.hasShower();
    }

    public boolean hasOven(){
        return this.kitchen.hasOven();
    }
}
