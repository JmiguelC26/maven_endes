package empleado;

public class Employee {
    private String name;
    private int yearsInCompany;

    public Employee(String name, int yearsInCompany) {
        this.name = name;
        this.yearsInCompany = yearsInCompany;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearsInCompany() {
        return yearsInCompany;
    }

    public void setYearsInCompany(int yearsInCompany) {
        this.yearsInCompany = yearsInCompany;
    }
}

