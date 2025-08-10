package dsit.pmfinal.rrhin.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class EditProfileController
{
    @javafx.fxml.FXML
    private TextField phoneTextField;
    @javafx.fxml.FXML
    private PasswordField oldPasswordPasswordField;
    @javafx.fxml.FXML
    private TextField emailTextField;
    @javafx.fxml.FXML
    private TextField nameTextField;
    @javafx.fxml.FXML
    private PasswordField newPasswordPasswordField;
    @javafx.fxml.FXML
    private TextArea errorTextArea;

    @javafx.fxml.FXML
    public void initialize() {

        //Styling Text Area
        errorTextArea.setStyle("-fx-control-inner-background: #E74C3C; -fx-text-fill: black;");

    }
    //fields of  Scene Switch
    private Parent root;
    private Stage stage;
    private Scene scene;

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleHomeButton(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/dsit/pmfinal/rrhin/customer/customer-dashboard.fxml"));
        stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Place Order!");
    }

    @javafx.fxml.FXML
    public void handleSaveButton(ActionEvent actionEvent) {
        String name = nameTextField.getText();
        String email = emailTextField.getText();
        String phone = phoneTextField.getText();
        String oldPassword = oldPasswordPasswordField.getText();
        String newPassword = newPasswordPasswordField.getText();
        if(name.isEmpty()||email.isEmpty()||phone.isEmpty()){
            errorTextArea.setText("plz Fill All the Fields!!");
        }else if(oldPassword.isEmpty()||newPassword.isEmpty()){
            errorTextArea.setText("U have to Fill both PassWord Fields!!");
        }else{
            errorTextArea.appendText("=== PROFILE ===\n");
            errorTextArea.appendText("Name: "+name+"\n");
            errorTextArea.appendText("Email: "+email+"\n");
            errorTextArea.appendText("phone: "+phone+"\n");
            errorTextArea.appendText("Password: Password Updated!");
        }
        }

    }
