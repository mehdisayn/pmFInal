package dsit.pmfinal.rrhin.accountant.Controller;

import dsit.pmfinal.rrhin.accountant.model.InventoryValuation;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

public class InventoryValuationController
{
    @javafx.fxml.FXML
    private TableColumn <InventoryValuation,String> unitPriceCol;
    @javafx.fxml.FXML
    private Button handleHomeButton;
    @javafx.fxml.FXML
    private TableColumn <InventoryValuation,String> totalValueCol;
    @javafx.fxml.FXML
    private TableColumn <InventoryValuation,String> quantityCol;
    @javafx.fxml.FXML
    private TextArea inventoryValuationTextArea;
    @javafx.fxml.FXML
    private TableColumn <InventoryValuation,String> itemNameCol;
    @javafx.fxml.FXML
    private TableView <InventoryValuation> inventoryValuationTableView;
    @javafx.fxml.FXML
    private Button handleCalculateValuationButton;

    @javafx.fxml.FXML
    public void initialize() {
    }
}