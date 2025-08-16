package dsit.pmfinal.meddy.factoryManager;

import dsit.pmfinal.common_files.Jumper;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class MaterialRequisitionController
{
    @javafx.fxml.FXML
    private Label labelEfficiency;
    @javafx.fxml.FXML
    private TableColumn columnMaterialName;
    @javafx.fxml.FXML
    private TableColumn columnQuantity;
    @javafx.fxml.FXML
    private TableColumn columnCurrentStock;
    @javafx.fxml.FXML
    private TableView tableviewMaterial;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void btnBack(ActionEvent actionEvent) {
        Jumper.jump((Node)actionEvent.getSource(),"meddy/factoryManager","factory-manager-dashboard.fxml","Factory Manager DashBoard");
    }

    @javafx.fxml.FXML
    public void btnReqMaterial(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void btnApprove(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void btnReject(ActionEvent actionEvent) {
    }
}