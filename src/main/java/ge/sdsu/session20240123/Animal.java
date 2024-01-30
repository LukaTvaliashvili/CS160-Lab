package ge.sdsu.session20240123;

public class Animal extends Object {

    private int numberOfLegs;
    private boolean isVegetarian;
    private boolean hasFur;

    public Animal(){
        System.out.println("Animal : Default Constructor");
    }
    public Animal(int numberOfLegs, boolean isVegetarian, boolean hasFur) {
        this.numberOfLegs = numberOfLegs;
        this.isVegetarian = isVegetarian;
        this.hasFur = hasFur;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        isVegetarian = vegetarian;
    }

    public boolean hasFur() {
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }

    public String makeNoise(){
        return "Generic animal noise";
    }

    @Override
    public String toString() {
        return "Animal{" +
                "numberOfLegs=" + numberOfLegs +
                ", isVegetarian=" + isVegetarian +
                ", hasFur=" + hasFur +
                '}';
    }
}
