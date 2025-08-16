package dsit.pmfinal.rrhin.accountant.Controller;

import dsit.pmfinal.common_files.Jumper;
import dsit.pmfinal.rrhin.accountant.model.TaxAudit;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.Node;
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

    //dummy list
    private ObservableList<TaxAudit> taxAuditObservableList = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
        amountCol.setCellValueFactory(new PropertyValueFactory<>("Amount"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("Status"));
        taxTypeCol.setCellValueFactory(new PropertyValueFactory<>("TaxType"));

        taxAuditObservableList.add(new TaxAudit(5000, "Pending", "Income Tax"));
        taxAuditObservableList.add(new TaxAudit(12000, "Approved", "VAT"));
        taxAuditObservableList.add(new TaxAudit(7000, "Rejected", "Corporate Tax"));

        taxAndAuditTableView.setItems(taxAuditObservableList);

    }

    @javafx.fxml.FXML
    public void handleExportForAuditButton(ActionEvent actionEvent) {
        TaxAudit selected = taxAndAuditTableView.getSelectionModel().getSelectedItem();
        if (selected != null) {
            taxAndAuditTextArea.setText("Exported audit for: " + selected.getTaxType() + ", Amount: " + selected.getAmount());
        } else {
            taxAndAuditTextArea.setText("Select a row first.");
        }
    }

    @javafx.fxml.FXML
    public void handleHomeButton(ActionEvent actionEvent) {
        Jumper.jump((Node)actionEvent.getSource(),"rrhin.accountant","accountant-dashboard.fxml","Accountant Dashboard");
    }

    @javafx.fxml.FXML
    public void handleGenTaxReportButton(ActionEvent actionEvent) {
        taxAndAuditTextArea.setText("Total audits: " + taxAuditObservableList.size());
    }
}