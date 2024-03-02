package ge.sdsu.session20240221;

public class Hello implements IHello, IGreeting {

    @Override
    public void hello(){
        System.out.println("Hello class");
    }

//    @Override
//    public String greetings(){
//        return "Greetings from Hello class";
//    }

    @Override
    public void greeting(String name){
        System.out.println("Greetings from Hello class");
    }


}
