package ge.sdsu.session20240124.groupTwo;

public class Employee {


    /*
    Object-Oriented programming - Encapsulation, Inheritance, Polymorphism, Abstraction
     */

    // data - fields
    // behavior - methods

    /*
    four access modifiers: public, protected, package-private (default), private

    JVM - Java Virtual Machine

     */

    private String name;
    private int age;
//    public static int ID = 1;

//    static {
//        ID = 10;
//        System.out.println("Inside static initializer block");
//    }
//
//
//    {
//        name = "Ann";
//        this.age = 10;
//        System.out.println("Inside initializer block " + " name: " + name + " age: " + age);
//    }

    // Default - no-args constructor

    public Employee(){

//        System.out.println("Inside default constructor " + " name: " + name + " age: " + age);

    }
    public Employee(String name, int age){ // all-args constructor
        this.name = name;
        this.age = age;
//        System.out.println("Inside overloaded constructor" + " name: " + this.name + " age: " + this.age);
    }

    public Employee(String name){
        this(name, 18);
    }

    /*
    getters - accessors
    setters - mutators
     */

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void sayHello(){
        System.out.println("Hello");
    }


}