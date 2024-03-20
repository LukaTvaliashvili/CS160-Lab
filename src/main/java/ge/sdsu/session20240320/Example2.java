package ge.sdsu.session20240320;

public class Example2 {

    public static void main(String[] args) {

        Test t1 = new Test();
        t1.x = 5;

        Test t2 = new Test();
        t2.x = "ABC";

        int y = (int) t1.x;
        int y1 = (int) t2.x; // checked at runtime -> ClassCastException
        System.out.println(y);
        System.out.println(y1);
    }
}
