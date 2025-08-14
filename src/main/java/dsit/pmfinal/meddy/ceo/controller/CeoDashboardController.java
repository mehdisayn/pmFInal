package dsit.pmfinal.meddy.ceo.controller;

import dsit.pmfinal.PrimarySceneSwitcher;
import dsit.pmfinal.meddy.utility.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.Label;

public class CeoDashboardController
{
    @javafx.fxml.FXML
    private Label notificationsLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void btnViewProduction(ActionEvent actionEvent) {
      //  SceneSwitcher.switchScene((Node) actionEvent.getSource(), "production-overview.fxml", "Production Overview");
        SceneSwitcher.switchScene((Node) actionEvent.getSource(), "ceo", "production-overview.fxml", "Production Overview");

    }

    @javafx.fxml.FXML
    public void btnLogout(ActionEvent actionEvent) {
        PrimarySceneSwitcher.primarySwitchScene((Node) actionEvent.getSource(), "login.fxml", "Login");

    }

    @javafx.fxml.FXML
    public void btnDepartmentPerformance(ActionEvent actionEvent) {
        SceneSwitcher.switchScene((Node) actionEvent.getSource(),"ceo", "department-overview.fxml", "Department Overview");
    }

    @javafx.fxml.FXML
    public void btnApproveShifts(ActionEvent actionEvent) {
        SceneSwitcher.switchScene((Node) actionEvent.getSource(), "ceo", "shift-approval.fxml", "Shift Approval");
    }

    @javafx.fxml.FXML
    public void btnReviewMaintenance(ActionEvent actionEvent) {
        SceneSwitcher.switchScene((Node) actionEvent.getSource(), "ceo", "maintenance-review.fxml", "Maintenance Review");
    }


    @javafx.fxml.FXML
    public void btnReviewHRDecisions(ActionEvent actionEvent) {
        SceneSwitcher.switchScene((Node) actionEvent.getSource(), "ceo", "hr-decisions.fxml", "HR Decisions");
    }

    @javafx.fxml.FXML
    public void btnApproveBudget(ActionEvent actionEvent) {
        SceneSwitcher.switchScene((Node) actionEvent.getSource(), "ceo", "budget-approval.fxml", "Budget Approval");
    }

    @javafx.fxml.FXML
    public void btnApproveSalaries(ActionEvent actionEvent) {
        SceneSwitcher.switchScene((Node) actionEvent.getSource(), "ceo", "salary-approval.fxml", "Salary Approval");
    }

    @javafx.fxml.FXML
    public void btnStrategicPlanning(ActionEvent actionEvent) {
        SceneSwitcher.switchScene((Node) actionEvent.getSource(), "ceo", "strategic-planning.fxml", "Strategic Planning");
    }
}