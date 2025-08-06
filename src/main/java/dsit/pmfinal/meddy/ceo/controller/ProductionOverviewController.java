package dsit.pmfinal.meddy.ceo.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ProductionOverviewController
{
    @javafx.fxml.FXML
    private TableColumn columnOutput;
    @javafx.fxml.FXML
    private TableView tableProductionData;
    @javafx.fxml.FXML
    private TableColumn columnTarget;
    @javafx.fxml.FXML
    private TableColumn columnShift;
    @javafx.fxml.FXML
    private TableColumn columnDefects;
    @javafx.fxml.FXML
    private TableColumn columnDate;
    @javafx.fxml.FXML
    private Label labelAvgOutput;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void btnBack(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void btnExport(ActionEvent actionEvent) {
    }
}