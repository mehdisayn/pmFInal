package dsit.pmfinal.meddy.ceo.controller;


import dsit.pmfinal.meddy.ceo.model.Budget;
import dsit.pmfinal.meddy.utility.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class BudgetApprovalController
{
    @javafx.fxml.FXML
    private TableColumn <Budget, String> columnDept;
    @javafx.fxml.FXML
    private TableView <Budget>tableBudgetProposals;
    @javafx.fxml.FXML
    private TableColumn <Budget, String>columnJustification;
    @javafx.fxml.FXML
    private Label labelTotalRequested;
    @javafx.fxml.FXML
    private TableColumn <Budget, Double>columnProposedBudget;

    @javafx.fxml.FXML
    public void initialize() {




    }

    @javafx.fxml.FXML
    public void btnBack(ActionEvent actionEvent) {
        SceneSwitcher.switchScene((Node) actionEvent.getSource(), "ceo", "ceo-dashboard.fxml", "CEO Dashboard");
    }

    @javafx.fxml.FXML
    public void btnApprove(ActionEvent actionEvent) {


    }

    @javafx.fxml.FXML
    public void btnReject(ActionEvent actionEvent) {
    }
}