package empleado;
import java.util.ArrayList;
import java.util.List;
public class EmployeeManager {
	
	private List<Employee> employees;
	
	public EmployeeManager() {
        this.employees = new ArrayList<>();
    }
	
	public void addEmployee(String name, int years) {
        Employee employee = new Employee(name, years);
        employees.add(employee);
        System.out.println(name + " added to the system.");
    }
	
	public void printEmployees() {
        System.out.println("List of employees:");
        for (Employee employee : employees) {
            System.out.println(employee.getName() + ", Years in company: " +
                    employee.getYearsInCompany());
        }
    }

    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();
        manager.addEmployee("John Doe", 5);
        manager.addEmployee("Jane Smith", 2);
        manager.printEmployees();
    }
}