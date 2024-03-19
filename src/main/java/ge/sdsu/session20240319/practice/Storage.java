package ge.sdsu.session20240319.practice;

import java.util.ArrayList;
import java.util.List;

public class Storage<T> {

    private List<T> items;

    public Storage(){
        items = new ArrayList<>();
    }

    public boolean store(T item){
        return items.add(item);
    }

    public List<T> retrieveAllItems(){
        return items;
    }

    public boolean isEmpty(){
        return items.isEmpty();
    }

    public void displayItems(){
        if (isEmpty()){
            System.out.println("Storage is empty");
        } else {
            System.out.println("Storage contains: ");
            for (T item: items){
                System.out.println(" " + item);
            }
        }
    }
}
