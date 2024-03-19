package ge.sdsu.session20240319;

public class Example3 {

    public static void main(String[] args) {

        Test<Integer> t1 = new Test<Integer>();
        t1.x = 5;
        t1.x = 6;

        Test<Number> t2 = new Test<Number>();
        t2.x = 10;

//        t2 = t1; // compilation problem

        Test<? extends Number> t3 = new Test<Long>();
        Test<? extends Number> t4= new Test<Number>();
//        t4.x = 10;

        Test<? super Number> t5 = new Test<Number>();
        Test<? super Number> t6 = new Test<Object>();
        t6.x = 10;
    }
}
