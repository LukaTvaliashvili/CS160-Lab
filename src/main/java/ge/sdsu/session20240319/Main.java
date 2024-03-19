package ge.sdsu.session20240319;

public class Main {

    public static void main(String[] args) {
        Test t1 = new Test();
        t1.x = 5;

        Test t2 = new Test();
        t2.x = "ABc";

        int y1 = (int) t1.x;
        System.out.println(y1);
        int y2 = (int) t2.x; //ClassCastException
//        System.out.println(y2);

        Test<Integer> t3 = new Test<>();
        t3.x = 5;

        Test<String> t4 = new Test<>();
        t4.x = "ABc";

//        int y3 = (int) t4; -> compilation problem
    }
}
