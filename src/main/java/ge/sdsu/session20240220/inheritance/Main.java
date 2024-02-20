package ge.sdsu.session20240220.inheritance;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        A a = new A();
        a.hello(); // A
        B b = new B();
        b.hello(); // B
//        A a1 = new B();
//        a1.hello(); // B
        A a1 = new C();
        a1.hello(); // C

        A a2 = new B();
        a2.hello();

        D d = new D();
        d.addElement(1);
        d.addElement(2);
        d.remove(1);
    }
}
