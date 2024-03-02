package ge.sdsu.session20240221.inheritance;

public class Main {

    public static void main(String[] args) {
        A a = new A();
        a.hello(); // A

        B b = new B();
        b.hello(); // B
        b.greeting();

        A a1 = new B();
        a1.hello(); // B

    }
}
