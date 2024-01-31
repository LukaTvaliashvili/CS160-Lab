package ge.sdsu.session20240130;

public class Administrator extends Employee {

    public String department;

    public Administrator(String department) {
        this.department = department;
    }

    @Override
    public int calculateSalary(){
        return 15_000;
    }
}
