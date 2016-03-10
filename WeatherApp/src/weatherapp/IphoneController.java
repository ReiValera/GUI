/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherapp;

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

/**
 * FXML Controller class
 *
 * @author Owner
 */
public class IphoneController implements Initializable {

    @FXML
    Button goipad;
    @FXML
    Button basketball;
    @FXML
    Button tennis;
    @FXML
    Button swimming;
    @FXML
    Button running;
    @FXML
    Button football;
    @FXML
    Button volleyball;
    @FXML
    Label location;
    @FXML
    Label condition;
    @FXML
    Label temp;
    @FXML
    ImageView icon;
    
    //Image image = new Image("resources/volleysmall.png");
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        WeatherAPI weather = new WeatherAPI("44418");
        temp.setText(weather.CurrentTemp);
        location.setText(weather.Location);
        condition.setText(weather.Condition);
        //icon.setImage(image);
    }    
    public void goipad() throws IOException {
        try {
            Stage stage = (Stage) goipad.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("Ipad.fxml"));
            Scene scene = new Scene(root, 1024, 768);
            stage.setScene(scene);
        } catch (IOException ex) {
            Logger.getLogger(IphoneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /// GO RUGBY
    public void gobasketball() throws IOException {
        try {
            Stage stage = (Stage) basketball.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("sports/Basketballiphone.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
        } catch (IOException ex) {
            Logger.getLogger(IphoneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void gotennis() throws IOException {
        try {
            Stage stage = (Stage) tennis.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("sports/Tennisiphone.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
        } catch (IOException ex) {
            Logger.getLogger(IphoneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void goswimming() throws IOException {
        try {
            Stage stage = (Stage) swimming.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("sports/Swimmingiphone.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
        } catch (IOException ex) {
            Logger.getLogger(IphoneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void gorunning() throws IOException {
        try {
            Stage stage = (Stage) running.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("sports/Runningiphone.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
        } catch (IOException ex) {
            Logger.getLogger(IphoneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void gofootball() throws IOException {
        try {
            Stage stage = (Stage) football.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("sports/Footballiphone.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
        } catch (IOException ex) {
            Logger.getLogger(IphoneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void govolleyball() throws IOException {
        try {
            Stage stage = (Stage) volleyball.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("sports/Volleyballiphone.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
        } catch (IOException ex) {
            Logger.getLogger(IphoneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
