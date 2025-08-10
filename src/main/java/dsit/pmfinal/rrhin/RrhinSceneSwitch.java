package dsit.pmfinal.rrhin;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class RrhinSceneSwitch {

    public static void rrhinSceneSwitcher(Node sourceNode, String fxmlFileName, String title) {
        try {
            FXMLLoader loader = new FXMLLoader(RrhinSceneSwitch.class.getResource("/dsit/pmfinal/rrhin/customer/" + fxmlFileName));
            Parent root = loader.load();

            Stage stage = (Stage) sourceNode.getScene().getWindow();
            stage.setTitle(title);
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
