package dsit.pmfinal.meddy.ceo.controller;


import dsit.pmfinal.meddy.ceo.model.Budget;
import dsit.pmfinal.meddy.utility.SceneSwitcher;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import static javafx.collections.FXCollections.observableArrayList;

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


    // Dummy list of budget proposals for demonstration purposes
    ObservableList<Budget> budgetProposals = FXCollections.observableArrayList();



    @javafx.fxml.FXML
    public void initialize() {

        // Initialize the dummy table columns
        budgetProposals.add(new Budget("Marketing", "Increase brand awareness", 50000));
        budgetProposals.add(new Budget("Research", "New product development", 75000));
        budgetProposals.add(new Budget("Operations", "Efficiency improvements", 30000));



        columnDept.setCellValueFactory(new PropertyValueFactory<>("department"));
        columnJustification.setCellValueFactory(new PropertyValueFactory<>("justification"));
        columnProposedBudget.setCellValueFactory(new PropertyValueFactory<>("proposedBudget"));


        for (Budget budget : budgetProposals) {
            tableBudgetProposals.getItems().add(budget);
        }




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