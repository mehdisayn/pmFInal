package dsit.pmfinal.meddy.ceo.model;

public class MaintenanceReview {
    private String machineID;
    private String issue;
    private String actionTaken;
    private String date;
    private boolean isUrgent;

    public MaintenanceReview(String machineID, String issue, String actionTaken, String date, boolean isUrgent) {
        this.machineID = machineID;
        this.issue = issue;
        this.actionTaken = actionTaken;
        this.date = date;
        this.isUrgent = isUrgent;
    }

    public String getMachineID() {
        return machineID;
    }

    public String getIssue() {
        return issue;
    }

    public String getActionTaken() {
        return actionTaken;
    }

    public String getDate() {
        return date;
    }

    public boolean isUrgent() {
        return isUrgent;
    }

    @Override
    public String toString() {
        return "MaintenanceReview{" +
                "machineID='" + machineID + '\'' +
                ", issue='" + issue + '\'' +
                ", actionTaken='" + actionTaken + '\'' +
                ", date='" + date + '\'' +
                ", isUrgent=" + isUrgent +
                '}';
    }
}
