package dsit.pmfinal.meddy.ceo.controller;

import dsit.pmfinal.meddy.ceo.model.HRDecisions;
import dsit.pmfinal.meddy.utility.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class HRDecisionsController
{
    @javafx.fxml.FXML
    private TableColumn <HRDecisions,String> columnJustification;
    @javafx.fxml.FXML
    private TableColumn <HRDecisions,String> columnPosition;
    @javafx.fxml.FXML
    private TableView <HRDecisions> tableHRRequests;
    @javafx.fxml.FXML
    private TableColumn <HRDecisions,String> columnAction;
    @javafx.fxml.FXML
    private TableColumn <HRDecisions,String> columnName;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void btnBack(ActionEvent actionEvent) {
        SceneSwitcher.switchScene((Node) actionEvent.getSource(), "ceo", "ceo-dashboard.fxml", "CEO Dashboard");
    }

    @javafx.fxml.FXML
    public void btnRejectHRAction(ActionEvent actionEvent) {

    }

    @javafx.fxml.FXML
    public void btnApproveHRAction(ActionEvent actionEvent) {
    }
}