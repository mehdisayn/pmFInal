package dsit.pmfinal.rrhin.accountant.model;

public class SalaryReports {
    private String selectMonth;
    private String salaryReport;

    public SalaryReports(String selectMonth, String salaryReport) {
        this.selectMonth = selectMonth;
        this.salaryReport = salaryReport;
    }

    public String getSelectMonth() {
        return selectMonth;
    }

    public void setSelectMonth(String selectMonth) {
        this.selectMonth = selectMonth;
    }

    public String getSalaryReport() {
        return salaryReport;
    }

    public void setSalaryReport(String salaryReport) {
        this.salaryReport = salaryReport;
    }

    @Override
    public String toString() {
        return "SalaryReports{" +
                "selectMonth='" + selectMonth + '\'' +
                ", salaryReport='" + salaryReport + '\'' +
                '}';
    }
}
