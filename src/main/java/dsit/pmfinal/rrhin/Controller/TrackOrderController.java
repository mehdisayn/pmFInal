package dsit.pmfinal.rrhin.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;

public class TrackOrderController
{
    @javafx.fxml.FXML
    private TableView trackOrderTableView;
    @javafx.fxml.FXML
    private TableColumn dateCol;
    @javafx.fxml.FXML
    private TableColumn statusCol;
    @javafx.fxml.FXML
    private TextArea orderDescriptionTextArea;
    @javafx.fxml.FXML
    private TableColumn productCol;
    @javafx.fxml.FXML
    private TableColumn orderIdCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    //fields of Scene Switch
    private Stage stage;
    private Scene scene;
    private Parent root;

    @javafx.fxml.FXML
    public void handleBackButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleHomeButton(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/dsit/pmfinal/rrhin/customer/customer-dashboard.fxml"));
        stage=(Stage)((Node)actionEvent.getSource()).getScene() .getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.setTitle("DashBoard!!");
    }
}