package dsit.pmfinal.rrhin.customer.Controller;

import dsit.pmfinal.rrhin.customer.model.Invoices;
import dsit.pmfinal.rrhin.customer.model.MakePayments;
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

public class InvoicesController
{
    @javafx.fxml.FXML
    private TableView <Invoices> invoicesAndPaymentTableView;
    @javafx.fxml.FXML
    private TableColumn <Invoices,Double> amountCol;
    @javafx.fxml.FXML
    private TableColumn <Invoices,String> dateCol;
    @javafx.fxml.FXML
    private TableColumn <Invoices,String> paymentStatusCol;
    @javafx.fxml.FXML
    private TextArea descriptionTextArea;
    @javafx.fxml.FXML
    private TableColumn <Invoices,Integer> orderIdCol;

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
        stage=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.setTitle("DashBoard!!");
    }

    @javafx.fxml.FXML
    public void handleDownloadPDFButton(ActionEvent actionEvent) {
    }
}