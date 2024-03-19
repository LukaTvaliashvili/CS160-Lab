package ge.sdsu.session20240213;

import java.util.ArrayList;
import java.util.List;

public class ShapeManager {

    private List<Shape> shapes;

    public ShapeManager(){
        this.shapes = new ArrayList<>();
    }

    public void addShape(Shape shape){
        shapes.add(shape);
    }

    public double calculateTotalArea(){
        double totalArea = 0;
        for(Shape shape: shapes){
            totalArea += shape.calculateArea();
        }
        return totalArea;
    }

    public void removeShape(Shape shape){
        shapes.remove(shape);
    }

    @Override
    public String toString() {
        return "ShapeManager{" +
                "shapes=" + shapes +
                '}';
    }
}
