package dsit.pmfinal;

import dsit.pmfinal.common_files.Jumper;
import dsit.pmfinal.meddy.ceo.model.Ceo;
import dsit.pmfinal.meddy.factoryManager.model.FactoryManager;
import dsit.pmfinal.meddy.utility.SceneSwitcher;
import dsit.pmfinal.rrhin.RrhinSceneSwitch;
import dsit.pmfinal.rrhin.customer.model.Customer;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import jdk.swing.interop.SwingInterOpUtils;

import java.io.IOException;


public class LoginController
{
    @javafx.fxml.FXML
    private PasswordField pswFieldPassword;
    @javafx.fxml.FXML
    private TextField textFieldUsername;
    @javafx.fxml.FXML
    private Label labelAlartRed;

    //dummy list
    ObservableList<Ceo> ceoObservableList = FXCollections.observableArrayList();
    ObservableList<FactoryManager> factoryManagerObservableList = FXCollections.observableArrayList();
    ObservableList<Customer> customerObservableList = FXCollections.observableArrayList();


    @javafx.fxml.FXML
    public void initialize() {

        // Initialize dummy data for CEO
        Ceo ceo = new Ceo("Ceo", "0123457851", "ceo@gmail.com", "1234");
        ceoObservableList.add(ceo);

        // Initialize dummy data for Factory Manager
        FactoryManager factoryManager = new FactoryManager("Factory Manager", "0123457852", "facman#gmail.com", "1234");
        factoryManagerObservableList.add(factoryManager);

        // Initialize dummy data for Customer
        Customer customer = new Customer("Customer", "0123457853", "dasd@gmail.com", "1234", "123 Street", "customer123");
        System.out.println("Customer ID: " + customer.getId());
        customerObservableList.add(customer);






    }
    private Stage stage;
    private Scene scene;
    private Parent root;


    @javafx.fxml.FXML
    public void btnCreateAnAccount(ActionEvent actionEvent) {
        PrimarySceneSwitcher.primarySwitchScene((Node) actionEvent.getSource(), "sign-up.fxml", "Sign-Up");
    }

    @javafx.fxml.FXML
    public void butLogin(ActionEvent actionEvent) throws IOException {
        // Validate input fields
        String username = textFieldUsername.getText().trim();
        String password = pswFieldPassword.getText().trim();
        if (username.isEmpty() || password.isEmpty()) {
            labelAlartRed.setText("Please fill out all fields.");
            return;
        }

        // For demo purposes, we are using hardcoded credentials

        // CEO with hardcoded credentials
        for (Ceo ceo : ceoObservableList) {
            if (ceo.login(username, password)) {
                labelAlartRed.setText("Login successful!");
                //Jumper.jump((Node)actionEvent.getSource(),"meddy/ceo", "ceo-dashboard.fxml", "CEO Dashboard");
                SceneSwitcher.switchScene((Node) actionEvent.getSource(), "ceo", "ceo-dashboard.fxml", "Dashboard");
                return;
            }
        }

        // Factory Manager with hardcoded credentials
        for (FactoryManager factoryManager : factoryManagerObservableList) {
            if (factoryManager.login(username, password)) {
                labelAlartRed.setText("Login Successful!");
                SceneSwitcher.switchScene((Node) actionEvent.getSource(), "factoryManager", "factory-manager-dashboard.fxml", "Factory Manager Dashboard");
                return;
            }
        }


        //Customer
        if(username.equals("customer")&& password.equals("cus123")){
            labelAlartRed.setText("Login Successful!");

            RrhinSceneSwitch.rrhinSceneSwitcher((Node)actionEvent.getSource(), "customer-dashboard.fxml", "Customer Dashboard");

        //Accountant
        }else if(username.equals("accountant") && password.equals("acc123")) {
            labelAlartRed.setText("Login Successful!");

            Jumper.jump((Node)actionEvent.getSource(), "rrhin.accountant", "accountant-dashboard.fxml", "Accountant Dashboard");

        }else {
            labelAlartRed.setText("Invalid username or password.");
        }

    }
}