package ge.sdsu.session20240221;

public class Sedan extends Vehicle implements ILuxury {

    @Override
    public void hello(){
        System.out.println("Hello from Sedan class");
    }

    @Override
    public boolean isLuxury(){
        return true;
    }

}
