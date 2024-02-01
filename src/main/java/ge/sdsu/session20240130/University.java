package ge.sdsu.session20240130;

import java.util.ArrayList;
import java.util.List;

public class University {

    private String name;
    private List<Employee> employees;

    public University(String name){
        employees = new ArrayList<>();
        this.name = name;
    }

    public University(String name, List<Employee> list){
        this.employees = list;
        this.name = name;
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public double calculateTotalSalary(){
        double total = 0d;
        for (Employee emp: employees){
            total += emp.calculateSalary();
        }
        return total;
    }


}
