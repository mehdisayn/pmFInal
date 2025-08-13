package dsit.pmfinal.meddy.ceo.controller;

import dsit.pmfinal.meddy.ceo.model.MaintenanceReview;
import dsit.pmfinal.meddy.utility.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class MaintenanceReviewController
{
    @javafx.fxml.FXML
    private TableColumn <MaintenanceReview,Integer> columnMachineID;
    @javafx.fxml.FXML
    private TableColumn <MaintenanceReview,String> columnActionTaken;
    @javafx.fxml.FXML
    private Label labelUrgentCount;
    @javafx.fxml.FXML
    private TableView <MaintenanceReview> tableMaintenanceReports;
    @javafx.fxml.FXML
    private TableColumn <MaintenanceReview,String> columnIssue;
    @javafx.fxml.FXML
    private TableColumn <MaintenanceReview,String>columnDate;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void btnBack(ActionEvent actionEvent) {
        SceneSwitcher.switchScene((Node) actionEvent.getSource(), "ceo-dashboard.fxml", "CEO Dashboard");
    }

    @javafx.fxml.FXML
    public void btnAcknowledge(ActionEvent actionEvent) {
    }
}