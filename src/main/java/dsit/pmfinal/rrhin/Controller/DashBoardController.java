package dsit.pmfinal.rrhin.Controller;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class DashBoardController
{
    @javafx.fxml.FXML
    private Label phoneLabel;
    @javafx.fxml.FXML
    private Label emailLabel;
    @javafx.fxml.FXML
    private Label nameLabel;
    @javafx.fxml.FXML
    private Label userIdLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    //fields of Scene Switch
    private Stage stage;
    private Scene scene;
    private Parent root;

    @Deprecated
    public void handleButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleEditProfileButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleSignOutButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handlePlaceOrderButton(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/dsit/pmfinal/rrhin/customer/placeOrder.fxml"));
        stage=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Place Order!!");
    }

    @javafx.fxml.FXML
    public void handleTrackOrdersButton(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/dsit/pmfinal/rrhin/customer/trackOrder.fxml"));
        stage=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Track Order!!");
    }

    @javafx.fxml.FXML
    public void handleMakePaymentButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleRequestSampleButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleInvoicesAndPaymentsButton(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/dsit/pmfinal/rrhin/customer/invoices.fxml"));
        stage=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Invoices & Payments!!");
    }

    @javafx.fxml.FXML
    public void handleSubmitComplaintButton(ActionEvent actionEvent) {
    }

    @Deprecated
    public void black(Event event) {
    }
}