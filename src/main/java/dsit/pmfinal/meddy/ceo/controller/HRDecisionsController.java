package dsit.pmfinal.meddy.ceo.controller;

import dsit.pmfinal.meddy.utility.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class HRDecisionsController
{
    @javafx.fxml.FXML
    private TableColumn columnJustification;
    @javafx.fxml.FXML
    private TableColumn columnPosition;
    @javafx.fxml.FXML
    private TableView tableHRRequests;
    @javafx.fxml.FXML
    private TableColumn columnAction;
    @javafx.fxml.FXML
    private TableColumn columnName;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void btnBack(ActionEvent actionEvent) {
        SceneSwitcher.switchScene((Node) actionEvent.getSource(), "ceo-dashboard.fxml", "CEO Dashboard");
    }

    @javafx.fxml.FXML
    public void btnRejectHRAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void btnApproveHRAction(ActionEvent actionEvent) {
    }
}