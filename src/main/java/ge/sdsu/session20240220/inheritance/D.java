package ge.sdsu.session20240220.inheritance;

import java.util.List;

public class D {

    private int id;
    private List<Integer> list;


    public boolean addElement(int value){
        return list.add(value);
    }

    public Integer remove(int value){
        return list.remove(value);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
