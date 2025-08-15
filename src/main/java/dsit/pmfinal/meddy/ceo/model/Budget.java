package dsit.pmfinal.meddy.ceo.model;

public class Budget {

    private String department;
    private String justification;
    private double proposedBudget;

    public Budget(String department, String justification, double proposedBudget) {
        this.department = department;
        this.justification = justification;
        this.proposedBudget = proposedBudget;
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



    @Override
    public String toString() {
        return "Budget{" +
                "department='" + department + '\'' +
                ", justification='" + justification + '\'' +
                ", proposedBudget=" + proposedBudget +
                ", totalRequested=" +
                '}';
    }
}
