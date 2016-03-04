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

    @FXML Button goiphone;
    @FXML Button rugby;

    @FXML  Label label;
    @FXML  Label label2;
    @FXML TextField searchfield;

    
   
    
    public void start(Stage primaryStage) throws Exception {
    }
    
    //GO IPHONE VIEW
      public void goiphone() throws IOException
    {
          try {
            Stage stage = (Stage) goiphone.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("iPhone.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
        } catch (IOException ex) {
            Logger.getLogger(IphoneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      
      
      //GO RUGBY VIEW
          public void gorugby() throws IOException
    {
          try {
            Stage stage = (Stage) goiphone.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("sports/Rugby.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
        } catch (IOException ex) {
            Logger.getLogger(IphoneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void getTime()
    {
    DateFormat dateFormat = new SimpleDateFormat("HH:mm");
    DateFormat dateFormat2 = new SimpleDateFormat("a");

    Date date = new Date();
    Date date2 = new Date();

    System.out.println(dateFormat.format(date)); // 15:59
    label.setText(dateFormat.format(date));
    label2.setText(dateFormat2.format(date2));

    }

    


public void searchActivities()
{
    String input=searchfield.getText();
    System.out.println(input);
}
   
}

