package ge.sdsu.session20240213;

public class Main {

    public static void main(String[] args) {
        ShapeManager shapeManager = new ShapeManager();
        Circle circle = new Circle("Circle", 2.2);
        Rectangle rectangle = new Rectangle("Rectangle", 2.5, 4);
        shapeManager.addShape(circle);
        shapeManager.addShape(rectangle);
        System.out.println(shapeManager);

    }
}
