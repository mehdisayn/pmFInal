package dsit.pmfinal.meddy.ceo.controller;

import dsit.pmfinal.meddy.ceo.model.ProductionOverview;
import dsit.pmfinal.meddy.utility.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ProductionOverviewController
{
    @javafx.fxml.FXML
    private TableColumn <ProductionOverview,Integer> columnOutput;
    @javafx.fxml.FXML
    private TableView <ProductionOverview> tableProductionData;
    @javafx.fxml.FXML
    private TableColumn <ProductionOverview,Integer> columnTarget;
    @javafx.fxml.FXML
    private TableColumn <ProductionOverview,String> columnShift;
    @javafx.fxml.FXML
    private TableColumn <ProductionOverview,Integer> columnDefects;
    @javafx.fxml.FXML
    private TableColumn <ProductionOverview,String> columnDate;
    @javafx.fxml.FXML
    private Label labelAvgOutput;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void btnBack(ActionEvent actionEvent) {
        SceneSwitcher.switchScene((Node) actionEvent.getSource(), "ceo-dashboard.fxml", "CEO Dashboard");
    }

    @javafx.fxml.FXML
    public void btnExport(ActionEvent actionEvent) {
    }
}