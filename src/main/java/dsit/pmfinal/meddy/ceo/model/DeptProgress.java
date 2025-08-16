package dsit.pmfinal.meddy.ceo.model;

public class DeptProgress {
    private String departmentName;
    private String status;
    private int pendingIssues;


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DeptProgress(String departmentName, String status, int pendingIssues) {
        this.departmentName = departmentName;
        this.status = status;
        this.pendingIssues = pendingIssues;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }



    public int getPendingIssues() {
        return pendingIssues;
    }

    public void setPendingIssues(int pendingIssues) {
        this.pendingIssues = pendingIssues;
    }


    @Override
    public String toString() {
        return "DeptProgress{" +
                "departmentName='" + departmentName + '\'' +
                ", status='" + status + '\'' +
                ", pendingIssues=" + pendingIssues +
                '}';
    }
}
