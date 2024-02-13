package ge.sdsu.session20240213;

public class Triangle extends Shape {

    private double side1;
    private double side2;
    private double side3;

    public Triangle(String id, double side1, double side2, double side3) {
        super(id);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double calculateArea(){
        return 1.1;
    }

    @Override
    public double calculatePerimeter(){
        return 2.2;
    }

}
