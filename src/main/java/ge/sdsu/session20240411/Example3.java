package ge.sdsu.session20240411;

import java.util.HashSet;
import java.util.Set;

public class Example3 {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("B");
        System.out.println(set);
        System.out.println(set.size()); // 3

        set.remove("B");
        System.out.println(set);
        System.out.println(set.size()); // 2

        for(String value : set){
            System.out.println(value);
        }

        set.clear(); // removes all the elements

        set.add("A");
        set.add("B");
        set.add("C");

        Set<String> set1 = new HashSet<>();
        set1.add("B");
        set1.add("C");

        set.removeAll(set1);
        System.out.println(set); // A
    }
}
