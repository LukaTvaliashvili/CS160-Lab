package ge.sdsu.session20240403;

public class CustomDataStructures {

    public static void main(String[] args) {

        LL list = new LL();
        list.addFirst(2);
        list.addFirst(7);
        list.addFirst(13);
        list.addFirst(21);
        list.addFirst(33);

        list.display(); // 33 -> 21 -> 13 -> 7 -> 2 -> END
        System.out.println(list.removeFirst()); // 33
        list.display(); // 21 -> 13 -> 7 -> 2 -> END

        System.out.println(list.get(2)); //13
    }
}
