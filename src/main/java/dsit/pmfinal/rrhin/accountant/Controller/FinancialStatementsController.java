package dsit.pmfinal.rrhin.accountant.Controller;

import dsit.pmfinal.common_files.Jumper;
import dsit.pmfinal.rrhin.accountant.model.FinancialStatements;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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

    //dummy list for Financial Statement
    private final ObservableList<FinancialStatements> financialStatementsList = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
        selectPeriodComboBox.getItems().addAll("Last Month", "Last Quarter", "Last Year");
        statementTypeComboBox.getItems().addAll("Income Statement", "Balance Sheet", "Cash Flow Statement");

        amountCol.setCellValueFactory(new PropertyValueFactory<FinancialStatements,Integer>("Amount"));
        itemCol.setCellValueFactory(new PropertyValueFactory<FinancialStatements,String>("Item"));

        financialStatementsList.add(new FinancialStatements("Last Month","Balance Sheet"));
        financialStatementsList.add(new FinancialStatements("Last Year","Income Statement"));
        financialStatementsList.add(new FinancialStatements("Last Month","Cash Flow Statement"));
        financialStatementsList.add(new FinancialStatements("Last Quarter","Balance Sheet"));

        financialStatementTableView.setItems(financialStatementsList);
    }

    @javafx.fxml.FXML
    public void handleGenStatementButton(ActionEvent actionEvent) {
        try{
            int newID = financialStatementsList.size()+1;
            String period = selectPeriodComboBox.getValue();
            String statementType = statementTypeComboBox.getValue();
            FinancialStatements newFinancialStatementType = new FinancialStatements(period,statementType);
            financialStatementsList.add(newFinancialStatementType);

            financialStatementTableView.setItems(financialStatementsList);
            //inputs
            selectPeriodComboBox.setValue(null);
            statementTypeComboBox.setValue(null);
        }catch (Exception e){
            System.out.println("Error adding Financial Statement"+e.getMessage());
        }
    }

    @javafx.fxml.FXML
    public void handleHomeButton(ActionEvent actionEvent) {
        Jumper.jump((Node)actionEvent.getSource(),"rrhin.accountant","accountant-dashboard.fxml","Accountant Dashboard");
    }

    @javafx.fxml.FXML
    public void handleDownloadButton(ActionEvent actionEvent) {
    }
}