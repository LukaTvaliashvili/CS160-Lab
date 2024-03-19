package ge.sdsu.session20240319;

import java.util.ArrayList;
import java.util.List;

public class Example2 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();

        /*
        left hand side -> constraint
        right hand side -> actual type
         */


        /*
        Integer extends Number
        Double extends Number
         */

        // four constraints

        Test<Integer> t1;
        Test<?> t2; // any object wildcard
        Test<? extends Number> t3;
        Test<? super Number> t4;
        Test<Number> t5;

//        t1 = new Test<Long>(); // compilation problem
        t1 = new Test<>(); // <Integer> is redundant

        // t5 = new Test<Integer>();

        Test<Object> t6 = new Test<Object>();
        t6.x = 10;
        t6.x = 11;
        Test<?> t7 = new Test<Object>();
//        t7.x = 10; // compilation problem





     }
}
