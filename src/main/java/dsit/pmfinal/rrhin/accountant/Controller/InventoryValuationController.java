package dsit.pmfinal.rrhin.accountant.Controller;

import dsit.pmfinal.rrhin.accountant.model.InventoryValuation;
import javafx.event.ActionEvent;
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

    @javafx.fxml.FXML
    public void initialize() {
        itemNameCol.setCellValueFactory(new PropertyValueFactory<InventoryValuation,String>("Item Name"));
        quantityCol.setCellValueFactory(new PropertyValueFactory<InventoryValuation,Integer>("Quantity"));
        unitPriceCol.setCellValueFactory(new PropertyValueFactory<InventoryValuation,Double>("Unit Price"));
        totalValueCol.setCellValueFactory(new PropertyValueFactory<InventoryValuation,Double>("Total Value"));
    }

    @javafx.fxml.FXML
    public void handleHomeButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleCalculateValuationButton(ActionEvent actionEvent) {
    }
}