package dsit.pmfinal.meddy.ceo.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class MaintenanceReviewController
{
    @javafx.fxml.FXML
    private TableColumn columnMachineID;
    @javafx.fxml.FXML
    private TableColumn columnActionTaken;
    @javafx.fxml.FXML
    private Label labelUrgentCount;
    @javafx.fxml.FXML
    private TableView tableMaintenanceReports;
    @javafx.fxml.FXML
    private TableColumn columnIssue;
    @javafx.fxml.FXML
    private TableColumn columnDate;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void btnBack(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void btnAcknowledge(ActionEvent actionEvent) {
    }
}