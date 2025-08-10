package dsit.pmfinal.meddy.ceo.controller;

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
    private ComboBox comboSelectDept;
    @javafx.fxml.FXML
    private TableView tableDepartmentStats;
    @javafx.fxml.FXML
    private AnchorPane btnFilter;
    @javafx.fxml.FXML
    private TableColumn columnDept;
    @javafx.fxml.FXML
    private TableColumn columnPendingIssue;
    @javafx.fxml.FXML
    private Text labelDeptSummary;
    @javafx.fxml.FXML
    private TableColumn columnStatus;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void btnBack(ActionEvent actionEvent) {
        SceneSwitcher.switchScene((Node) actionEvent.getSource(), "ceo-customer-dashboard.fxml", "CEO Dashboard");
    }

    @javafx.fxml.FXML
    public void btnFilter(ActionEvent actionEvent) {
    }
}