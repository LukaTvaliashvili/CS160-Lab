package ge.sdsu.session20240130;

public class Professor extends Employee {
    private String department;

//    public Professor(){
//        super();
//   }

    public Professor(String department){
        this.department = department;
    }

    public Professor(String name, int employeeId, String department){
        super(name, employeeId);
        this.department = department;
    }

    @Override
    public int calculateSalary(){
        return 5_000;
    }

    public boolean hasPublications(){
        return true;
    }


}
