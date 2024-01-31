package ge.sdsu.session20240130;

public class Employee {

    private String name;
    private int employeeId;

    // implicit no-args constructor

    public Employee(){}
    public Employee(String name, int employeeId){
        this.name = name;
        this.employeeId = employeeId;
    }

    public int calculateSalary(){
        return 1000;
    }
}
