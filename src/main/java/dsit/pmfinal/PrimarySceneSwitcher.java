package dsit.pmfinal;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class PrimarySceneSwitcher {

    public static void primarySwitchScene(Node sourceNode, String fxmlFileName, String title) {
        try {
            FXMLLoader loader = new FXMLLoader(PrimarySceneSwitcher.class.getResource("/dsit/pmfinal/" + fxmlFileName));
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
