package ge.sdsu.session20240213;

public abstract class Shape {
    private String id;

    public Shape(String id) {
        this.id = id;
    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();
}
