package ge.sdsu.session20240220;

public class PickUpTruck extends Vehicle implements Colorable {
    public static final int NUMBER_OF_WHEELS = 4;

//    private int numberOfWheels;

    public PickUpTruck(){
        super(NUMBER_OF_WHEELS);
    }


    public void move(){
        System.out.println("move() from PickUpTruck");
    }

    @Override
    public void color(String color){
        System.out.println(color);
    }
}
