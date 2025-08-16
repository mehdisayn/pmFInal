package dsit.pmfinal.rrhin.accountant.Controller;

import dsit.pmfinal.common_files.Jumper;
import dsit.pmfinal.rrhin.accountant.model.PurchaseApprovals;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.Node;
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

    //dummy list
    private ObservableList<PurchaseApprovals> purchaseApprovalsObservableList = FXCollections.observableArrayList();


    @javafx.fxml.FXML
    public void initialize() {
        itemNameCol.setCellValueFactory(new PropertyValueFactory<>("ItemName"));
        amountCol.setCellValueFactory(new PropertyValueFactory<>("Amount"));
        departmentCol.setCellValueFactory(new PropertyValueFactory<>("Department"));
        requestIdCol.setCellValueFactory(new PropertyValueFactory<>("RequestID"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("Status"));

        purchaseApprovalsObservableList.add(new PurchaseApprovals(1,"Pending","Laptop","IT",120000.0));
        purchaseApprovalsObservableList.add(new PurchaseApprovals(2,"Pending","Printer","Admin",400000.0));
        purchaseApprovalsObservableList.add(new PurchaseApprovals(3,"Approved","Air Conditioner","Operations",60000.0));
        purchaseApprovalsObservableList.add(new PurchaseApprovals(4, "Rejected","Stationery","HR",8000.0));

        purchaseApprovalTableView.setItems(purchaseApprovalsObservableList);

    }

    @javafx.fxml.FXML
    public void handleHomeButton(ActionEvent actionEvent) {
        Jumper.jump((Node)actionEvent.getSource(),"rrhin.accountant","accountant-dashboard.fxml","Accountant Dashboard");
    }

    @javafx.fxml.FXML
    public void handleRejectButton(ActionEvent actionEvent) {
        PurchaseApprovals selected = purchaseApprovalTableView.getSelectionModel().getSelectedItem();
        if (selected !=null){
            selected.setStatus("Rejected");
            purchaseApprovalTableView.refresh();
            purchaseApprovalTextArea.setText("Request " + selected.getRequestID() + "has been Rejected.");
        }
    }

    @javafx.fxml.FXML
    public void handleApproveButton(ActionEvent actionEvent) {
        PurchaseApprovals selected = purchaseApprovalTableView.getSelectionModel().getSelectedItem();
        if(selected!=null){
            selected.setStatus("Approved");
            purchaseApprovalTableView.refresh();
            purchaseApprovalTextArea.setText("Request " + selected.getRequestID()+" has been Approved.");
        }
    }
}