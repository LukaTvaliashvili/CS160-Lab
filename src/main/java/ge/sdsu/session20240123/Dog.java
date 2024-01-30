package ge.sdsu.session20240123;

public class Dog extends Animal {
    private boolean isLoyal;

    public Dog(){
        // calls default (no-args) constructor of Animal
    }
    public Dog(boolean isLoyal){
//        super(); -> is called if indicated otherwise
        super(4, false, true);
        this.isLoyal = isLoyal;
    }

    @Override
    public String makeNoise(){
        return "Bark! Bark!";
    }

    @Override
    public String toString(){
        return "Dog: \n"
                + "is Loyal: " + isLoyal + "\n"
                + "numberOfLegs: " + super.getNumberOfLegs() + "\n"
                + "has fur: " + super.hasFur() + "\n"
                + "is vegetarian: " + super.isVegetarian();

    }


}
