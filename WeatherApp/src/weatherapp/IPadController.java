package weatherapp;

import api.WeatherAPI;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Owner
 */
public class IPadController implements Initializable {

    @FXML
    private Button rugby;
    @FXML
    private Button gym;
    @FXML
    private Button karate;
    @FXML
    private Button fencing;
    @FXML
    private Button bowling;
    @FXML
    private Button rowing;
    @FXML
    private Button hockey;
    @FXML
    private Button cricket;
    @FXML
    private Button skiing;
    @FXML
    private Button basketball;
    @FXML
    private Button running;
    @FXML
    private Button pingpong;
    @FXML
    private Button tennis;
    @FXML
    private Button football;
    @FXML
    private Button baseball;
    @FXML
    private Button swimming;
    @FXML
    private Button voleyball;
    @FXML
    private Button yoga;
    @FXML
    private Button cycling;
    @FXML
    private Button golf;
    @FXML
    private Button boxing;
    @FXML
    private Button goiphone;
    @FXML
    private Label label;
    @FXML
    private Label label2;
    @FXML
    private TextField searchfield;
    @FXML
    private Label temp;
    @FXML
    private Label location;
    @FXML
    private Label condition;
    @FXML
    ImageView icon;

    Image mostlyCloudy = new Image("resources/mostlycloudy.gif");
    Image mostlySunny = new Image("resources/mostlysunny.gif");
    Image rain = new Image("resources/rainy.gif");
    Image sunny = new Image("resources/sunny.gif");
    Image night = new Image("resources/moon.gif");
    Image cloudy = new Image("resources/cloudy.gif");
    Image windy = new Image("resources/windy.gif");
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
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
}