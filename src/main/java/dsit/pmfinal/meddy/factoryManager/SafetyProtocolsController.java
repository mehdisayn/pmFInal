package dsit.pmfinal.meddy.factoryManager;

import dsit.pmfinal.common_files.Jumper;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class SafetyProtocolsController
{

    @javafx.fxml.FXML
    private TableColumn columnProtocolID;
    @javafx.fxml.FXML
    private TableColumn columnCompliance;
    @javafx.fxml.FXML
    private TableColumn columnDescription;
    @javafx.fxml.FXML
    private TableView tableviewSafety;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void btnBack(ActionEvent actionEvent) {
        Jumper.jump((Node)actionEvent.getSource(),"meddy/factoryManager","factory-manager-dashboard.fxml","Factory Manager DashBoard");
    }

    @javafx.fxml.FXML
    public void btnMarkCompliance(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void btnReportViolation(ActionEvent actionEvent) {
    }
}