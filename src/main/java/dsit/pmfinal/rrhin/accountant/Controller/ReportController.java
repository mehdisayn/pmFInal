package dsit.pmfinal.rrhin.accountant.Controller;

import dsit.pmfinal.PrimarySceneSwitcher;
import dsit.pmfinal.common_files.Jumper;
import dsit.pmfinal.rrhin.accountant.model.Report;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;

public class ReportController
{
    @javafx.fxml.FXML
    private TableColumn <Report,String> typeCol;
    @javafx.fxml.FXML
    private TableColumn <Report,Integer> amountCol;
    @javafx.fxml.FXML
    private TableView <Report> reportTableView;
    @javafx.fxml.FXML
    private ComboBox <String> selectYearComboBox;
    @javafx.fxml.FXML
    private ComboBox <String> selectMonthComboBox;
    @javafx.fxml.FXML
    private TextArea summaryTextArea;

    //list dummy
    private ObservableList<Report>reportObservableList= FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
        selectYearComboBox.getItems().addAll("2021", "2022", "2023");
        selectMonthComboBox.getItems().addAll("January",
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
        summaryTextArea.setStyle("-fx-control-inner-background: #E74C3C;");

        amountCol.setCellValueFactory(new PropertyValueFactory<Report,Integer>("Amount"));
        typeCol.setCellValueFactory(new PropertyValueFactory<Report,String>("Type"));

        reportObservableList.add(new Report("2025","February","Total expenses: 150,000; Total revenue: 200,000"));
        reportObservableList.add(new Report("2025","January","Total expenses: 120,000; Total revenue: 180,000"));
        reportObservableList.add(new Report("2025","March","Pending financial review"));

        reportTableView.setItems(reportObservableList);
    }

    @javafx.fxml.FXML
    public void handleHomeButton(ActionEvent actionEvent) {
        Jumper.jump((Node)actionEvent.getSource(),"rrhin.accountant","accountant-dashboard.fxml","Accountant Dashboard");
    }

    @javafx.fxml.FXML
    public void handleExportReportButton(ActionEvent actionEvent) {
        Report selectedReport = reportTableView.getSelectionModel().getSelectedItem();
        if (selectedReport != null) {

            System.out.println("Exporting report: " + selectedReport.getSummary());
            summaryTextArea.setText("Report exported successfully!");
        } else {
            summaryTextArea.setText("Please select a report from the table to export.");
        }
    }

    @javafx.fxml.FXML
    public void handleGenerateReportButton(ActionEvent actionEvent) {
        String selectedYear = selectYearComboBox.getValue();
        String selectedMonth = selectMonthComboBox.getValue();

        if (selectedYear == null || selectedMonth == null) {
            summaryTextArea.setText("Please select both year and month.");
            return;
        }


        for (Report r : reportObservableList) {
            if (r.getYear().equals(selectedYear) && r.getMonth().equals(selectedMonth)) {
                summaryTextArea.setText(r.getSummary());
                return;
            }
        }


        summaryTextArea.setText("No report found for " + selectedMonth + ", " + selectedYear);
    }
}