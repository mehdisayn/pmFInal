package dsit.pmfinal.rrhin.accountant.Controller;

import dsit.pmfinal.common_files.Jumper;
import dsit.pmfinal.rrhin.accountant.model.Expenses;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.collections.ObservableList;

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

    //Dummy list of expenses
    private ObservableList<Expenses> expensesList = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
        categoryComBobox.getItems().addAll("Office Supplies", "Utilities", "Salaries", "Maintenance", "Marketing", "Other");

        expenseIdCol.setCellValueFactory(new PropertyValueFactory<Expenses,Integer>("Expense ID"));
        categoryCol.setCellValueFactory(new PropertyValueFactory<Expenses,String>("Category"));
        amountCol.setCellValueFactory(new PropertyValueFactory<Expenses,Double>("Amount"));
        dateCol.setCellValueFactory(new PropertyValueFactory<Expenses,String>("Date"));

        expensesList.add(new Expenses("2025-08-05",2500.00,"Office Supplies"));
        expensesList.add(new Expenses("2025-08-10",4500.00,"Utilities"));
        expensesList.add(new Expenses("2025-08-01",300000.00,"Salaries"));
        expensesList.add(new Expenses("2025-08-12",7000.00,"Marketing"));

        trackExpensesTableView.setItems(expensesList);
    }

    @javafx.fxml.FXML
    public void handleHomeButton(ActionEvent actionEvent) {
        Jumper.jump((Node)actionEvent.getSource(),"rrihn.accountant","accountant-dashboard.fxml","Accountant Dashboard");

    }

    @javafx.fxml.FXML
    public void handleAddExpenseButton(ActionEvent actionEvent) {
        try {
            //gen new ID
            int newId = expensesList.size()+1;
            //taking input values
            String category = categoryComBobox.getValue();
            double amount = Double.parseDouble(amountTextField.getText());
            String date = (dateDatePicker.getValue()!=null)?dateDatePicker.getValue().toString():"N/A";
            //Create new expenses and adding to the list
            Expenses newExpense = new Expenses(date,amount,category);
            expensesList.add(newExpense);

            trackExpensesTableView.setItems(expensesList);
            //inputs
            amountTextField.clear();
            dateDatePicker.setValue(null);
            categoryComBobox.setValue(null);

        } catch (Exception e){
            System.out.println("Error adding expenses: "+e.getMessage());
        }
    }
}