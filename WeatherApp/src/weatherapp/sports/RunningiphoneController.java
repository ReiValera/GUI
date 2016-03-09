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
import javafx.stage.Stage;
import weatherapp.IphoneController;

/**
 * FXML Controller class
 *
 * @author gabrieluliano
 */
public class RunningiphoneController implements Initializable {

    @FXML
    Button back;

    
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
    public void goback() throws IOException {
        try {
            Stage stage = (Stage) back.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("../iPhone.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
        } catch (IOException ex) {
            Logger.getLogger(IphoneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
    
     public void goipad() throws IOException {
        try {
            Stage stage = (Stage) back.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("Running.fxml"));
            Scene scene = new Scene(root, 1024, 768);
            stage.setScene(scene);
        } catch (IOException ex) {
            Logger.getLogger(IphoneController.class.getName()).log(Level.SEVERE, null, ex);
        }
}
     
}
