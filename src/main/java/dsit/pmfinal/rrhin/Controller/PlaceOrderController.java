package dsit.pmfinal.rrhin.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class PlaceOrderController
{
    @javafx.fxml.FXML
    private DatePicker expectedDeliveryDateDatePicker;
    @javafx.fxml.FXML
    private ComboBox <String> productTypeComboBox;
    @javafx.fxml.FXML
    private ComboBox <String> sizeComboBox;
    @javafx.fxml.FXML
    private TextField quantityTextField;
    @javafx.fxml.FXML
    private TextArea statusTextArea;
    @javafx.fxml.FXML
    private TextField deliveryAddressTextField;

    @javafx.fxml.FXML
    public void initialize() {
        //Status BackGround and textFill Color Fixing
        statusTextArea.setStyle("-fx-control-inner-background: #36454F; -fx-text-fill: #E74C3C;");
        //ComBox Initialize
        productTypeComboBox.getItems().addAll("A4 Copier Paper",
                "A3 Copier Paper",
                "Tissue Paper",
                "NewsPrint Paper",
                "Paper Roll",
                "CardBoard paper",
                "Duplex Paper",
                "Specialty Paper"
                );
        sizeComboBox.getItems().addAll("70 GSM",
                "80 GSM",
                "100 GSM",
                "120 GSM");
    }

    //fields of Scene Switch
    private Stage stage;
    private Scene scene;
    private Parent root;

    @javafx.fxml.FXML
    public void handleOrderButton(ActionEvent actionEvent) {
        String pType = productTypeComboBox.getValue();
        String pSize = sizeComboBox.getValue();
        String qText = quantityTextField.getText();
        String aText = deliveryAddressTextField.getText();
        String deliDate;
        if (expectedDeliveryDateDatePicker.getValue() != null)
            deliDate = expectedDeliveryDateDatePicker.getValue().toString();
        else deliDate = "";
        if(pType==null||pSize==null||qText.isEmpty()||aText.isEmpty()||deliDate.isEmpty()){
            statusTextArea.setText("Plz fill all req Fields!");
            statusTextArea.setStyle("-fx-text-fill: #E74C3C;");
            return;
        }else{
            statusTextArea.setStyle("-fx-text-fill: black; -fx-control-inner-background: #E74C3C");
            statusTextArea.appendText("=== Order Summary ===\n");
            statusTextArea.appendText("Product Type: "+pType+"\n");
            statusTextArea.appendText("Size: "+pSize+"\n");
            statusTextArea.appendText("Quantity: "+qText+"\n");
            statusTextArea.appendText("Delivery Address: "+aText+"\n");
            statusTextArea.appendText("Expected Delivery Date: "+deliDate+"\n");
            statusTextArea.appendText("\n Order Placed Successfully!");

        }
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) {

    }

    @javafx.fxml.FXML
    public void handleHomeButton(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/dsit/pmfinal/rrhin/customer/dashboard.fxml"));
        stage=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.setTitle("DashBoard!!");
    }
}