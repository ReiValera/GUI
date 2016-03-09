/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherapp;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import static javafx.application.ConditionalFeature.FXML;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class IphoneController extends Application {

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

    @Override
    public void start(Stage primaryStage) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
