package ge.sdsu.session20240130;

public class Professor extends Employee {

    private String department;
    private int numberOfPublications;

    public Professor(String department, int numberOfPublications) {
        this.department = department;
        this.numberOfPublications = numberOfPublications;
    }

    // this() - to reuse the constructor within the class
    // super() - to call parent's constructor
    // both this() and super() needs to be on the first line of constructor body
    public Professor(String name, int employeeId, String department, int numberOfPublications){
        super(name, employeeId);
        this.department = department;
        this.numberOfPublications = numberOfPublications;
    }

    @Override
    public double calculateSalary() {
//        return 5000 + numberOfPublications * 200;
        return 3000;
    }




}
