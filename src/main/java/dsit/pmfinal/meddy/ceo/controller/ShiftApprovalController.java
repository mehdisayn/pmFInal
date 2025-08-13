package dsit.pmfinal.meddy.ceo.controller;

import dsit.pmfinal.meddy.ceo.model.ShiftApproval;
import dsit.pmfinal.meddy.utility.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ShiftApprovalController
{
    @javafx.fxml.FXML
    private TableColumn <ShiftApproval,String> columnStatus;
    @javafx.fxml.FXML
    private TableView <ShiftApproval> tableShiftRequests;
    @javafx.fxml.FXML
    private TableColumn <ShiftApproval,String> columnShift;
    @javafx.fxml.FXML
    private TableColumn <ShiftApproval,String> columnDate;
    @javafx.fxml.FXML
    private TableColumn <ShiftApproval,String> columnReqBy;

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