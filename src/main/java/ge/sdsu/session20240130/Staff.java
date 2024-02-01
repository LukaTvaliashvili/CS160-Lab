package ge.sdsu.session20240130;

public class Staff extends Employee {

    private String role;

    public Staff(String name, int employeeId, String role){
        super(name, employeeId);
        this.role = role;
    }

    @Override
    public double calculateSalary(){
        return 5000;
    }

}
