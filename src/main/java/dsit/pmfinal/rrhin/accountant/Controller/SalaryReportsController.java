package dsit.pmfinal.rrhin.accountant.Controller;

import dsit.pmfinal.rrhin.accountant.model.PurchaseApprovals;
import dsit.pmfinal.rrhin.accountant.model.SalaryReports;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class SalaryReportsController
{
    @javafx.fxml.FXML
    private TableColumn <SalaryReports,Integer> idCol;
    @javafx.fxml.FXML
    private TableColumn <SalaryReports,Double> salaryCol;
    @javafx.fxml.FXML
    private TableColumn <SalaryReports,String> nameCol;
    @javafx.fxml.FXML
    private TableView <SalaryReports> salaryReportsTableView;
    @javafx.fxml.FXML
    private TableColumn <SalaryReports,String> dapermentCol;
    @javafx.fxml.FXML
    private ComboBox <String> selectComboBox;
    @javafx.fxml.FXML
    private TextArea salaryReportsTextArea;
    @javafx.fxml.FXML
    private TableColumn <SalaryReports,String> monthCol;

    @javafx.fxml.FXML
    public void initialize() {
        selectComboBox.getItems().addAll("January",
                "February",
                "March",
                "April",
                "May",
                "June",
                "July",
                "August",
                "September",
                "October",
                "November",
                "December");
        nameCol.setCellValueFactory(new PropertyValueFactory<SalaryReports,String>("Name"));
        idCol.setCellValueFactory(new PropertyValueFactory<SalaryReports,Integer>("Id"));
        salaryCol.setCellValueFactory(new PropertyValueFactory<SalaryReports,Double>("Salary"));
        //monthCol.setCellValueFactory(new PropertyValueFactory<SalaryReports,String>("Month"));
        monthCol.setCellValueFactory(new PropertyValueFactory<SalaryReports,String>("Month"));
        dapermentCol.setCellValueFactory(new PropertyValueFactory<SalaryReports,String>("Department"));

    }

    @javafx.fxml.FXML
    public void handleHomeButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleExportPDFButton(ActionEvent actionEvent) {
    }
}