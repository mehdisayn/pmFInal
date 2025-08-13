package dsit.pmfinal.rrhin.accountant.Controller;

import dsit.pmfinal.rrhin.accountant.model.SalesIncome;
import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class SalesIncomeController
{
    @javafx.fxml.FXML
    private DatePicker saleDateDatePicker;
    @javafx.fxml.FXML
    private TableColumn <SalesIncome,Double> amountCol;
    @javafx.fxml.FXML
    private TableColumn <SalesIncome,String> dateCol;
    @javafx.fxml.FXML
    private TableView <SalesIncome> logSalesIncomeTableView;
    @javafx.fxml.FXML
    private TableColumn <SalesIncome,String> clientNameCol;
    @javafx.fxml.FXML
    private TextField amountTextField;
    @javafx.fxml.FXML
    private TextField clientNameTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleHomeButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleLogSaleButton(ActionEvent actionEvent) {
    }
}