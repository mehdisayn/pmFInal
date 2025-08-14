package dsit.pmfinal.meddy.factoryManager;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ProductionPlanningController
{

    @javafx.fxml.FXML
    private TableColumn columnPlanned;
    @javafx.fxml.FXML
    private TableView tableviewPlan;
    @javafx.fxml.FXML
    private TableColumn columnAvailableStock;
    @javafx.fxml.FXML
    private ComboBox comboboxProductType;
    @javafx.fxml.FXML
    private DatePicker datepickerProductionDate;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void btnBack(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void btnSendnNotify(ActionEvent actionEvent) {
    }
}