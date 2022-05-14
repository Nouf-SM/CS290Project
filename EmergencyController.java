
package helloFX;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;

public class EmergencyController {

    @FXML
    private ImageView profile;
    @FXML
    private Button backInEmergency;

    Hellofx obj = new Hellofx();


    @FXML
     private void toSetting(MouseEvent event) throws IOException {
        obj.changeScene("Settings.fxml"); //complete later
    }

    @FXML
    private void toProfile(MouseEvent event) throws IOException {
        obj.changeScene("Profile.fxml"); //later
    }
    
    
    @FXML
    private void toMainpage(MouseEvent event) throws IOException {
        obj.changeScene("MainPage.fxml"); //later
    }
    

    @FXML
    private void toScheduling(MouseEvent event)throws IOException {
        obj.changeScene("Schedule.fxml");
    }
 
}

