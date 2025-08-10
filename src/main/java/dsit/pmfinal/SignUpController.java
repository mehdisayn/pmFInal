package dsit.pmfinal;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class SignUpController
{
    @javafx.fxml.FXML
    private TextField userNameTextField;
    @javafx.fxml.FXML
    private TextField phoneTextField;
    @javafx.fxml.FXML
    private TextField passwordTextFiled;
    @javafx.fxml.FXML
    private TextField emailTextFiled;
    @javafx.fxml.FXML
    private CheckBox termsAndConditionCheckBox;

    @javafx.fxml.FXML
    public void initialize() {
        //Create First Model Class
        //Create an ArrayList
        // need to check the vid for the file handling
    }

    @javafx.fxml.FXML
    public void handleCreateAnAccountButton(ActionEvent actionEvent) {
        PrimarySceneSwitcher.primarySwitchScene((Node) actionEvent.getSource(), "login.fxml", "Login");
    }

    @javafx.fxml.FXML
    public void handleTermsCheckBox(ActionEvent actionEvent) {
    }
}