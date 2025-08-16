package dsit.pmfinal.rrhin.accountant.Controller;

import dsit.pmfinal.common_files.Jumper;
import dsit.pmfinal.rrhin.accountant.model.PurchaseApprovals;
import dsit.pmfinal.rrhin.accountant.model.SalaryReports;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class SalaryReportsController
{
    @javafx.fxml.FXML
    private TableColumn <SalaryReports,Integer> idCol;
    @javafx.fxml.FXML
    private TableColumn <SalaryReports,Double> salaryCol;
    @javafx.fxml.FXML
    private TableColumn <SalaryReports,String> nameCol;
    @javafx.fxml.FXML
    private TableView <SalaryReports> salaryReportsTableView;
    @javafx.fxml.FXML
    private TableColumn <SalaryReports,String> dapermentCol;
    @javafx.fxml.FXML
    private ComboBox <String> selectComboBox;
    @javafx.fxml.FXML
    private TextArea salaryReportsTextArea;
    @javafx.fxml.FXML
    private TableColumn <SalaryReports,String> monthCol;

    //dummy list
    private ObservableList<SalaryReports>salaryList= FXCollections.observableArrayList();


    @javafx.fxml.FXML
    public void initialize() {
        selectComboBox.getItems().addAll("January",
                "February",
                "March",
                "April",
                "May",
                "June",
                "July",
                "August",
                "September",
                "October",
                "November",
                "December");
        nameCol.setCellValueFactory(new PropertyValueFactory<SalaryReports,String>("name"));
        idCol.setCellValueFactory(new PropertyValueFactory<SalaryReports,Integer>("id"));
        salaryCol.setCellValueFactory(new PropertyValueFactory<SalaryReports,Double>("salary"));
        //monthCol.setCellValueFactory(new PropertyValueFactory<SalaryReports,String>("Month"));
        monthCol.setCellValueFactory(new PropertyValueFactory<SalaryReports,String>("month"));
        dapermentCol.setCellValueFactory(new PropertyValueFactory<SalaryReports,String>("department"));

        salaryList.add(new SalaryReports(1,"John Doe","IT","January",5000.0));
        salaryList.add(new SalaryReports(2,"Jane Smith","HR","January",4500.0));
        salaryList.add(new SalaryReports(3,"Bob Brown","Operations","February",5500.0));

        salaryReportsTableView.setItems(salaryList);


    }

    @javafx.fxml.FXML
    public void handleHomeButton(ActionEvent actionEvent) {
        Jumper.jump((Node)actionEvent.getSource(),"rrhin.accountant","accountant-dashboard","Accountant Dashboard");
        System.out.println("Returning to Accounting Dashboard");
    }

    @javafx.fxml.FXML
    public void handleExportPDFButton(ActionEvent actionEvent) {
        SalaryReports selected = salaryReportsTableView.getSelectionModel().getSelectedItem();
        if (selected != null) {

            System.out.println("Exporting salary report for: " + selected.getName());
            salaryReportsTextArea.setText("PDF exported successfully for " + selected.getName());
        } else {
            salaryReportsTextArea.setText("Please select a salary report to export.");
        }
    }
}