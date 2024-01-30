package ge.sdsu.session20240124;

public class Dog extends Animal {

    private boolean isLoyal;

    public Dog(boolean isLoyal){
        super(4, true, false);
        this.isLoyal = isLoyal;
    }

//    public String toString(){
//            return "Dog: " + "\n"
//                    + "number of legs: " + super.numberOfLegs + "\n"
//                    + "is vegetarian: " + super.isVegetarian + "\n"
//                    + "has fur: " + super.hasFur + "\n"
//                    + "is loyal: " + this.isLoyal + "\n";
//        }

    @Override
    public String toString(){
        return "Dog: " + "\n"
                + "is loyal: " + this.isLoyal + "\n";
    }

    @Override
    public String makeNoise(){
        return "Bark! Bark!";
    }

    public boolean isLoyal() {
        return isLoyal;
    }

    public void setLoyal(boolean loyal) {
        isLoyal = loyal;
    }

    public void hunt(){
        System.out.println("Good at hunting");
    }

}
