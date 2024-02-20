package ge.sdsu.session20240220;

public class Test implements ITest, Colorable {

    @Override
    public void hello(){
        System.out.println("Hello from Test");
    }

    @Override
    public void color(String color){
        System.out.println(color);
    }
}
