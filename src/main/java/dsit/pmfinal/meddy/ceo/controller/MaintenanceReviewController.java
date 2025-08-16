package dsit.pmfinal.meddy.ceo.controller;


import dsit.pmfinal.meddy.ceo.model.MaintenanceReview;
import dsit.pmfinal.meddy.utility.SceneSwitcher;
import javafx.beans.property.Property;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class MaintenanceReviewController
{
    @javafx.fxml.FXML
    private TableColumn<MaintenanceReview, String> columnMachineID;
    @javafx.fxml.FXML
    private TableColumn<MaintenanceReview, String> columnActionTaken;
    @javafx.fxml.FXML
    private Label labelUrgentCount;
    @javafx.fxml.FXML
    private TableView <MaintenanceReview>tableMaintenanceReports;
    @javafx.fxml.FXML
    private TableColumn<MaintenanceReview, String> columnIssue;
    @javafx.fxml.FXML
    private TableColumn<MaintenanceReview, String> columnDate;


    ObservableList<MaintenanceReview> maintenanceReviewList = FXCollections.observableArrayList();


    @javafx.fxml.FXML
    public void initialize() {

        maintenanceReviewList.add(new MaintenanceReview("Machine001", "Overheating", "Replaced cooling fan", "2023-10-01", true));
        maintenanceReviewList.add(new MaintenanceReview("Machine002", "Oil leak", "Sealed leak and replaced oil filter", "2023-10-02", false));
        maintenanceReviewList.add(new MaintenanceReview("Machine003", "Vibration issue", "Balanced rotor and checked bearings", "2023-10-03", true));
        maintenanceReviewList.add(new MaintenanceReview("Machine004", "Electrical fault", "Replaced faulty wiring", "2023-10-04", false));
        maintenanceReviewList.add(new MaintenanceReview("Machine005", "Noise issue", "Lubricated moving parts", "2023-10-05", true));
        maintenanceReviewList.add(new MaintenanceReview("Machine006", "Software glitch", "Updated firmware", "2023-10-06", false));

        columnMachineID.setCellValueFactory(new PropertyValueFactory<>("machineID"));
        columnIssue.setCellValueFactory(new PropertyValueFactory<>("issue"));
        columnActionTaken.setCellValueFactory(new PropertyValueFactory<>("actionTaken"));
        columnDate.setCellValueFactory(new PropertyValueFactory<>("date"));


        for (MaintenanceReview review : maintenanceReviewList) {
            tableMaintenanceReports.getItems().add(review);
        }

        int urgentCount = (int) maintenanceReviewList.stream().filter(MaintenanceReview::isUrgent).count();
        labelUrgentCount.setText("Urgent Issues: " + urgentCount);




    }

    @javafx.fxml.FXML
    public void btnBack(ActionEvent actionEvent) {
        SceneSwitcher.switchScene((Node) actionEvent.getSource(), "ceo", "ceo-dashboard.fxml", "CEO Dashboard");
    }

    @javafx.fxml.FXML
    public void btnAcknowledge(ActionEvent actionEvent) {
        ObservableList<MaintenanceReview> selectedItems = tableMaintenanceReports.getSelectionModel().getSelectedItems();
        if (selectedItems.isEmpty()) {
            // Show an alert or message to the user that no item is selected
            System.out.println("No maintenance report selected.");
            return;
        }

        for (MaintenanceReview review : selectedItems) {
            // Here you can implement the logic to acknowledge the maintenance review
            System.out.println("Acknowledging maintenance review for machine: " + review.getMachineID());
            // Optionally, you can remove the acknowledged item from the table
            tableMaintenanceReports.getItems().remove(review);
        }
        // Update the urgent count after acknowledging
        int urgentCount = (int) maintenanceReviewList.stream().filter(MaintenanceReview::
                isUrgent).count();
        labelUrgentCount.setText("Urgent Issues: " + urgentCount);
        

    }
}