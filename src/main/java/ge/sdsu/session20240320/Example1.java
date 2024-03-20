package ge.sdsu.session20240320;

import java.util.ArrayList;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
//        list.add("Hello"); // compilation problem

        List<Integer> list1 = new ArrayList<>();
//        list1.add("hello");
        int result = (int) list1.iterator().next(); //ClassCastException
//        int result1 = (int) list1.iterator().next();


    }
}
