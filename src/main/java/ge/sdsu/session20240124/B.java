package ge.sdsu.session20240124;

public class B extends A {

    public B() {
        super();
        System.out.println("Inside B's constructor");
        System.out.println(super.name); // A
    }
}
