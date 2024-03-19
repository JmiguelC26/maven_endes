package empleado;
import java.util.ArrayList;
import java.util.List;

import com.github.javafaker.Faker;
public class EmployeeManager {
	
private List<Employee> employees;
	
public EmployeeManager() {
        this.employees = new ArrayList<>();
    }
	
public void addEmployee(String name, int years) {
        Employee e1 = new Employee(name, years);
        employees.add(e1);
        System.out.println(name + " added to the system.");
}
	
public void printEmployees() {
        System.out.println("List of employees:");
        for (Employee e : employees) {
            System.out.println(e.getName() + ", Years in company: " +
                    e.getYearsInCompany());
        }
}

public static void main(String[] args) {
	int total=100;
	Faker faker = new Faker();
	
        EmployeeManager manager = new EmployeeManager();
        manager.addEmployee("John Doe", 5);
        manager.addEmployee("Jane Smith", 2);
        manager.printEmployees();
        for(int i=0;i<total;i++) {
        	manager.addEmployee(faker.name().name(), faker.number().numberBetween(3, 80));
        }
    }
}