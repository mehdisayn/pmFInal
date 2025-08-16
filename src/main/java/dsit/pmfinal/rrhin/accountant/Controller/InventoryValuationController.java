package dsit.pmfinal.rrhin.accountant.Controller;

import dsit.pmfinal.common_files.Jumper;
import dsit.pmfinal.rrhin.accountant.model.InventoryValuation;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;

public class InventoryValuationController
{
    @javafx.fxml.FXML
    private TableColumn <InventoryValuation,Double> unitPriceCol;
    @javafx.fxml.FXML
    private TableColumn <InventoryValuation,Double> totalValueCol;
    @javafx.fxml.FXML
    private TableColumn <InventoryValuation,Integer> quantityCol;
    @javafx.fxml.FXML
    private TextArea inventoryValuationTextArea;
    @javafx.fxml.FXML
    private TableColumn <InventoryValuation,String> itemNameCol;
    @javafx.fxml.FXML
    private TableView <InventoryValuation> inventoryValuationTableView;

    //dummy obs list
    private ObservableList<InventoryValuation> inventoryValuationObservableList = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
        itemNameCol.setCellValueFactory(new PropertyValueFactory<InventoryValuation,String>("ItemName"));
        quantityCol.setCellValueFactory(new PropertyValueFactory<InventoryValuation,Integer>("Quantity"));
        unitPriceCol.setCellValueFactory(new PropertyValueFactory<InventoryValuation,Double>("UnitPrice"));
        totalValueCol.setCellValueFactory(new PropertyValueFactory<InventoryValuation,Double>("TotalValue"));

        //dummy data
        inventoryValuationObservableList.add(new InventoryValuation("laptop",10,75000.0,750000.0));
        inventoryValuationObservableList.add(new InventoryValuation("Printer",5,15000.0,75000.0));
        inventoryValuationObservableList.add(new InventoryValuation("Desk",20,5000.0,10000.0));

        inventoryValuationTableView.setItems(inventoryValuationObservableList);
    }

    @javafx.fxml.FXML
    public void handleHomeButton(ActionEvent actionEvent) {
        Jumper.jump((Node)actionEvent.getSource(),"rrhin.accountant","accountant-dashboard","Accountant Dashboard");
    }

    @javafx.fxml.FXML
    public void handleCalculateValuationButton(ActionEvent actionEvent) {
        double total = 0;
        for (InventoryValuation item:inventoryValuationObservableList){
            total+=item.getTotalvalue();
        }
        inventoryValuationTextArea.setStyle("-fx-inner-control-background: #E74C3C;");
        inventoryValuationTextArea.setText("Total Inventory Value: "+total);
    }
}