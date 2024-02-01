package ge.sdsu.session20240130;

public class Administrator extends Employee {

    private String department;

    public Administrator(String name, int employeeId, String department){
        super(name, employeeId);
        this.department = department;
    }

    @Override
    public double calculateSalary(){
        return 10_000;
    }

    public void dismissEmployee(){
        System.out.println("Dismissed");
    }
}
