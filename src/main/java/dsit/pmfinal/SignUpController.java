package dsit.pmfinal;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SignUpController
{
    @javafx.fxml.FXML
    private TextField userNameTextField;
    @javafx.fxml.FXML
    private TextField phoneTextField;
    @javafx.fxml.FXML
    private TextField emailTextFiled;
    @javafx.fxml.FXML
    private CheckBox termsAndConditionCheckBox;
    @javafx.fxml.FXML
    private Label errorLabel;
    @javafx.fxml.FXML
    private PasswordField passwordPasswordField;

    @javafx.fxml.FXML
    public void initialize() {
        //Create First Model Class
        //Create an ArrayList
        // need to check the vid for the file handling
    }

    @javafx.fxml.FXML
    public void handleCreateAnAccountButton(ActionEvent actionEvent) {
        String name = userNameTextField.getText();
        String phone = phoneTextField.getText();
        String password = passwordPasswordField.getText();
        String email = emailTextFiled.getText();
        boolean terms = termsAndConditionCheckBox.isSelected();
        if (name.isEmpty()||phone.isEmpty()||password.isEmpty()||email.isEmpty()||!terms){
            errorLabel.setText("*Plz Fill All The Fields!!");
        }else{
            PrimarySceneSwitcher.primarySwitchScene((Node) actionEvent.getSource(), "login.fxml", "Login");
        }



        //PrimarySceneSwitcher.primarySwitchScene((Node) actionEvent.getSource(), "login.fxml", "Login");
    }

    @javafx.fxml.FXML
    public void handleTermsCheckBox(ActionEvent actionEvent) {
    }
}