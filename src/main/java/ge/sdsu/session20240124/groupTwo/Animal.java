package ge.sdsu.session20240124.groupTwo;

public class Animal extends Object {

    private int numberOfLegs;
    private boolean hasFur;
    private boolean isVegetarian;

    public Animal(int numberOfLegs, boolean hasFur, boolean isVegetarian) {
        this.numberOfLegs = numberOfLegs;
        this.hasFur = hasFur;
        this.isVegetarian = isVegetarian;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public boolean isHasFur() {
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        isVegetarian = vegetarian;
    }

    public String makeNoise(){
        return "Generic animal noise";
    }

    public String toString(){
        return "Animal: " + "\n"
                + "number of legs: " + this.numberOfLegs + "\n"
                + "is vegetarian: " + this.isVegetarian + "\n"
                + "has fur: " + this.hasFur + "\n";
    }
}
