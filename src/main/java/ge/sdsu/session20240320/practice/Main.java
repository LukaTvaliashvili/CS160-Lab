package ge.sdsu.session20240320.practice;

public class Main {

    public static void main(String[] args) {
        Storage<Integer> intStorage = new Storage<>();
        intStorage.store(1);
        intStorage.store(2);
        intStorage.store(3);
        System.out.println("Integer storage: ");
        intStorage.displayItems();

        Storage<String> stringStorage = new Storage<>();
        stringStorage.store("hello");
        stringStorage.store("ab");
        stringStorage.store("cd");
        System.out.println("String storage: ");
        stringStorage.displayItems();

        Storage<Notebook> notebookStorage = new Storage<>();
        notebookStorage.store(new Notebook(12));
        notebookStorage.store(new Notebook(100));
        System.out.println("Notebook storage: ");
        notebookStorage.displayItems();

    }
}
