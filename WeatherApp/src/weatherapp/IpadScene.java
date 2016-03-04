package weatherapp;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;

public class IpadScene {

    private Scene scene;

    public IpadScene() {
        try {
            Parent root = FXMLLoader. load(getClass().getResource("Ipad.fxml"));
            scene = new Scene(root);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Scene getScene() {
        return scene;
    }
}
