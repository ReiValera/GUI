package weatherapp;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
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
        IpadScene scene = new IpadScene(); //create a screen
        
        MainStage.loadScene(scene.getScene(), "WeatherAct"); 
        stage.show();
    }
}


