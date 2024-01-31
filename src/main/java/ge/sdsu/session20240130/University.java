package ge.sdsu.session20240130;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class University {

    private String name;
    private List<Employee> employees;

    public University(String name){
        this.name= name;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public int calculateTotalSalary(){
        int sum = 0;
        for(Employee employee: employees){
            sum += employee.calculateSalary();
        }
        return sum;
    }

}
