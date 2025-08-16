package dsit.pmfinal.rrhin.customer.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ReqSampleController
{
    @javafx.fxml.FXML
    private TextField addressTextField;
    @javafx.fxml.FXML
    private ComboBox <String> paperQualityGSMComboBox;
    @javafx.fxml.FXML
    private ComboBox <String> selectProductTypeComboBox;
    @javafx.fxml.FXML
    private TextArea errorTextArea;

    @javafx.fxml.FXML
    public void initialize() {
        errorTextArea.setStyle("-fx-text-fill: black; -fx-control-inner-background: #E74C3C;");
        selectProductTypeComboBox.getItems().addAll("A4 Copier Paper",
                "A3 Copier Paper",
                "Tissue Paper",
                "NewsPrint Paper",
                "Paper Roll",
                "CardBoard Paper",
                "Duplex Paper",
                "Specialty Paper"
        );
        paperQualityGSMComboBox.getItems().addAll("70 GSM",
                "80 GSM",
                "100 GSM",
                "120 GSM"
        );
    }

    // fields for Scene Switch
    private Parent root;
    private Scene scene;
    private Stage stage;

    @javafx.fxml.FXML
    public void handleRequestSampleButton(ActionEvent actionEvent) {
        String productType = selectProductTypeComboBox.getValue();
        String paperQuality = paperQualityGSMComboBox.getValue();
        String address = addressTextField.getText();
        if(productType==null||paperQuality==null||address.isEmpty()){
            errorTextArea.setText("Plz Fill all the Fields!!");
        }else{
            errorTextArea.appendText("===Request Sample===\n");
            //errorTextArea.appendText("");
            errorTextArea.appendText("Product Type: "+productType+"\n");
            errorTextArea.appendText("Paper Quality: "+paperQuality+"\n");
            errorTextArea.appendText("Address: "+address+"\n");
            errorTextArea.appendText("Sample Request Created!!");
        }
    }


    @javafx.fxml.FXML
    public void handleHomeButton(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/dsit/pmfinal/rrhin/customer/customer-dashboard.fxml"));
        stage=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.setTitle("DashBoard!!");
    }
}