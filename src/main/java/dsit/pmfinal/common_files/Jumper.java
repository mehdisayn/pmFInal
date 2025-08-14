package dsit.pmfinal.common_files;


import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Jumper {

    public static void jump(Node sourceNode,String pathRef, String fxmlFileName, String title) {
        try {
            FXMLLoader loader = new FXMLLoader(dsit.pmfinal.common_files.Jumper.class.getResource("/dsit/pmfinal/"+ pathRef + "/" + fxmlFileName));
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
