package ge.sdsu.session20240130;

public class Employee {
    private String name;
    private int employeeId;

    public Employee(){

    }
    public Employee(String name, int employeeId){ //all-args constructor
        this.name = name;
        this.employeeId = employeeId;
    }

    public double calculateSalary(){
        return 1000;
    }
}
