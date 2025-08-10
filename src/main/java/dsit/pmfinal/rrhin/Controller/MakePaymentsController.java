package dsit.pmfinal.rrhin.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class MakePaymentsController
{
    @javafx.fxml.FXML
    private TableView makePayemtTableView;
    @javafx.fxml.FXML
    private TableColumn dueDateCol;
    @javafx.fxml.FXML
    private TableColumn amountCol;
    @javafx.fxml.FXML
    private TableColumn statusCol;
    @javafx.fxml.FXML
    private ComboBox <String> selectPaymentMethodComboBox;
    @javafx.fxml.FXML
    private TextField transactionIDTextField;
    @javafx.fxml.FXML
    private TextArea errorTextArea;
    @javafx.fxml.FXML
    private TableColumn orderIdCol;

    @javafx.fxml.FXML
    public void initialize() {
        errorTextArea.setStyle("-fx-text-fill: black; -fx-control-inner-background: #E74C3C;");

        selectPaymentMethodComboBox.getItems().addAll("bKash",
                "Nagad",
                "Bank Transfer",
                "Credit Card",
                "Cash"
        );

    }
    //fields of Scene Switch
    private Parent root;
    private Scene scene;
    private Stage stage;

    @javafx.fxml.FXML
    public void handleHomeButton(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/dsit/pmfinal/rrhin/customer/customer-dashboard.fxml"));
        stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        scene=new Scene((root));
        stage.setScene(scene);
        stage.setTitle("DashBoard!!");
    }

    @javafx.fxml.FXML
    public void handlePayNowButton(ActionEvent actionEvent) {
        String paymentMethod = selectPaymentMethodComboBox.getValue();
        String transactionID = transactionIDTextField.getText();
        if(paymentMethod==null||transactionID.isEmpty()){
            errorTextArea.setText("Plz Fill all the Fileds!!");
        }else{
            errorTextArea.appendText("===Payment===\n");
            errorTextArea.appendText("Payment Method: "+paymentMethod+"\n");
            errorTextArea.appendText("Transaction ID: "+transactionID+"\n");
        }
    }

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) {
    }
}