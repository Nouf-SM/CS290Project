
package helloFX;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseEvent;
import javax.swing.JOptionPane;
import static helloFX.CreateAccountController.emp;

/**
 * FXML Controller class
 *
 * @author rah.
 */
public class MainPageController implements Initializable {
    @FXML
    private Label search_label;
    Hellofx obj = new Hellofx();
    @FXML
    private ImageView profile;
    @FXML
    private ImageView emergencyCall;
    @FXML
    private Label name_label;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        name_label.setText(emp.getName());
    } 
    @FXML
    private void toScheduling(MouseEvent event) throws IOException {
        obj.changeScene("Schedule.fxml"); //complete later
    }
    private void toMainPage(MouseEvent event) throws IOException {
        obj.changeScene("MainPage.fxml"); //complete later
    }

    @FXML
    private void toSetting(MouseEvent event) throws IOException {
        obj.changeScene("Settings.fxml"); //complete later
    }

    @FXML
    private void toProfile(MouseEvent event) throws IOException {
        obj.changeScene("Profile.fxml"); //later
    }
    
    @FXML
    private void toEmergency(MouseEvent event) throws IOException {
        obj.changeScene("Emergency.fxml"); //later
    }

    @FXML
    private void toRequestLeaveApp(MouseEvent event) throws IOException {
        obj.changeScene("RequestLeaveApproval.fxml");  
    }
  
}
