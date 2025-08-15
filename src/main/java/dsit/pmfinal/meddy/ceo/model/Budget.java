package dsit.pmfinal.meddy.ceo.model;

public class Budget {

    private String department;
    private String justification;
    private double proposedBudget;
    private double totalRequested;

    public Budget(String department, String justification, double proposedBudget, double totalRequested) {
        this.department = department;
        this.justification = justification;
        this.proposedBudget = proposedBudget;
        this.totalRequested = totalRequested;
    }

    public void approveBudget() {
        // Logic to approve the budget
        System.out.println("Budget for " + department + " approved with amount: " + proposedBudget);
    }

    public void rejectBudget() {
        // Logic to reject the budget
        System.out.println("Budget for " + department + " rejected.");
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

    public double getTotalRequested() {
        return totalRequested;
    }

    public void setTotalRequested(double totalRequested) {
        this.totalRequested = totalRequested;
    }

    @Override
    public String toString() {
        return "Budget{" +
                "department='" + department + '\'' +
                ", justification='" + justification + '\'' +
                ", proposedBudget=" + proposedBudget +
                ", totalRequested=" + totalRequested +
                '}';
    }
}
