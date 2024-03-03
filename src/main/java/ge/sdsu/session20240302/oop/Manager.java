package ge.sdsu.session20240302.oop;

public class Manager extends Employee{

    private boolean isStrict;
    private boolean isOrganized;

    private int id;
    private int age;

    public Manager(boolean isStrict, boolean isOrganized, int id, int age) {
        super(id, age);
        this.isStrict = isStrict;
        this.isOrganized = isOrganized;
    }
}
