package dsit.pmfinal.meddy.ceo.controller;


import dsit.pmfinal.meddy.ceo.model.HrDecisions;
import dsit.pmfinal.meddy.utility.SceneSwitcher;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import  java.io.IOException;


public class HRDecisionsController
{
    @javafx.fxml.FXML
    private TableColumn<HrDecisions, String> columnJustification;
    @javafx.fxml.FXML
    private TableColumn<HrDecisions, String> columnPosition;
    @javafx.fxml.FXML
    private TableView<HrDecisions> tableHRRequests;
    @javafx.fxml.FXML
    private TableColumn<HrDecisions, String> columnAction;
    @javafx.fxml.FXML
    private TableColumn<HrDecisions, String>  columnName;

    ObservableList<HrDecisions> hrDecisionsList = FXCollections.observableArrayList();
    @javafx.fxml.FXML
    private TableColumn<HrDecisions, String> columnStatus;


    @javafx.fxml.FXML
    public void initialize() {

        hrDecisionsList.add(new HrDecisions("Farhan Khan", "Sales Sub-Manager", "Need to hire more sales staff", "Hire", "Pending"));
        hrDecisionsList.add(new HrDecisions("Ayesha Rahman", "Marketing Executive", "Budget increase for marketing campaign", "Hire", "Pending"));
        hrDecisionsList.add(new HrDecisions("Kavish", "Assistant Manager", "Need to promote Kavish to Manager", "Promote", "Pending"));



        columnName.setCellValueFactory(new PropertyValueFactory<>("name"));
        columnPosition.setCellValueFactory(new PropertyValueFactory<>("position"));
        columnJustification.setCellValueFactory(new PropertyValueFactory<>("justification"));
        columnAction.setCellValueFactory(new PropertyValueFactory<>("action"));
        columnStatus.setCellValueFactory(new PropertyValueFactory<>("status"));



        for (HrDecisions hrDecision : hrDecisionsList) {
            tableHRRequests.getItems().add(hrDecision);
        }


    }

    @javafx.fxml.FXML
    public void btnBack(ActionEvent actionEvent) {
        SceneSwitcher.switchScene((Node) actionEvent.getSource(), "ceo", "ceo-dashboard.fxml", "CEO Dashboard");



    //    try(ObjectOutputStream = new ObjectOutputStream(new FileOutputStream("hrDecisions.bin"))) {
    //         out.writeObject(hrDecisionsList);
    //       } catch (IOException e){
        //       e.printStackTrace();
       // }

    }

    @javafx.fxml.FXML
    public void btnRejectHRAction(ActionEvent actionEvent) {
        HrDecisions selectedDecision = tableHRRequests.getSelectionModel().getSelectedItem();
        if (selectedDecision != null) {
            selectedDecision.setStatus("Approved");
            tableHRRequests.refresh();
        }


    }

    @javafx.fxml.FXML
    public void btnApproveHRAction(ActionEvent actionEvent) {
        HrDecisions selectedDecision = tableHRRequests.getSelectionModel().getSelectedItem();
        if (selectedDecision != null) {
            selectedDecision.setStatus("Rejected");
            tableHRRequests.refresh();
        }
    }
}