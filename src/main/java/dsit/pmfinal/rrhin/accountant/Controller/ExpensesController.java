package dsit.pmfinal.rrhin.accountant.Controller;

import dsit.pmfinal.rrhin.accountant.model.Expenses;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class ExpensesController
{
    @javafx.fxml.FXML
    private TableView <Expenses> trackExpensesTableView;
    @javafx.fxml.FXML
    private DatePicker dateDatePicker;
    @javafx.fxml.FXML
    private TableColumn <Expenses,Double> amountCol;
    @javafx.fxml.FXML
    private TableColumn <Expenses,String> dateCol;
    @javafx.fxml.FXML
    private TextField amountTextField;
    @javafx.fxml.FXML
    private TableColumn <Expenses,Integer> expenseIdCol;
    @javafx.fxml.FXML
    private TableColumn <Expenses,String> categoryCol;
    @javafx.fxml.FXML
    private ComboBox <String> categoryComBobox;

    @javafx.fxml.FXML
    public void initialize() {
        categoryComBobox.getItems().addAll("Office Supplies", "Utilities", "Salaries", "Maintenance", "Marketing", "Other");

        expenseIdCol.setCellValueFactory(new PropertyValueFactory<Expenses,Integer>("Expense ID"));
        categoryCol.setCellValueFactory(new PropertyValueFactory<Expenses,String>("Category"));
        amountCol.setCellValueFactory(new PropertyValueFactory<Expenses,Double>("Amount"));
        dateCol.setCellValueFactory(new PropertyValueFactory<Expenses,String>("Date"));
    }

    @javafx.fxml.FXML
    public void handleHomeButton(ActionEvent actionEvent) {

    }

    @javafx.fxml.FXML
    public void handleAddExpenseButton(ActionEvent actionEvent) {

    }
}