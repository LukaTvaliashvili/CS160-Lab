package ge.sdsu.session20240319;

import java.util.ArrayList;
import java.util.List;

public class Example1 {

    public static void main(String[] args) {

        List list = new ArrayList<>();
        list.add("Hello");
        Integer next = (int) list.iterator().next(); //ClassCastException
        System.out.println(next);
    }
}
