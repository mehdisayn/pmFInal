package dsit.pmfinal.rrhin.accountant.Controller;

import dsit.pmfinal.common_files.Jumper;
import dsit.pmfinal.rrhin.accountant.model.FinancialStatements;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;

public class FinancialStatementsController
{
    @javafx.fxml.FXML
    private TableView <FinancialStatements> financialStatementTableView;
    @javafx.fxml.FXML
    private TableColumn <FinancialStatements,Integer> amountCol;
    @javafx.fxml.FXML
    private ComboBox <String> selectPeriodComboBox;
    @javafx.fxml.FXML
    private ComboBox <String> statementTypeComboBox;
    @javafx.fxml.FXML
    private TableColumn <FinancialStatements,String> itemCol;

    @javafx.fxml.FXML
    public void initialize() {
        selectPeriodComboBox.getItems().addAll("Last Month", "Last Quarter", "Last Year");
        statementTypeComboBox.getItems().addAll("Income Statement", "Balance Sheet", "Cash Flow Statement");

        amountCol.setCellValueFactory(new PropertyValueFactory<FinancialStatements,Integer>("Amount"));
        itemCol.setCellValueFactory(new PropertyValueFactory<FinancialStatements,String>("Item"));
    }

    @javafx.fxml.FXML
    public void handleGenStatementButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleHomeButton(ActionEvent actionEvent) {
        Jumper.jump((Node)actionEvent.getSource(),"rrhin.accountant","accountant-dashboard.fxml","Accountant Dashboard");
    }

    @javafx.fxml.FXML
    public void handleDownloadButton(ActionEvent actionEvent) {
    }
}