package ge.sdsu.session20240220;

public interface ITest {

    public static int COUNT = 0;

    void hello();

//    void greeting();
    private void helloInSpanish(){
        System.out.println("Hello");
    }

    default void greeting(){
        helloInSpanish();
        System.out.println("Greeting");
    }
}
