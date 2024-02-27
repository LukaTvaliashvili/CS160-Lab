package ge.sdsu.session20240213;

public class ParticularTriangle extends Triangle {

    public ParticularTriangle(String id, double side1, double side2, double side3) {
        super(id, side1, side2, side3);
    }

    @Override
    public double calculatePerimeter() {
        // calculate the perimeter of the triangle
        return 2.2;
    }
}
