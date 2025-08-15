package dsit.pmfinal.meddy.ceo.model;

public class Budget {
    private String obs;
    private String department;
    private String justification;
    private double proposedBudget;
    private String status;

    public Budget(String Obs, String department, String justification, double proposedBudget, String status) {
        this.obs = Obs;
        this.department = department;
        this.justification = justification;
        this.proposedBudget = proposedBudget;
        this.status = status;
    }


    @Override
    public String toString() {
        return "Budget{" +
                "obs='" + obs + '\'' +
                ", department='" + department + '\'' +
                ", justification='" + justification + '\'' +
                ", proposedBudget=" + proposedBudget +
                ", status='" + status + '\'' +
                '}';
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getJustification() {
        return justification;
    }

    public void setJustification(String justification) {
        this.justification = justification;
    }

    public double getProposedBudget() {
        return proposedBudget;
    }

    public void setProposedBudget(double proposedBudget) {
        this.proposedBudget = proposedBudget;
    }


}
