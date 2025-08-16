package dsit.pmfinal.meddy.ceo.model;

import java.io.Serializable;

public class HrDecisions implements Serializable {

    // Hr Has-a HrDecisions

    private String name;
    private String position;
    private String justification;
    private String action;
    private String status;


    //Constructor


    public HrDecisions(String name, String position, String justification, String action, String status) {
        this.name = name;
        this.position = position;
        this.justification = justification;
        this.action = action;
        this.status = status;
    }

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getJustification() {
        return justification;
    }

    public void setJustification(String justification) {
        this.justification = justification;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // toString

    @Override
    public String toString() {
        return "HrDecisions{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", justification='" + justification + '\'' +
                ", action='" + action + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    // Methods

    public void approve() {
        this.status = "Approved";
        // Save the decision to the database

    }
    public void reject() {
        this.status = "Rejected";
        // Save the decision to the database
    }


}
