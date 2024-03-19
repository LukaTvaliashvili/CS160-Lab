package ge.sdsu.session20240319.practice;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Storage<Integer> intStorage = new Storage<>();
        intStorage.store(1);
        intStorage.store(2);
        intStorage.store(3);
        intStorage.displayItems();

        Storage<String> stringStorage = new Storage<>();
        stringStorage.store("Apple");
        stringStorage.store("Pear");
        stringStorage.store("Banana");
        stringStorage.displayItems();

        Storage<Notebook> notebookStorage = new Storage<>();
        notebookStorage.store(new Notebook(100));
        notebookStorage.store(new Notebook(50));
        notebookStorage.store(new Notebook(120));
        notebookStorage.displayItems();

    }

}
