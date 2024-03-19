package ge.sdsu.session20240213;

public class Rectangle extends Shape{

    private double sideA;
    private double sideB;

    public Rectangle(String id, double sideA, double sideB) {
        super(id);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double calculateArea(){
        return sideA * sideB;
    }

    @Override
    public double calculatePerimeter(){
        return 2 * (sideA + sideB);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                '}';
    }
}
