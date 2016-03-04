/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherapp;

import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Owner
 */
public class IpadController implements Initializable {

    @FXML Button goiphone;
    @FXML Button rugby;

    @FXML  Label label;
    @FXML  Label label2;
    @FXML TextField searchfield;
    Timer timer = new Timer();

    /**
     * Initializes the controller class.
     */
    public void initialize(URL url, ResourceBundle rb) 
    {
        
    DateFormat dateFormat = new SimpleDateFormat("HH:mm");
       Date date = new Date();
    label.setText(dateFormat.format(date));           

       
    }    

    //GO IPHONE VIEW
    public void goiphone() throws IOException
    {
        try 
        {
            Stage stage = (Stage) goiphone.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("iPhone.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
        } 
        catch (IOException ex) 
        {
            Logger.getLogger(IphoneController.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }
      //GO RUGBY VIEW
    public void gorugby() throws IOException
    {
        try
        {
            Stage stage = (Stage) goiphone.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("sports/Rugby.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
        } 
        catch (IOException ex) 
        {
            Logger.getLogger(IphoneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void searchActivities()
    {
        String input=searchfield.getText();
        System.out.println(input);
    }
}
