package dsit.pmfinal;

import dsit.pmfinal.rrhin.customer.model.Customer;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.*;

public class SignUpController
{
    @javafx.fxml.FXML
    private TextField userNameTextField;
    @javafx.fxml.FXML
    private TextField emailTextFiled;
    @javafx.fxml.FXML
    private CheckBox termsAndConditionCheckBox;
    @javafx.fxml.FXML
    private PasswordField passwordPasswordField;
    @javafx.fxml.FXML
    private TextField nameTextField;
    @javafx.fxml.FXML
    private TextArea addressTextArea;
    @javafx.fxml.FXML
    private TextField phoneTextField;

    @javafx.fxml.FXML
    public void initialize() {
        //Create First Model Class
        //Create an ArrayList
        // need to check the vid for the file handling
    }

    @javafx.fxml.FXML
    public void handleCreateAnAccountButton(ActionEvent actionEvent) {
        String username = userNameTextField.getText();
        String phone = phoneTextField.getText();
        String password = passwordPasswordField.getText();
        String address = addressTextArea.getText();
        String name = nameTextField.getText();
        String email = emailTextFiled.getText();
        boolean terms = termsAndConditionCheckBox.isSelected();



        if (username.isEmpty()||phone.isEmpty()||password.isEmpty()||email.isEmpty()||!terms || address.isEmpty() || name.isEmpty()){
            Alert errorAlert = new Alert(Alert.AlertType.ERROR);
            errorAlert.setTitle("Error");
            errorAlert.setHeaderText("Invalid Input");
            errorAlert.setContentText("Please fill out all fields and accept the terms and conditions.");
            errorAlert.showAndWait();
            return;



        }else{
            Customer customer = new Customer(name, phone, email, password, address, username);

            //Greeting the user
            Alert infoAlert = new Alert(Alert.AlertType.INFORMATION);
            infoAlert.setTitle("Account Created");
            infoAlert.setHeaderText("Account Created Successfully");
            infoAlert.setContentText("Welcome, " + customer.getName() + '\n' +
                    "Your username is: " + customer.getUsername() + '\n' +
                    "Your ID is: " + customer.getId());
            infoAlert.showAndWait();
            PrimarySceneSwitcher.primarySwitchScene((Node) actionEvent.getSource(), "login.fxml", "Login");
        }


    }



    @javafx.fxml.FXML
    public void handleAlreadyHaveAnAccountButton(ActionEvent actionEvent) {
        PrimarySceneSwitcher.primarySwitchScene((Node) actionEvent.getSource(),"login.fxml", "Login");
    }
}