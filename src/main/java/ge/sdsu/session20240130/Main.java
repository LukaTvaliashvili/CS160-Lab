package ge.sdsu.session20240130;

public class Main {

    public static void main(String[] args) {

        Administrator administrator = new Administrator("David", 1, "CS");
        Employee staff = new Staff("George", 2, "CFO");
        Employee professor = new Professor("Helen", 3, "CS", 5);

        University university = new University("SDSU");
//        University university1 = new University("SDSU", new ArrayList<>());
        university.addEmployee(administrator);
        university.addEmployee(staff);
        university.addEmployee(professor);


        System.out.println(university.calculateTotalSalary());

    }
}
