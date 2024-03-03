package ge.sdsu.session20240302.oop;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, 22);
        Employee employee2 = new Employee(1, 22);

        /*
        Uses equals() from Object class, as Employee class does not override equals() method
         */
        System.out.println(employee1.equals(employee2));


        int x, y = 10, z = 22;
//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(z);

//        Character.isAlphabetic();
//        Character.isDigit()
        System.out.println(Character.isLetter('A'));
        System.out.println(Character.isLetter(65));

    }
}
