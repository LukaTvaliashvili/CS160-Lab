package ge.sdsu.session20240130;

public class Main {

    public static void main(String[] args) {
        Professor p = new Professor("Computer Science");
        Employee p1 = new Professor("Computer Science");
        Object p3 = new Professor("Computer Science");

        System.out.println(p.calculateSalary());
        System.out.println(p.hasPublications());

        System.out.println(p1.calculateSalary());


        Staff staff = new Staff("CFO");
        Administrator administrator = new Administrator("CS");

        University university = new University("SDSU");
        university.addEmployee(staff);
        university.addEmployee(p);
        university.addEmployee(administrator);

        System.out.println(university.calculateTotalSalary());
    }
}
