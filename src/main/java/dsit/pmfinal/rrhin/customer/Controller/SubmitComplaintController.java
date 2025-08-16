package dsit.pmfinal.rrhin.customer.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;

public class SubmitComplaintController
{
    @javafx.fxml.FXML
    private ComboBox <String> complaintsTypeComboBox;
    @javafx.fxml.FXML
    private TextArea complaintDetailsTextArea;
    @javafx.fxml.FXML
    private TextArea errorTextArea;
    @javafx.fxml.FXML
    private ComboBox <String> selectOrderComboBox;

    @javafx.fxml.FXML
    public void initialize() {
        //Styles
        complaintDetailsTextArea.setStyle("-fx-control-inner-background: #E74C3C; -fx-text-fill: #36454F;");
        errorTextArea.setStyle("-fx-control-inner-background: #E74C3C; -fx-text-fill: black;");
        // Managing ComboBox Values
        complaintsTypeComboBox.getItems().addAll("Late Delivery",
                "Damaged Product",
                "Wrong Item",
                "Quality Issue",
                "Other");

    }

    // fields of Scene Switch
    private Stage stage;
    private Scene scene;
    private Parent root;


    @javafx.fxml.FXML
    public void handleHomeButton(ActionEvent actionEvent) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("/dsit/pmfinal/rrhin/customer/customer-dashboard.fxml"));
        stage=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.setTitle("DashBoard!!");
    }

    @javafx.fxml.FXML
    public void handleSubmitButton(ActionEvent actionEvent) {
        String complaintsTypeComboBoxValue = complaintsTypeComboBox.getValue();
        String selectOrderComboBoxValue = selectOrderComboBox.getValue();
        String complaintDetailsTextAreaText = complaintDetailsTextArea.getText();
        if(complaintsTypeComboBoxValue==null||selectOrderComboBoxValue==null||complaintDetailsTextAreaText.isEmpty()){
            errorTextArea.setText("Plz fill all req Fields!");
            errorTextArea.setStyle("-fx-text-fill: #E74C3C;");
            return;
        }else{
            errorTextArea.setStyle("-fx-text-fill: Black; -fx-control-inner-background: #E74C3C;");
            errorTextArea.appendText("=== Complaint Summary: ===\n");
            errorTextArea.appendText("Order ID: "+selectOrderComboBoxValue+"\n");
            errorTextArea.appendText("Complaint Type: "+complaintsTypeComboBoxValue+"\n");
        }
    }
}