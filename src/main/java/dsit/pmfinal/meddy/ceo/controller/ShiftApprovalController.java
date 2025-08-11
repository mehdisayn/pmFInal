package dsit.pmfinal.meddy.ceo.controller;

import dsit.pmfinal.meddy.utility.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ShiftApprovalController
{
    @javafx.fxml.FXML
    private TableColumn columnStatus;
    @javafx.fxml.FXML
    private TableView tableShiftRequests;
    @javafx.fxml.FXML
    private TableColumn columnShift;
    @javafx.fxml.FXML
    private TableColumn columnDate;
    @javafx.fxml.FXML
    private TableColumn columnReqBy;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void btnBack(ActionEvent actionEvent) {
        SceneSwitcher.switchScene((Node) actionEvent.getSource(), "ceo-dashboard.fxml", "CEO Dashboard");
    }

    @javafx.fxml.FXML
    public void bntApprove(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void btnReject(ActionEvent actionEvent) {
    }
}