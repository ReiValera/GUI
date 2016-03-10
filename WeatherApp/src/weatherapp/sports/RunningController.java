/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherapp.sports;

import api.WeatherAPI;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import weatherapp.IphoneController;

/**
 * FXML Controller class
 *
 * @author gabrieluliano
 */
public class RunningController implements Initializable {

       @FXML
    Button goback;
    @FXML
    private Label temp;
    @FXML
    private Label location;
    @FXML
    private Label condition;
    @FXML
    private Button goiphone;
        @FXML
    ImageView icon;
        
    Image mostlyCloudy = new Image("resources/mostlycloudy.gif");
    Image mostlySunny = new Image("resources/mostlysunny.gif");
    Image rain = new Image("resources/rainy.gif");
    Image sunny = new Image("resources/sunny.gif");
    Image night = new Image("resources/moon.gif");
    Image cloudy = new Image("resources/cloudy.gif");
    Image windy = new Image("resources/windy.gif");
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        WeatherAPI weather = new WeatherAPI("44418");
        temp.setText(weather.CurrentTemp);
        location.setText(weather.Location);
        condition.setText(weather.Condition);
    }
     public void goiphone() throws IOException 
    {
        try 
        {
            Stage stage = (Stage) goiphone.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("../iPhone.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
        } 
        catch (IOException ex)
        {
            Logger.getLogger(IphoneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void goback() throws IOException {
        try {
            Stage stage = (Stage) goback.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("../iPad.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
        } catch (IOException ex) {
            Logger.getLogger(IphoneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  
    
}
