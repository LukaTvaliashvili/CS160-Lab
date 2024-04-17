package ge.sdsu.session20240416;

import java.util.*;

public class Example {

    public static void main(String[] args) {

        // 2.0, 3.0, 5.5, abc, 1.0

        double total = 0.0;
        /*
         try{
            total += File.nextDouble();
        }catch(Exception){
            print error message
            File.nextLine();
        }finally{
            total += 2.5;
        }

        1: 2.0 + 2.5 = 4.5
        2: 7.5 + 2.5 = 10
        3: 10 + 5.5 + 2.5 = 18
        4: 18+2.5 = 20.5
        5: 20.5 + 1+ 2.5 = 24.0
         */


        Map<String, String> map = new HashMap<>();
        // hash: String.length()
        map.put("Hi", "Hello");
        String value = map.get("Hi");
        boolean containsKey = map.containsKey("Hi");
        // containsValue
        System.out.println(map);

        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()){
            map.get(iterator.next());
        }

        for(String key : map.keySet()){
            System.out.println("Key: " + key + " value: " + map.get(key));
        }

        Set<Map.Entry<String, String>> set = map.entrySet();// Set<Entry<Key,Value>>\

        for(Map.Entry<String, String> entry : set){
            System.out.println("Key: " + entry.getKey() + " value: " + entry.getValue());
        }

//        map.remove()

        String defaultVal = map.getOrDefault("Apple", "Hello");
        System.out.println(defaultVal); // Hello

        Set<Integer> set1 = new HashSet<>();
        set1.add(5);
        set1.add(5);
        set1.add(5);
        set1.add(2);
        set1.add(2);
        System.out.println(set1);
    }
}
