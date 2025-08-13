package dsit.pmfinal.rrhin.accountant.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class SalesIncomeController
{
    @javafx.fxml.FXML
    private DatePicker saleDateDatePicker;
    @javafx.fxml.FXML
    private TableView salesIncomeTableView;
    @javafx.fxml.FXML
    private TableColumn amountCol;
    @javafx.fxml.FXML
    private TableColumn dateCol;
    @javafx.fxml.FXML
    private TableColumn clientNameCol;
    @javafx.fxml.FXML
    private TextField amountTextField;
    @javafx.fxml.FXML
    private TextField NameTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }
    private Parent root;
    private Stage stage;
    private Scene scene;

    @javafx.fxml.FXML
    public void handleHomeButton(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/dsit/pmfinal/rrhin.accountant/accountant-dashboard.fxml"));
        stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("DashBoard"); // Set the title of the stage
    }

    @javafx.fxml.FXML
    public void handleLogSaleButton(ActionEvent actionEvent) {
    }
}