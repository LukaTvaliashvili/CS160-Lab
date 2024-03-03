package ge.sdsu.session20240302.oop;

public class Employee {

    static String role;
    private int id;
    private int age;


    static {
        role = "Admin";
        System.out.println("Static initializer block");
    }

    {
        role = "Guest";
        id = 5;
        age = 26;
        System.out.println("Initializer block 1");
    }

    {
        System.out.println("Initializer block 2");
    }

    public Employee(int id, int age) {
        this.id = id;
        this.age = age;
        System.out.println("Constructor");
    }

    public Employee(int age){
        this(0, age);
    }



}
