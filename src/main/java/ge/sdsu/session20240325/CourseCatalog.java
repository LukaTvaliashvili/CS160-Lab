package ge.sdsu.session20240325;

import ge.sdsu.session20240319.C;

import java.util.ArrayList;
import java.util.List;

/*
List<Integer> list = new ArrayList<>();
List<? extends Number> list1 = new ArrayList<Integer>();
 */

public class CourseCatalog<T extends Course> {

    private List<T> courses;

    public CourseCatalog(){
        courses = new ArrayList<>();
    }

    public boolean add(T item){
        return courses.add(item);
    }

    public void displayAll(){
        for (T course : courses){
            System.out.println(course + " ");
        }
    }

    public boolean findByTitle(String title){
        for (T course : courses){
            if (course.getTitle().equals(title)){
                return true;
            }
        }
        return false;
    }
}
