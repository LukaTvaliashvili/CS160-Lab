package ge.sdsu.session20240130.inheritance;

public class Main {

    public static void main(String[] args) {
        A a = new A();
        a.helloFromA1(); //hello
        a.helloFromA2(); //Hola

        System.out.println("From B:");
        B b = new B();
        b.helloFromA1(); //Halo
        b.helloFromA2(); //Hola
    }
}
