package ge.sdsu.session20240221.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeManager {
    private List<Shape> shapes;

    public ShapeManager(){
        shapes = new ArrayList<>();
    }

    public boolean addShape(Shape shape){
        return shapes.add(shape);
    }

    public boolean removeShape(Shape shape){
        return shapes.remove(shape);
    }

}
