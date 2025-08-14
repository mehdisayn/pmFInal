package dsit.pmfinal.meddy.ceo.controller;

import dsit.pmfinal.meddy.ceo.model.StrategicPlanning;
import dsit.pmfinal.meddy.utility.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

public class StrategicPlanningController
{
    @javafx.fxml.FXML
    private TextArea txtStrategyNotes;
    @javafx.fxml.FXML
    private TableColumn <StrategicPlanning, String> quarterColumn;
    @javafx.fxml.FXML
    private TableColumn <StrategicPlanning,String> summaryColumn;
    @javafx.fxml.FXML
    private ComboBox <String> comboDepartment;
    @javafx.fxml.FXML
    private TableColumn <StrategicPlanning,String> departmentColumn;
    @javafx.fxml.FXML
    private TableColumn <StrategicPlanning,String> dateColumn;
    @javafx.fxml.FXML
    private ComboBox <String> comboQuarter;
    @javafx.fxml.FXML
    private TableView <StrategicPlanning> tableStrategyRecords;

    @javafx.fxml.FXML
    public void initialize() {
        comboQuarter.getItems().addAll("Q1", "Q2", "Q3", "Q4");
        comboDepartment.getItems().addAll("All Departments","HR", "Management","Accounting","Maintenance","sales","Logistics");
    }

    @javafx.fxml.FXML
    public void btnBack(ActionEvent actionEvent) {
        SceneSwitcher.switchScene((Node) actionEvent.getSource(), "ceo", "ceo-dashboard.fxml", "CEO Dashboard");
    }

    @javafx.fxml.FXML
    public void btnSaveStrategy(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void btnFilterTable(ActionEvent actionEvent) {
    }
}