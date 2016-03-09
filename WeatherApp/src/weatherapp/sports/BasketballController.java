/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherapp.sports;

import api.WeatherAPI;
import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
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
import javafx.stage.Stage;
import weatherapp.IphoneController;

/**
 * FXML Controller class
 *
 * @author monicadzhaleva
 */
public class BasketballController implements Initializable {

    @FXML private Label label;
    @FXML private Button goback;
    @FXML private Button goiphone;

       @FXML
    private Label temp;
    @FXML
    private Label location;
    @FXML
    private Label condition;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        WeatherAPI weather = new WeatherAPI("44418");
        temp.setText(weather.CurrentTemp);
        location.setText(weather.Location);
        condition.setText(weather.Condition);
        
    }    
public void getTime()
{
    DateFormat dateFormat = new SimpleDateFormat("HH:mm");
    DateFormat dateFormat2 = new SimpleDateFormat("a");

Date date = new Date();
Date date2 = new Date();

System.out.println(dateFormat.format(date)); // 15:59
label.setText(dateFormat.format(date));

}

    //GO RUGBY VIEW
          public void goback() throws IOException
    {
          try {
            Stage stage = (Stage) goback.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("../Ipad.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
        } catch (IOException ex) {
            Logger.getLogger(IphoneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
          
              //GO IPHONE VIEW
      public void goiphone() throws IOException
    {
          try {
            Stage stage = (Stage) goiphone.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("Basketballiphone.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
        } catch (IOException ex) {
            Logger.getLogger(IphoneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
