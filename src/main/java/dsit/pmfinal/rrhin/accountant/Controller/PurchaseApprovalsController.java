package dsit.pmfinal.rrhin.accountant.Controller;

import dsit.pmfinal.rrhin.accountant.model.PurchaseApprovals;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;

public class PurchaseApprovalsController
{
    @javafx.fxml.FXML
    private TableColumn <PurchaseApprovals,String> departmentCol;
    @javafx.fxml.FXML
    private TableColumn <PurchaseApprovals,Double> amountCol;
    @javafx.fxml.FXML
    private TableColumn <PurchaseApprovals,String> statusCol;
    @javafx.fxml.FXML
    private TableView <PurchaseApprovals> purchaseApprovalTableView;
    @javafx.fxml.FXML
    private TableColumn <PurchaseApprovals,Integer> requestIdCol;
    @javafx.fxml.FXML
    private TextArea purchaseApprovalTextArea;
    @javafx.fxml.FXML
    private TableColumn <PurchaseApprovals,String> itemNameCol;

    @javafx.fxml.FXML
    public void initialize() {
        itemNameCol.setCellValueFactory(new PropertyValueFactory<PurchaseApprovals,String>("Item Name"));
        amountCol.setCellValueFactory(new PropertyValueFactory<PurchaseApprovals,Double>("Amount"));
        departmentCol.setCellValueFactory(new PropertyValueFactory<PurchaseApprovals,String>("Department"));
        requestIdCol.setCellValueFactory(new PropertyValueFactory<PurchaseApprovals,Integer>("Request ID"));
        statusCol.setCellValueFactory(new PropertyValueFactory<PurchaseApprovals,String>("Status"));
    }

    @javafx.fxml.FXML
    public void handleHomeButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleRejectButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleApproveButton(ActionEvent actionEvent) {
    }
}