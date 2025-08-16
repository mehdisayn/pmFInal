package dsit.pmfinal.meddy.ceo.controller;


import dsit.pmfinal.meddy.ceo.model.Budget;
import dsit.pmfinal.meddy.ceo.model.Ceo;
import dsit.pmfinal.meddy.utility.SceneSwitcher;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.Objects;

import static javafx.collections.FXCollections.observableArrayList;

public class BudgetApprovalController {
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
    private ComboBox<String> comboboxObs;
    @javafx.fxml.FXML
    private TableColumn<Budget, String> columnObs;
    @javafx.fxml.FXML
    private TableColumn<Budget, String> columnStatus;

    Ceo ceo;

    // Dummy list of budget proposals for demonstration purposes
    ObservableList<Budget> budgetProposals = FXCollections.observableArrayList();



    @javafx.fxml.FXML
    public void initialize() {
        /*/ Initialize the CEO object
        Budget dummyBudget1 = ceo.budgetApproval("756", "Marketing", "Increase brand awareness", 50000, "Pending");
        Budget dummyBudget2 = ceo.budgetApproval("212", "Research", "New product development", 75000, "Pending");
        Budget dummyBudget3 = ceo.budgetApproval("345", "Operations", "Efficiency improvements", 30000, "Pending");
        /*/
        /*/ Add dummy budgets to the list
        budgetProposals.add(dummyBudget1);
        budgetProposals.add(dummyBudget2);
        budgetProposals.add(dummyBudget3);
        /*/


        // Initialize the dummy table columns

        budgetProposals.add(new Budget("756","Marketing", "Increase brand awareness", 50000, "Pending"));
        budgetProposals.add(new Budget("212","Research", "New product development", 75000, "Pending"));
        budgetProposals.add(new Budget("345","Operations", "Efficiency improvements", 30000, "Pending"));



        columnObs.setCellValueFactory(new PropertyValueFactory<>("obs"));
        columnDept.setCellValueFactory(new PropertyValueFactory<>("department"));
        columnJustification.setCellValueFactory(new PropertyValueFactory<>("justification"));
        columnProposedBudget.setCellValueFactory(new PropertyValueFactory<>("proposedBudget"));
        columnStatus.setCellValueFactory(new PropertyValueFactory<>("status"));



        // Initialize the combobox with dummy data
        comboboxObs.setItems(observableArrayList("756", "212", "345"));



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

     /*   String obs = comboboxObs.getValue();

        for (Budget budget : budgetProposals) {
            if (Objects.equals((budget.getObs()), obs)) {
                //budget.setStatus("Approved");
                this.ceo.budgetApproval(budget, "Approved");
                break;
            }
        }*/



         //when i select combobox obs and press approve, it will calculate the total requested budget only for that Obs and display it in the label
        // and also change the status of the budget proposals to "Approved"

        String selectedObs = comboboxObs.getValue();

        if (selectedObs != null) {
            double total = 0;
            total += budgetProposals.stream()
                    .filter(b -> selectedObs.equals(b.getObs()))
                    .mapToDouble(Budget::getProposedBudget)
                    .sum();

            labelTotalRequested.setText(total + " bdt");
            budgetProposals.stream()
                    .filter(b -> selectedObs.equals(b.getObs()))
                    .forEach(b -> b.setStatus("Approved"));
            tableBudgetProposals.refresh(); // Refresh the table to show updated status




            //save approved budget to database
        }

    }

    @javafx.fxml.FXML
    public void btnReject(ActionEvent actionEvent) {
        /*String obs = comboboxObs.getValue();

        for (Budget budget : budgetProposals) {
            if (Objects.equals((budget.getObs()), obs)) {
                //budget.setStatus("Approved");
                this.ceo.budgetApproval(budget, "Approved");
                System.out.println("Budget proposal for " + budget.getObs() + " has been rejected.");
                break;

            }
        }*/


        String selectedObs = comboboxObs.getValue();
        if (selectedObs != null) {
            budgetProposals.stream()
                    .filter(b -> selectedObs.equals(b.getObs()))
                    .forEach(b -> b.setStatus("Rejected"));
            tableBudgetProposals.refresh();
        }
    }
}