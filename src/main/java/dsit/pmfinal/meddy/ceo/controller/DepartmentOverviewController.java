package dsit.pmfinal.meddy.ceo.controller;


import dsit.pmfinal.meddy.ceo.model.DeptProgress;
import dsit.pmfinal.meddy.utility.SceneSwitcher;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class DepartmentOverviewController
{
    @javafx.fxml.FXML
    private ComboBox <String> comboSelectDept;
    @javafx.fxml.FXML
    private TableView<DeptProgress> tableDepartmentStats;
    @javafx.fxml.FXML
    private TableColumn <DeptProgress, String>  columnDept;
    @javafx.fxml.FXML
    private TableColumn  <DeptProgress, String>columnPendingIssue;
    @javafx.fxml.FXML
    private Text labelDeptSummary;
    @javafx.fxml.FXML
    private TableColumn <DeptProgress, String> columnStatus;

    ObservableList<DeptProgress> hrDecisionsList = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
        comboSelectDept.getItems().addAll("All Departments", "HR", "Management","Accounting","Maintenance","sales","Logistics");


        hrDecisionsList.add(new DeptProgress("HR", "Pending", 5));
        hrDecisionsList.add(new DeptProgress("Management", "Resolved", 3));
        hrDecisionsList.add(new DeptProgress("Accounting", "Resolved", 6));
        hrDecisionsList.add(new DeptProgress("Maintenance", "Ongoing", 7));
        hrDecisionsList.add(new DeptProgress("Sales", "Pending", 10));
        hrDecisionsList.add(new DeptProgress("Logistics", "Resolved", 9));


        columnDept.setCellValueFactory(new PropertyValueFactory<>("departmentName"));
        columnStatus.setCellValueFactory(new PropertyValueFactory<>("status"));
        columnPendingIssue.setCellValueFactory(new PropertyValueFactory<>("pendingIssues"));



        for (DeptProgress deptProgress : hrDecisionsList) {
            tableDepartmentStats.getItems().add(deptProgress);
        }

    }

    @javafx.fxml.FXML
    public void btnBack(ActionEvent actionEvent) {
        SceneSwitcher.switchScene((Node) actionEvent.getSource(), "ceo", "ceo-dashboard.fxml", "CEO Dashboard");
    }

    @javafx.fxml.FXML
    public void btnFilter(ActionEvent actionEvent) {
        String selectedDept = comboSelectDept.getValue();
        tableDepartmentStats.getItems().clear();

        if (selectedDept.equals("All Departments")) {
            for (DeptProgress deptProgress : hrDecisionsList) {
                tableDepartmentStats.getItems().add(deptProgress);
            }
        } else {
            for (DeptProgress deptProgress : hrDecisionsList) {
                if (deptProgress.getDepartmentName().equalsIgnoreCase(selectedDept)) {
                    tableDepartmentStats.getItems().add(deptProgress);
                }
            }
        }



    }
}