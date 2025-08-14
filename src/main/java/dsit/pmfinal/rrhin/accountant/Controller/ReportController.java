package dsit.pmfinal.rrhin.accountant.Controller;

import dsit.pmfinal.PrimarySceneSwitcher;
import dsit.pmfinal.common_files.Jumper;
import dsit.pmfinal.rrhin.accountant.model.Report;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

public class ReportController
{
    @javafx.fxml.FXML
    private TableColumn <Report,String> typeCol;
    @javafx.fxml.FXML
    private TableColumn <Report,String> amountCol;
    @javafx.fxml.FXML
    private TableView <Report> reportTableView;
    @javafx.fxml.FXML
    private ComboBox <String> selectYearComboBox;
    @javafx.fxml.FXML
    private ComboBox <String> selectMonthComboBox;
    @javafx.fxml.FXML
    private TextArea summaryTextArea;

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
    }

    @javafx.fxml.FXML
    public void handleHomeButton(ActionEvent actionEvent) {
        Jumper.jump((Node)actionEvent.getSource(),"rrhin.accountant","accountant-dashboard.fxml","Accountant Dashboard");
    }

    @javafx.fxml.FXML
    public void handleExportReportButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleGenerateReportButton(ActionEvent actionEvent) {
    }
}