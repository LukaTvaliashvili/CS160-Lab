package ge.sdsu.session20240411;

import java.util.*;

public class Example1 {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("A", "1");
        map.put("B", "2");
        map.put("C", "3");
        map.put("D", "4");

        System.out.println(map.get("C")); // 3
        System.out.println(map.get("Z")); // null
        System.out.println(map.getOrDefault("Y", "Default value"));

        System.out.println(map.containsKey("A")); // true
        System.out.println(map.containsKey("M")); // false

        System.out.println(map.containsValue("M")); // false
        System.out.println(map.containsValue("4")); // true

        Set<String> keys = map.keySet();
        Collection<String> values = map.values();

        System.out.println(keys);
        System.out.println(values);

        Iterator<String> iterator = map.keySet().iterator();

        while (iterator.hasNext()){
            String key = iterator.next();
            System.out.println("key: " + key + " " + "value: " + map.get(key));
        }

        Set<Map.Entry<String, String>> entries = map.entrySet();
        Iterator<Map.Entry<String, String>> iterator1 = entries.iterator();

        while (iterator1.hasNext()){
            Map.Entry<String, String> entry = iterator1.next();
            String key = entry.getKey();
            String value = entry.getValue();

            System.out.println("key: " + key + " " + "value: " + value);
        }

        for(Map.Entry<String, String> entry : map.entrySet()){
            System.out.println("key: " + entry.getKey() + " " + "value: " + entry.getValue());
        }


    }
}
