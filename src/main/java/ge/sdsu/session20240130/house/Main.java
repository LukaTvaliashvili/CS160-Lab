package ge.sdsu.session20240130.house;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Kitchen kitchen = new Kitchen(true, true, 32.2, "Wooden");
        System.out.println(kitchen);
        Bathroom bathroom = new Bathroom(42.2, "Carpet", true, true);
        System.out.println(bathroom);

        Room room = bathroom;
        Room room1 = new Bathroom(50.2, "Iron", true, true);

        List<Room> rooms = new ArrayList<>();
        rooms.add(kitchen);
        rooms.add(bathroom);

        House house = new House(rooms);
    }
}
