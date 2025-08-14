package dsit.pmfinal.meddy.utility;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneSwitcher {

    public static void switchScene(Node sourceNode,String userName, String fxmlFileName, String title) {
        try {
            FXMLLoader loader = new FXMLLoader(dsit.pmfinal.meddy.utility.SceneSwitcher.class.getResource("/dsit/pmfinal/meddy/"+ userName +"/"+ fxmlFileName));
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
