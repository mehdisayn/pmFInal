package dsit.pmfinal;

import dsit.pmfinal.meddy.utility.SceneSwitcher;
import dsit.pmfinal.rrhin.RrhinSceneSwitch;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;


public class LoginController
{
    @javafx.fxml.FXML
    private PasswordField pswFieldPassword;
    @javafx.fxml.FXML
    private TextField textFieldUsername;
    @javafx.fxml.FXML
    private Label labelAlartRed;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @Deprecated
    public void btnBack(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void btnCreateAnAccount(ActionEvent actionEvent) {
        PrimarySceneSwitcher.primarySwitchScene((Node) actionEvent.getSource(), "sign-up.fxml", "Sign-Up");
    }

    @javafx.fxml.FXML
    public void butLogin(ActionEvent actionEvent) {
        // for show
        String username = textFieldUsername.getText().trim();
        String password = pswFieldPassword.getText().trim();
        if (username.isEmpty() || password.isEmpty()) {
            labelAlartRed.setText("Please fill out all fields.");
            return;
        }
        // For demo purposes, we are using hardcoded credentials
        if (username.equals("ceo") && password.equals("ceo123")) {
            labelAlartRed.setText("Login successful!");

            SceneSwitcher.switchScene((Node) actionEvent.getSource(), "ceo-dashboard.fxml", "Dashboard");
        }else if(username.equals("customer")&& password.equals("cus123")){
            labelAlartRed.setText("Login Successful!");

            RrhinSceneSwitch.rrhinSceneSwitcher((Node)actionEvent.getSource(), "customer-dashboard.fxml", "Customer Dashboard");
        }else {
            labelAlartRed.setText("Invalid username or password.");
        }

    }
}