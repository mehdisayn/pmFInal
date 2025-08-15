package dsit.pmfinal.rrhin.accountant.Controller;

import dsit.pmfinal.rrhin.accountant.model.TaxAudit;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;

public class TaxAuditController
{
    @javafx.fxml.FXML
    private TextArea taxAndAuditTextArea;
    @javafx.fxml.FXML
    private TableColumn <TaxAudit,Double> amountCol;
    @javafx.fxml.FXML
    private TableColumn <TaxAudit,String> statusCol;
    @javafx.fxml.FXML
    private TableView <TaxAudit> taxAndAuditTableView;
    @javafx.fxml.FXML
    private TableColumn <TaxAudit,String> taxTypeCol;

    @javafx.fxml.FXML
    public void initialize() {
        amountCol.setCellValueFactory(new PropertyValueFactory<TaxAudit,Double>("Amount"));
        statusCol.setCellValueFactory(new PropertyValueFactory<TaxAudit,String>("Status"));
        taxTypeCol.setCellValueFactory(new PropertyValueFactory<TaxAudit,String>("Tax Type"));
    }

    @javafx.fxml.FXML
    public void handleExportForAuditButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleHomeButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleGenTaxReportButton(ActionEvent actionEvent) {
    }
}