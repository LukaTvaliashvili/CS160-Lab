package ge.sdsu;

import ge.sdsu.session20240124.groupTwo.Animal;
import ge.sdsu.session20240124.groupTwo.Dog;
import ge.sdsu.session20240124.groupTwo.Employee;
import ge.sdsu.session20240124.groupTwo.Rabbit;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello CS160 Lab");

        int total = 10;

        Employee employee = new Employee();
//        employee.name = "Ann";
//        employee.age = 18;

//        System.out.println("Name: " + employee.name);
//        System.out.println("Age: " + employee.age);

//        employee.age = 28;
//        System.out.println("Age: " + employee.age);

        Employee employee1 = new Employee("David", 19);
//        System.out.println("Age: " + employee1.getAge());
//        System.out.println("Name: " + employee1.getName());

//        employee.sayHello();

        Employee employee2 = new Employee("Helen", 24);
        Employee employee3 = new Employee("Kamila", 24);
        Employee employee4 = new Employee("George", 27);



        int[] intArray = new int[]{1, 2, 3, 4, 5};
        // for loop, while loop, do-while loop

        for(int i = 0; i < intArray.length; i++){
            System.out.print(intArray[i] + " ");
        }
        System.out.println("\n");
        for (int elem : intArray){
            System.out.print(elem + " ");
        }

        System.out.println();

        Employee[] employees = new Employee[]{employee1, employee2, employee3, employee4};

        Employee[] employees1 = new Employee[2];
        employees1[0] = employee1;
        employees1[1] = employee2;

        for (Employee emp : employees){
            System.out.println(emp.getName());
        }


        /*
        Multi-level inheritance
        Multiple inheritance -> leads to diamond problem
         */

        Animal animal = new Animal(4, false, false);
        int sum = 10;
        System.out.println(sum);

        System.out.println(animal); //calls toString() from Object class, or overriden version

        Dog dog = new Dog(true);
        System.out.println(dog); //

        Rabbit rabbit = new Rabbit(true);
        System.out.println(rabbit);

        System.out.println(dog instanceof Animal); // is - a

    }
}