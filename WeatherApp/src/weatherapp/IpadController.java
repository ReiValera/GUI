/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherapp;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import static javafx.application.Application.launch;
import static javafx.application.ConditionalFeature.FXML;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

/**
 *
 * @author monicadzhaleva
 */
public class IpadController extends Application {

    @FXML
    Button goiphone;
    

    @FXML
    Label label;
    @FXML
    Label label2;
    @FXML
    TextField searchfield;
    
    
    
//<editor-fold defaultstate="collapsed" desc="Declaring go to Buttons">
    @FXML
            Button rugby;
    @FXML
            Button gym;
    @FXML
            Button karate;
    @FXML
            Button basketball;
    @FXML
            Button tennis;
    @FXML
            Button swimming;
    @FXML
            Button cycling;
    @FXML
            Button fencing;
    @FXML
            Button bowling;
    @FXML
            Button rowing;
    @FXML
            Button running;
    @FXML
            Button football;
    @FXML
            Button voleyball;
    @FXML
            Button golf;
    @FXML
            Button hockey;
    @FXML
            Button cricket;
    @FXML
            Button skiing;
    @FXML
            Button pingpong;
    @FXML
            Button baseball;
    @FXML
            Button yoga;
    @FXML
            Button boxing;   
//</editor-fold>

    
    

    public void start(Stage primaryStage) throws Exception {
    }

    //GO IPHONE VIEW
    public void goiphone() throws IOException {
        try {
            Stage stage = (Stage) goiphone.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("iPhone.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
        } catch (IOException ex) {
            Logger.getLogger(IphoneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    

    public void getTime() {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        DateFormat dateFormat2 = new SimpleDateFormat("a");

        Date date = new Date();
        Date date2 = new Date();

        System.out.println(dateFormat.format(date)); // 15:59
        label.setText(dateFormat.format(date));
        label2.setText(dateFormat2.format(date2));

    }

    public void searchActivities() {
        String input = searchfield.getText();
        System.out.println(input);
    }
    
    
    
    
    //<editor-fold defaultstate="collapsed" desc="Go To Methods">
    
    //GO RUGBY VIEW
    public void gorugby() throws IOException {
        try {
            Stage stage = (Stage) goiphone.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("sports/Rugby.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
        } catch (IOException ex) {
            Logger.getLogger(IphoneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void gogym() throws IOException {
        try {
            Stage stage = (Stage) gym.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("sports/Gym.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
        } catch (IOException ex) {
            Logger.getLogger(IphoneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void gokarate() throws IOException {
        try {
            Stage stage = (Stage) karate.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("sports/Karate.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
        } catch (IOException ex) {
            Logger.getLogger(IphoneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void gobasketball() throws IOException {
        try {
            Stage stage = (Stage) basketball.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("sports/Basketball.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
        } catch (IOException ex) {
            Logger.getLogger(IphoneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void gotennis() throws IOException {
        try {
            Stage stage = (Stage) tennis.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("sports/Tennis.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
        } catch (IOException ex) {
            Logger.getLogger(IphoneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void goswimming() throws IOException {
        try {
            Stage stage = (Stage) swimming.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("sports/Swimming.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
        } catch (IOException ex) {
            Logger.getLogger(IphoneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void gocycling() throws IOException {
        try {
            Stage stage = (Stage) cycling.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("sports/Cycling.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
        } catch (IOException ex) {
            Logger.getLogger(IphoneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void gofencing() throws IOException {
        try {
            Stage stage = (Stage) fencing.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("sports/Fencing.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
        } catch (IOException ex) {
            Logger.getLogger(IphoneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void gobowling() throws IOException {
        try {
            Stage stage = (Stage) bowling.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("sports/Bowling.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
        } catch (IOException ex) {
            Logger.getLogger(IphoneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void gorowing() throws IOException {
        try {
            Stage stage = (Stage) rowing.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("sports/Rowing.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
        } catch (IOException ex) {
            Logger.getLogger(IphoneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void gorunning() throws IOException {
        try {
            Stage stage = (Stage) running.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("sports/Running.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
        } catch (IOException ex) {
            Logger.getLogger(IphoneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void gofootball() throws IOException {
        try {
            Stage stage = (Stage) football.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("sports/Football.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
        } catch (IOException ex) {
            Logger.getLogger(IphoneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void govoleyball() throws IOException {
        try {
            Stage stage = (Stage) voleyball.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("sports/Voleyball.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
        } catch (IOException ex) {
            Logger.getLogger(IphoneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void gogolf() throws IOException {
        try {
            Stage stage = (Stage) golf.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("sports/Golf.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
        } catch (IOException ex) {
            Logger.getLogger(IphoneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void gohockey() throws IOException {
        try {
            Stage stage = (Stage) hockey.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("sports/Hockey.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
        } catch (IOException ex) {
            Logger.getLogger(IphoneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void gocricket() throws IOException {
        try {
            Stage stage = (Stage) cricket.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("sports/Cricket.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
        } catch (IOException ex) {
            Logger.getLogger(IphoneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void goskiing() throws IOException {
        try {
            Stage stage = (Stage) skiing.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("sports/Skiing.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
        } catch (IOException ex) {
            Logger.getLogger(IphoneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void gopingpong() throws IOException {
        try {
            Stage stage = (Stage) pingpong.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("sports/Pingpong.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
        } catch (IOException ex) {
            Logger.getLogger(IphoneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void gobaseball() throws IOException {
        try {
            Stage stage = (Stage) baseball.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("sports/Baseball.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
        } catch (IOException ex) {
            Logger.getLogger(IphoneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void goyoga() throws IOException {
        try {
            Stage stage = (Stage) yoga.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("sports/Yoga.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
        } catch (IOException ex) {
            Logger.getLogger(IphoneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void goboxing() throws IOException {
        try {
            Stage stage = (Stage) boxing.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("sports/Boxing.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
        } catch (IOException ex) {
            Logger.getLogger(IphoneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//</editor-fold>
}
