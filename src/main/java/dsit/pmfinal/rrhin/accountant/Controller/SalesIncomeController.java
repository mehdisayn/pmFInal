package dsit.pmfinal.rrhin.accountant.Controller;

import dsit.pmfinal.common_files.Jumper;
import dsit.pmfinal.rrhin.accountant.model.SalesIncome;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

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

    //dummy List
    private ObservableList<SalesIncome> salesIncomeObservableList= FXCollections.observableArrayList();


    @javafx.fxml.FXML
    public void initialize() {
        clientNameCol.setCellValueFactory(new PropertyValueFactory<>("Client Name"));
        amountCol.setCellValueFactory(new PropertyValueFactory<>("Amount"));
        dateCol.setCellValueFactory(new PropertyValueFactory<>("Date"));

        //data
        salesIncomeObservableList.add(new SalesIncome(LocalDate.of(2025,1,15),1200.00,"Meddy"));
        salesIncomeObservableList.add(new SalesIncome(LocalDate.of(2025,1,20),850.00,"Hares"));
        salesIncomeObservableList.add(new SalesIncome(LocalDate.of(2025,2,05),430.00,"Galib"));

        logSalesIncomeTableView.setItems(salesIncomeObservableList);
    }

    @javafx.fxml.FXML
    public void handleHomeButton(ActionEvent actionEvent) {
        Jumper.jump((Node)actionEvent.getSource(),"rrhin.accountant","accountant-dashboard","Accountant Dashboard");
        System.out.println("Return to Accountant Dashboard");
    }

    @javafx.fxml.FXML
    public void handleLogSaleButton(ActionEvent actionEvent) {
        if (clientNameTextField.getText().isEmpty() || amountTextField.getText().isEmpty() || saleDateDatePicker.getValue() == null) {
            System.out.println("Fill all fields first!");
            return;
        }

        double amount = Double.parseDouble(amountTextField.getText());
        String client = clientNameTextField.getText();
        LocalDate date = saleDateDatePicker.getValue();

        SalesIncome newSale = new SalesIncome(date, amount, client);
        salesIncomeObservableList.add(newSale);

        // Clear input fields
        clientNameTextField.clear();
        amountTextField.clear();
        saleDateDatePicker.setValue(null);
    }
}