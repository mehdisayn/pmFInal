package dsit.pmfinal.rrhin;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AccSceneSwitch {

    public static void accSceneSwitch(Node sourceNode, String fxmlFileName, String title) {
        try {
            FXMLLoader loader = new FXMLLoader(AccSceneSwitch.class.getResource("/dsit/pmfinal/rrhin/accountant/" + fxmlFileName));
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
