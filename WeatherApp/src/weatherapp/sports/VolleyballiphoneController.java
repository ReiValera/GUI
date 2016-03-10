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
public class VolleyballiphoneController implements Initializable {

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
        switch(weather.code)
        {
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
            case "10":
            case "11":
            case "12":
            case "13":
            case "14":
            case "15":
            case "16":
            case "17":
            case "18":
            case "19":
            case "20":
            case "21":
            case "22":
            case "23":
            case "35":
            case "37":    
            case "38":
            case "39":
            case "40":
            case "41":
            case "42":
            case "43":
                icon.setImage(rain);
                break;
            case "30":
            case "34":
            case "44":
                icon.setImage(mostlySunny);
                break;
            case "32":
            case "36":
                icon.setImage(sunny);
                break;
            case "27":
            case "29":
            case "31":
            case "33":
                icon.setImage(night);
                break;
            case "26":
                icon.setImage(cloudy);
                break;
            case "28":
                icon.setImage(mostlyCloudy);
                break;
            case "25":
            case "24":
                icon.setImage(windy);
                break;
            default:
                icon.setImage(cloudy);
                break;
        }
    }
     public void goipad() throws IOException 
    {
        try 
        {
            Stage stage = (Stage) goiphone.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("Volleyball.fxml"));
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
            Parent root = FXMLLoader.load(getClass().getResource("../iPhone.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
        } catch (IOException ex) {
            Logger.getLogger(IphoneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  
    
}
