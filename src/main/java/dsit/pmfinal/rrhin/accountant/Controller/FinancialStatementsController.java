package dsit.pmfinal.rrhin.accountant.Controller;

import dsit.pmfinal.rrhin.accountant.model.FinancialStatements;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

public class FinancialStatementsController
{
    @javafx.fxml.FXML
    private TableColumn <FinancialStatements,String> typeCol;
    @javafx.fxml.FXML
    private TableView <FinancialStatements> financialStatementTableView;
    @javafx.fxml.FXML
    private TableColumn <FinancialStatements,String> amountCol;
    @javafx.fxml.FXML
    private TableColumn <FinancialStatements,String> categoryCol;
    @javafx.fxml.FXML
    private ComboBox <String> selectMonthComboBox;
    @javafx.fxml.FXML
    private TextArea profitLossTextArea;

    @javafx.fxml.FXML
    public void initialize() {
        selectMonthComboBox.getItems().addAll("January",
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
    public void handleGenStatementButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleHomeButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleExportPDFButton(ActionEvent actionEvent) {
    }
}