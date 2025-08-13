package dsit.pmfinal.rrhin.accountant.Controller;

import dsit.pmfinal.rrhin.accountant.model.Expenses;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

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
    }

    @javafx.fxml.FXML
    public void handleHomeButton(ActionEvent actionEvent) {

    }

    @javafx.fxml.FXML
    public void handleAddExpenseButton(ActionEvent actionEvent) {

    }
}