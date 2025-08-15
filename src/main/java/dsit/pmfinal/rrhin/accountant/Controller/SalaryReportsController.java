package dsit.pmfinal.rrhin.accountant.Controller;

import dsit.pmfinal.rrhin.accountant.model.PurchaseApprovals;
import dsit.pmfinal.rrhin.accountant.model.SalaryReports;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

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
    private TableColumn <PurchaseApprovals,String> monthCol;

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
    }

    @javafx.fxml.FXML
    public void handleHomeButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleExportPDFButton(ActionEvent actionEvent) {
    }
}