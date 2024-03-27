package ge.sdsu.session20240325;


public class Main {

    public static void main(String[] args) {
        CourseCatalog<Course> catalog = new CourseCatalog<>();
//        Integer c1 = 2;
        Course c1 = new Course("A1", "CS", "Computer Science");
//        boolean result = catalog.add(c1);
        catalog.displayAll();
    }
}
