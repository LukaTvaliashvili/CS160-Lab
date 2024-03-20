package ge.sdsu.session20240320.equalsAndHashcode;

public class Main {

    public static void main(String[] args) {

        Player p1 = new Player(1, "David", 23.2);
        Player p2 = new Player(1, "David", 53.2);
        Player p3 = new Player(1, "George", 53.2);
        System.out.println(p1 == p2); //false
        System.out.println(p1.equals(p2)); //true
        System.out.println(p1.equals(p3)); //false

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
    }
}
