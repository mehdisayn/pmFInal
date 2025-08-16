package dsit.pmfinal.meddy.factoryManager;

import dsit.pmfinal.PrimarySceneSwitcher;
import dsit.pmfinal.common_files.Jumper;
import dsit.pmfinal.meddy.utility.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.Node;

public class FactoryManagerDashboardController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void btnDailyProduction(ActionEvent actionEvent) {
        Jumper.jump((Node)actionEvent.getSource(),"meddy/factoryManager","production-monitor.fxml","Daily Production");
    }

    @javafx.fxml.FXML
    public void btnWorkforceScadule(ActionEvent actionEvent) {
        Jumper.jump((Node)actionEvent.getSource(),"meddy/factoryManager","workforce-schedule.fxml","Workforce Schedule");
    }

    @javafx.fxml.FXML
    public void btnDailyReport(ActionEvent actionEvent) {
        Jumper.jump((Node)actionEvent.getSource(),"meddy/factoryManager","daily-report.fxml","Daily Production");
    }

    @javafx.fxml.FXML
    public void btnLogout(ActionEvent actionEvent) {
        //SceneSwitcher.switchScene((Node)actionEvent.getSource(),"");
        PrimarySceneSwitcher.primarySwitchScene((Node)actionEvent.getSource(),"login.fxml","Login");
    }

    @javafx.fxml.FXML
    public void btnMaterialRequisition(ActionEvent actionEvent) {
        Jumper.jump((Node)actionEvent.getSource(),"meddy/factoryManager","material-requisition.fxml","Material Requisition");
    }

    @javafx.fxml.FXML
    public void btnProductionPlanning(ActionEvent actionEvent) {
        Jumper.jump((Node)actionEvent.getSource(),"meddy/factoryManager","production-planning.fxml","Production Planning");
    }

    @javafx.fxml.FXML
    public void btnSafetyProtocols(ActionEvent actionEvent) {
        Jumper.jump((Node)actionEvent.getSource(),"meddy/factoryManager","safety-protocols.fxml","Safety Protocols");
    }

    @javafx.fxml.FXML
    public void btnBottleneckResolution(ActionEvent actionEvent) {
        Jumper.jump((Node)actionEvent.getSource(),"meddy/factoryManager","bottleneck-resolution.fxml","Bottleneck Resolution");
    }

    @javafx.fxml.FXML
    public void btnMachineUsage(ActionEvent actionEvent) {
        Jumper.jump((Node)actionEvent.getSource(),"meddy/factoryManager","machine-usage.fxml","Machine Requisition");
    }
}