package ge.sdsu.session20240221;

public abstract class Vehicle {

    private int numberOfWheels;

    public Vehicle(){}
    public Vehicle(int numberOfWheels){
        this.numberOfWheels = numberOfWheels;
    }


    public abstract void hello();

    public void greetings(){
        System.out.println("Greetings from abstract class");
    }

    private void greetingInSpanish(){
        System.out.println("Hola");
    }


}
