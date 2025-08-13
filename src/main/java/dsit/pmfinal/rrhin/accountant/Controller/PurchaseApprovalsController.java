package dsit.pmfinal.rrhin.accountant.Controller;

import dsit.pmfinal.rrhin.accountant.model.PurchaseApprovals;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

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