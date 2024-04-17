package ge.sdsu.session20240416;

import java.util.*;

public class Example1 {

    public static void main(String[] args) {
        /*
        Map - key, value pairs (Entry)
        Hashmap - order not guaranteed, not sorted
        TreeMap - order not guaranteed, sorted
        LinkedHashMap - order guaranteed, not sorted

        Set - contains only unique elements
        HashSet - order not guaranteed, not sorted
        TreeSet - order not guaranteed, sorted
        LinkedHashSet - order guaranteed, not sorted
         */

        Map<String, String> map = new HashMap<>();
        map.put("Ge", "Georgia");
        map.put("Es", "Spain");
        map.put("UK", "United Kingdom");
        System.out.println(map);

        map.put("Ge", "Germany");

        System.out.println(map);

        map.remove("UK");
        System.out.println(map);

        boolean containsEs = map.containsKey("Es");
        String spain = map.get("Es");
//        map.containsValue()

        System.out.println(map.getOrDefault("It", "Italy"));
        System.out.println(map.get("Apple"));

        Set<String> keys = map.keySet();
        for(String key: keys){
            System.out.println("Key: " + key + "=" + "value: " + map.get(key));
        }

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries){
            System.out.println("Key: " + entry.getKey() + "="
                    + "value: " + entry.getValue());
        }

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(1);
        set.add(1);
        System.out.println(set);

        set.add(5);
        System.out.println(set);
        set.remove(1);
        System.out.println(set); // 2,5 or 5,2

        for (Integer value : set){
            System.out.println(value);
        }
    }
}
