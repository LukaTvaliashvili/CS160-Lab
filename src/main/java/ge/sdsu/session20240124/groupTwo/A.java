package ge.sdsu.session20240124.groupTwo;

public class A {

    protected String name = "A"; // only visible by the children of A
    public A() {
        System.out.println("Inside A's constructor");
    }
}
