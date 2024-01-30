package ge.sdsu.session20240123;

public class Example1 {

    public static void main(String[] args) {
//        Employee e1 = new Employee(10, "David");
//        Employee e2 = new Employee();
        System.out.println("Id: " + Employee.id);


//        System.out.println("Age: " + e1.getAge());
//        System.out.println("Name: " + e1.getName());

//        e1.age = 21;
//        System.out.println("Age after change: " + e1.age);

//        e1.setAge(21);
//        e1.setName("George");

//        System.out.println("After changing the age: " + e1.getAge());
//        System.out.println("After changing the name: " + e1.getName());


        Employee e1 = new Employee(10, "David");
        Employee e2 = new Employee(11, "George");
        Employee e3 = new Employee(12, "Hannah");
        Employee e4 = new Employee(13, "Ann");

        Employee[] employeeArray = new Employee[]{e1, e2, e3, e4};

        int[] arr = new int[]{1, 23, 3, 5, 7};

        for(int num: arr){
            System.out.println(num);
        }
        System.out.println("Age of employees: ");
        for (Employee employee : employeeArray) {
            System.out.println(employee.getAge());
        }


    }
}
