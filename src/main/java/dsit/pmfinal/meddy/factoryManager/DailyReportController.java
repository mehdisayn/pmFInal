package dsit.pmfinal.meddy.factoryManager;

import dsit.pmfinal.common_files.Jumper;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class DailyReportController
{
    @javafx.fxml.FXML
    private TextArea textareaSummery;
    @javafx.fxml.FXML
    private TextField textfieldDefects;
    @javafx.fxml.FXML
    private TextField textfieldOutput;
    @javafx.fxml.FXML
    private Text labelStatus;
    @javafx.fxml.FXML
    private DatePicker datepickerDate;
    @javafx.fxml.FXML
    private ComboBox combobocShift;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void btnBack(ActionEvent actionEvent) {
        Jumper.jump((Node)actionEvent.getSource(),"meddy/factoryManager","factory-manager-dashboard.fxml","Factory Manager DashBoard");
    }

    @javafx.fxml.FXML
    public void btnSendReport(ActionEvent actionEvent) {
    }
}