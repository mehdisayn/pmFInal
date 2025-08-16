package dsit.pmfinal.rrhin.accountant.model;

public class SalaryReports {
    private String selectMonth;
    private String salaryReport;
    private String name;
    private int id;
    private String department;
    private String month;
    private double salary;

    // Full constructor
    public SalaryReports(String selectMonth, String salaryReport, String name, int id, String department, String month, double salary) {
        this.selectMonth = selectMonth;
        this.salaryReport = salaryReport;
        this.name = name;
        this.id = id;
        this.department = department;
        this.month = month;
        this.salary = salary;
    }

    // Optional simpler constructor
    public SalaryReports(int id, String name, String department, String month, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.month = month;
        this.salary = salary;
    }

    // Getters and setters
    public String getSelectMonth() { return selectMonth; }
    public void setSelectMonth(String selectMonth) { this.selectMonth = selectMonth; }

    public String getSalaryReport() { return salaryReport; }
    public void setSalaryReport(String salaryReport) { this.salaryReport = salaryReport; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public String getMonth() { return month; }
    public void setMonth(String month) { this.month = month; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    @Override
    public String toString() {
        return "SalaryReports{" +
                "selectMonth='" + selectMonth + '\'' +
                ", salaryReport='" + salaryReport + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", department='" + department + '\'' +
                ", month='" + month + '\'' +
                ", salary=" + salary +
                '}';
    }
}
