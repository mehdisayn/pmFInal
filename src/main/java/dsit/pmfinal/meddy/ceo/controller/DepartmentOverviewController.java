package dsit.pmfinal.meddy.ceo.controller;

import dsit.pmfinal.meddy.ceo.model.DepartmentOverview;
import dsit.pmfinal.meddy.utility.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class DepartmentOverviewController
{
    @javafx.fxml.FXML
    private ComboBox <String> comboSelectDept;
    @javafx.fxml.FXML
    private TableView <DepartmentOverview> tableDepartmentStats;
    @javafx.fxml.FXML
    private AnchorPane btnFilter;
    @javafx.fxml.FXML
    private TableColumn <DepartmentOverview,String> columnDept;
    @javafx.fxml.FXML
    private TableColumn <DepartmentOverview,String> columnPendingIssue;
    @javafx.fxml.FXML
    private Text labelDeptSummary;
    @javafx.fxml.FXML
    private TableColumn <DepartmentOverview,String> columnStatus;

    @javafx.fxml.FXML
    public void initialize() {
        comboSelectDept.getItems().addAll("All Departments", "HR", "Management","Accounting","Maintenance","sales","Logistics");
    }

    @javafx.fxml.FXML
    public void btnBack(ActionEvent actionEvent) {
        SceneSwitcher.switchScene((Node) actionEvent.getSource(), "ceo-dashboard.fxml", "CEO Dashboard");
    }

    @javafx.fxml.FXML
    public void btnFilter(ActionEvent actionEvent) {
    }
}