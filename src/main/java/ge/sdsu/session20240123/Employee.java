package ge.sdsu.session20240123;

public class Employee {

    // attributes and methods

    /*
    access modifiers: private, protected,
                package-private (default), public
     */

    private int age;
    private String name;
    public static int id = 1;

//    static {
//        id = 1;
//        System.out.println("Static initializer");
//    }
//
//    {
//        System.out.println("Initializer block");
//        age = 10;
//        name = "Saba";
//        System.out.println("Age: " + age + " name: " + name);
//    }

    public Employee(){
        System.out.println("Default Constructor");
    }

    // All-args constructor
    public Employee(int age, String name){
        this.age = age;
        this.name = name;
    }

    public Employee(String name){
//        this(18, name);
        this.name = name;
        this.age = 18; // default value
    }

    public Employee (int age){
        this(age, "Ann");
    }

//    public static int getId() {
//        return id;
//    }
//
//    public static void setId(int id) {
//        Employee.id = id;
//    }

    // getters - accessors
    // setters - aka mutator

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }


}
