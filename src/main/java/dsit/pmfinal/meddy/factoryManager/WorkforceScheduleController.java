package dsit.pmfinal.meddy.factoryManager;

import dsit.pmfinal.common_files.Jumper;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class WorkforceScheduleController
{

    @javafx.fxml.FXML
    private TableView tableviewSchedule;
    @javafx.fxml.FXML
    private TableColumn columnEmployee;
    @javafx.fxml.FXML
    private ComboBox comboShift;
    @javafx.fxml.FXML
    private ComboBox comboboxEmployeeList;
    @javafx.fxml.FXML
    private TableColumn columnShift;
    @javafx.fxml.FXML
    private TableColumn columnDate;
    @javafx.fxml.FXML
    private DatePicker datepickerScheduleDate;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void btnBack(ActionEvent actionEvent) {
        Jumper.jump((Node)actionEvent.getSource(),"meddy/factoryManager","factory-manager-dashboard.fxml","Factory Manager DashBoard");
    }

    @javafx.fxml.FXML
    public void btnSaveSchedule(ActionEvent actionEvent) {
    }
}