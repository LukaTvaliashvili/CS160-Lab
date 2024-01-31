package ge.sdsu.session20240130;

public class Staff extends Employee {

    private String role;

    public Staff(String role){
        this.role = role;
    }

    @Override
    public int calculateSalary(){
        return 10_000;
    }
}
