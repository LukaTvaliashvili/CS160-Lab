package ge.sdsu.session20240221;

public interface IHello {

    void hello();

    private String helloInSpanish(){
        return "Hola";
    }

    default String greetings(){
        return "Greetings from IHello interface";
    }

}
