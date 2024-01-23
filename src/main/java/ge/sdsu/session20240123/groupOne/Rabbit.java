package ge.sdsu.session20240123.groupOne;

public class Rabbit extends Animal {
    private boolean canJump;

    public Rabbit(boolean canJump){
        super(2, true, true);
        this.canJump = canJump;
    }

    @Override
    public String makeNoise(){
        return "Rabbit noise";
    }

    @Override
    public String toString(){
        return "Rabbit: \n"
                + "can jump: " + canJump + "\n"
                + "numberOfLegs: " + super.getNumberOfLegs() + "\n"
                + "has fur: " + super.hasFur() + "\n"
                + "is vegetarian: " + super.isVegetarian();

    }
}
