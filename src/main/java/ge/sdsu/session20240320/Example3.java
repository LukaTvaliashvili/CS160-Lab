package ge.sdsu.session20240320;

import java.util.ArrayList;
import java.util.List;

public class Example3 {

    public static void main(String[] args) {

        /*
        Integer extends Number
        Double extends Number
         */

        // four types of constraints
        Test<Integer> t1;
        Test<?> t2;
        Test<? extends Number> t3;
        Test<? super Number> t4;

        t1 = new Test<Integer>();
        t1 = new Test<>(); //identical to the line above.
        // Depending on the constraint, we know that only acceptable type is Integer

//        t1 = new Test<Long>(); // compilation problem
//        t1 = new Test<Double>(); // compilation problem

        t2 = new Test<String>();
        t2.x = null; // we can assign null, any other value will cause compilation problem
//        t2.x = 10; //compilation problem
        t2 = new Test<Integer>();

        List<Object> t5 = new ArrayList<>();
        t5.add("String");
        t5.add(1);

        t3 = new Test<Integer>();
        t3 = new Test<Double>();
//        t3.x = 2.2; //compilation problem
        t3 = new Test<Number>();

        t4 = new Test<Number>();
        t4 = new Test<Object>();
        t4.x = 23;
    }
}
