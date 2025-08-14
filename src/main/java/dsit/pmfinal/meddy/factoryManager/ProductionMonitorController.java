package dsit.pmfinal.meddy.factoryManager;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ProductionMonitorController
{
    @javafx.fxml.FXML
    private TableColumn columnActualOutput;
    @javafx.fxml.FXML
    private TableColumn columnTargetOutput;
    @javafx.fxml.FXML
    private TableView tableviewData;
    @javafx.fxml.FXML
    private TableColumn columnShift;
    @javafx.fxml.FXML
    private TableColumn columnDefects;
    @javafx.fxml.FXML
    private Label labelEfficiency;
    @javafx.fxml.FXML
    private TableColumn columnDate;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void btnBack(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void btnRefreshData(ActionEvent actionEvent) {
    }
}