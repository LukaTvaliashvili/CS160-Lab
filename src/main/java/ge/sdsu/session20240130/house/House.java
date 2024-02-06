package ge.sdsu.session20240130.house;

import java.util.ArrayList;
import java.util.List;

public class House {
    private List<Room> rooms;
    private Bathroom bathroom;
    private Kitchen kitchen;

    public House(Bathroom bathroom, Kitchen kitchen){
        this.bathroom = bathroom;
        this.kitchen = kitchen;
        rooms = new ArrayList<>();
        rooms.add(bathroom);
        rooms.add(kitchen);
    }

    public House(List<Room> rooms){
        this.rooms = rooms;
    }

    public int calculateArea(List<Room> rooms){
        int total = 0;
        for(Room room : rooms){
            total += room.getArea();
        }
        return total;
    }
    public boolean hasOven(){
        return this.kitchen.hasOven();
    }

    public boolean hasShower(){
        return this.bathroom.hasShower();
    }


}
