
package helloFX;

import java.awt.Color;
import java.awt.Insets;
import java.awt.Paint;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author rah.
 */
public class ScheduleController implements Initializable {

    @FXML
    private ImageView profile;
    @FXML
    private Button button2A;
    @FXML
    private Button button2B;
    @FXML
    private Button button2C;
    @FXML
    private Button button1A;
    @FXML
    private Button button1B;
    @FXML
    private Button button1C;
    @FXML
    private Button saveChanges;
    Hellofx obj = new Hellofx();
    @FXML
    private Label SaveChangesLable;
    @FXML
    private Label Lable1Full;
    @FXML
    private Label Lable2Full;
    @FXML
    private Label Lable3Full;
    @FXML
    private Label Lable5Full;
    @FXML
    private Label Lable4Full;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML
    private void toSetting(MouseEvent event)throws IOException {
        obj.changeScene("Settings.fxml");
    }
    @FXML
    private void toProfile(MouseEvent event) throws IOException{
        obj.changeScene("Profile.fxml");    
    }
    @FXML
    private void buttonHandler(ActionEvent event) {
        
        if(button1A.getStyle().contains("-fx-background-color:#ffffff;"))
            button1A.setStyle("-fx-background-color:#0b8313;");
        else
            button1A.setStyle("-fx-background-color:#ffffff;");
    }
    @FXML
    private void toMainPage(MouseEvent event)throws IOException {
        obj.changeScene("MainPage.fxml");
    }

    @FXML
    private void buttonHandler2A(ActionEvent event) {
        if(button2A.getStyle().contains("-fx-background-color:#ffffff;"))
            button2A.setStyle("-fx-background-color:#0b8313;");
        else
            button2A.setStyle("-fx-background-color:#ffffff;");
    }

    @FXML
    private void buttonHandler2B(ActionEvent event) {
        if(button2B.getStyle().contains("-fx-background-color:#ffffff"))
            button2B.setStyle("-fx-background-color:#0b8313");
        else
            button2B.setStyle("-fx-background-color:#ffffff");
    }

    @FXML
    private void buttonHandler2C(ActionEvent event) {
        if(button2C.getStyle().contains("-fx-background-color:#ffffff;"))
            button2C.setStyle("-fx-background-color:#0b8313;");
        else
            button2C.setStyle("-fx-background-color:#ffffff;");
    }

    @FXML
    private void buttonHandler1B(ActionEvent event) {
        if(button1B.getStyle().contains("-fx-background-color:#ffffff;"))
            button1B.setStyle("-fx-background-color:#0b8313;");
        else
            button1B.setStyle("-fx-background-color:#ffffff;");
    }

    @FXML
    private void buttonHandler1C(ActionEvent event) {
        if(button1C.getStyle().contains("-fx-background-color:#ffffff;"))
            button1C.setStyle("-fx-background-color:#0b8313;");
        else
            button1C.setStyle("-fx-background-color:#ffffff;");
    }

    @FXML
    private void saveChanges(ActionEvent event) {
       SaveChangesLable.setText("تم حفظ التغيرات بنجاح");  
    }

    @FXML
    private void fullShift(ActionEvent event) {
        Lable1Full.setText("ممتلئ");
        Lable2Full.setText("ممتلئ");  
        Lable3Full.setText("ممتلئ");
        Lable4Full.setText("ممتلئ"); 
        Lable5Full.setText("ممتلئ"); 
    }
    
}
