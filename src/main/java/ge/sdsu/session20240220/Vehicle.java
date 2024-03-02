package ge.sdsu.session20240220;

public abstract class Vehicle {

    private int numberOfWheels;

    public Vehicle(int numberOfWheels){
        this.numberOfWheels = numberOfWheels;
    }

    public abstract void move();

    public boolean speeding(){
        return true;
    }

    private boolean isFast(){
        return false;
    }

}
