package ge.sdsu.session20240411;

import java.util.*;

public class Example2 {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("A", "1");
        map.put("B", "2");
        map.put("C", "3");
        map.put("D", "4");

        System.out.println(map);

        String result = map.remove("C");

        System.out.println(map);

        map.clear(); // removes all elements of the map
        System.out.println(map);

        map.put("A", "1");
        map.put("B", "2");
        map.put("C", "3");
        map.put("D", "4");
        System.out.println(map);
        map.replace("B", "5");
        map.replace("A", "1", "6");
        System.out.println(map);

        System.out.println(map.size()); // 4
        System.out.println(map.isEmpty()); // size() == 0

        System.out.println(map);

        Map<String, String> map1 = new HashMap<>();
        map1.put("Georgia", "Tbilisi");
        map1.put("California", "Sacramento");

        map.putAll(map1);
        System.out.println(map);

    }
}
