package dsit.pmfinal.meddy.ceo.controller;

import dsit.pmfinal.meddy.ceo.model.SalaryApproval;
import dsit.pmfinal.meddy.utility.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class SalaryApprovalController
{
    @javafx.fxml.FXML
    private TableColumn <SalaryApproval,String> columnDept;
    @javafx.fxml.FXML
    private TableColumn <SalaryApproval,Double> columnAmount;
    @javafx.fxml.FXML
    private TableColumn <SalaryApproval,String> columnStatus;
    @javafx.fxml.FXML
    private TableView <SalaryApproval> tableSalarySheet;
    @javafx.fxml.FXML
    private TableColumn <SalaryApproval,String> columnName;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void btnBack(ActionEvent actionEvent) {
        SceneSwitcher.switchScene((Node) actionEvent.getSource(), "ceo-dashboard.fxml", "CEO Dashboard");
    }

    @javafx.fxml.FXML
    public void btnFlagForReview(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void btnApproveAllSalaries(ActionEvent actionEvent) {
    }
}