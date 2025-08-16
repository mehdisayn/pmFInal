package dsit.pmfinal.meddy.factoryManager;

import dsit.pmfinal.common_files.Jumper;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

public class MachineUsageController
{

    @javafx.fxml.FXML
    private TableColumn columnMachineID;
    @javafx.fxml.FXML
    private TableColumn columnStatus;
    @javafx.fxml.FXML
    private TextArea textAreaDowntimeAlart;
    @javafx.fxml.FXML
    private TableView tableviewMachine;
    @javafx.fxml.FXML
    private TableColumn columnEfficiency;
    @javafx.fxml.FXML
    private TableColumn columnHoursUsed;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void btnBack(ActionEvent actionEvent) {
        Jumper.jump((Node)actionEvent.getSource(),"meddy/factoryManager","factory-manager-dashboard.fxml","Factory Manager DashBoard");
    }

    @javafx.fxml.FXML
    public void btnAssignTask(ActionEvent actionEvent) {
    }
}