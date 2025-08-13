package dsit.pmfinal.rrhin.accountant.Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class SalaryReportsController
{
    @javafx.fxml.FXML
    private TableColumn idCol;
    @javafx.fxml.FXML
    private TableColumn salaryCol;
    @javafx.fxml.FXML
    private TableColumn nameCol;
    @javafx.fxml.FXML
    private TableView salaryReportsTableView;
    @javafx.fxml.FXML
    private TableColumn dapermentCol;
    @javafx.fxml.FXML
    private ComboBox <String> selectComboBox;
    @javafx.fxml.FXML
    private TextArea salaryReportsTextArea;
    @javafx.fxml.FXML
    private TableColumn monthCol;
    @javafx.fxml.FXML
    private Button handleGenReportButton;

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