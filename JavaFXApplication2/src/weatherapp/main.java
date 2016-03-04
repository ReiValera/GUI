package weatherapp;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.stage.Stage;

public class main extends Application {

    
    public static void main(String[] args) {
        launch(args);
     
    }

    @Override
    public void start(Stage stage) {
        stage = MainStage.getStage();
        IpadScene scene = new IpadScene();
        
        MainStage.loadScene(scene.getScene(), "WeatherAct");
        stage.show();
    }
}


