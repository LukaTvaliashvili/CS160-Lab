package ge.sdsu.session20240319.equalsHashcode;

import java.util.Objects;

public class Employee implements Comparable<Employee>{

    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj){

        if (this == obj){
            return true;
        }

        if (obj == null || getClass() != obj.getClass()){
            return false;
        }

        Employee other = (Employee) obj;

        return this.id == other.id && this.name.equals(other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee employee) {
        return Integer.compare(id, employee.id);
    }

    /*
    hashCode and equals() contract:
    if two objects are equal (using equals()) they will have the same hash code.
    if two objects have the same hash code, that does not mean that those objects are equal.
     */
}
