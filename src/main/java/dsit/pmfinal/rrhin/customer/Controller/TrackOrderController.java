package dsit.pmfinal.rrhin.customer.Controller;

import dsit.pmfinal.rrhin.customer.model.TrackOrder;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class TrackOrderController
{
    @javafx.fxml.FXML
    private TableView <TrackOrder> trackOrderTableView;
    @javafx.fxml.FXML
    private TableColumn <TrackOrder,String> dateCol;
    @javafx.fxml.FXML
    private TableColumn <TrackOrder,String> statusCol;
    @javafx.fxml.FXML
    private TextArea orderDescriptionTextArea;
    @javafx.fxml.FXML
    private TableColumn <TrackOrder,String> productCol;
    @javafx.fxml.FXML
    private TableColumn <TrackOrder,Integer> orderIdCol;

    @javafx.fxml.FXML
    public void initialize() {
        orderIdCol.setCellValueFactory(new PropertyValueFactory<TrackOrder,Integer>("Order ID"));
        dateCol.setCellValueFactory(new PropertyValueFactory<TrackOrder,String>("Date"));
        productCol.setCellValueFactory(new PropertyValueFactory<TrackOrder,String>("Product"));
        statusCol.setCellValueFactory(new PropertyValueFactory<TrackOrder,String>("Status"));
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