package dsit.pmfinal;

import dsit.pmfinal.common_files.Jumper;
import dsit.pmfinal.meddy.utility.SceneSwitcher;
import dsit.pmfinal.rrhin.RrhinSceneSwitch;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;


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
    private Stage stage;
    private Scene scene;
    private Parent root;


    @Deprecated
    public void btnBack(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void btnCreateAnAccount(ActionEvent actionEvent) {
        PrimarySceneSwitcher.primarySwitchScene((Node) actionEvent.getSource(), "sign-up.fxml", "Sign-Up");
    }

    @javafx.fxml.FXML
    public void butLogin(ActionEvent actionEvent) throws IOException {
        // for show
        String username = textFieldUsername.getText().trim();
        String password = pswFieldPassword.getText().trim();
        if (username.isEmpty() || password.isEmpty()) {
            labelAlartRed.setText("Please fill out all fields.");
            return;
        }
        // For demo purposes, we are using hardcoded credentials

        // CEO
        if (username.equals("ceo") && password.equals("ceo123")) {
            labelAlartRed.setText("Login successful!");
            //Jumper.jump((Node)actionEvent.getSource(),"meddy/ceo", "ceo-dashboard.fxml", "CEO Dashboard");
            SceneSwitcher.switchScene((Node) actionEvent.getSource(), "ceo", "ceo-dashboard.fxml", "Dashboard");
        //Factory Manager
        } else if (username.equals("factorymanager")&& password.equals("facman123")) {
            labelAlartRed.setText("Login Successfull!");
            SceneSwitcher.switchScene((Node)actionEvent.getSource(), "factorymanager", "factory-manager-dashboard.fxml", "Factory Manager Dashboard");

        //Customer
        }else if(username.equals("customer")&& password.equals("cus123")){
            labelAlartRed.setText("Login Successful!");

            RrhinSceneSwitch.rrhinSceneSwitcher((Node)actionEvent.getSource(), "customer-dashboard.fxml", "Customer Dashboard");

        //Accountant
        }else if(username.equals("accountant") && password.equals("acc123")) {
            labelAlartRed.setText("Login Successful!");

            Jumper.jump((Node)actionEvent.getSource(), "rrhin.accountant", "accountant-dashboard.fxml", "Accountant Dashboard");




//            RrhinSceneSwitch.rrhinSceneSwitcher((Node)actionEvent.getSource(),"accountant-dashboard.fxml","Accountant Dashboard");
//            Parent root = FXMLLoader.load(getClass().getResource("/dsit/pmfinal/rrhin/accountant/accountant-dashboard.fxml"));
//            stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
//            scene = new Scene(root);
//            stage.setScene(scene);
//            stage.setTitle("Accountant Dashboard");
        }else {
            labelAlartRed.setText("Invalid username or password.");
        }

    }
}