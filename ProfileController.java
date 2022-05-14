
package helloFX;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import static helloFX.CreateAccountController.emp;


/**
 * FXML Controller class
 *
 * @author Nousa
 */
public class ProfileController implements Initializable {

    @FXML
    private Label name_label;
    @FXML
    private Label id_label;
    @FXML
    private Label email_label;
    @FXML
    private Label phone_label;
    Hellofx obj = new Hellofx();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        name_label.setText(emp.getName());
        id_label.setText(emp.getID());
        email_label.setText(emp.getEmail());
        phone_label.setText(emp.getPhone());
    }    

    @FXML
    private void toScheduling(MouseEvent event) throws IOException {
        obj.changeScene("Schedule.fxml"); //complete later
    }

    @FXML
    private void toSetting(MouseEvent event) throws IOException {
        obj.changeScene("Settings.fxml"); //complete later
    }

    @FXML
    private void toHome(MouseEvent event) throws IOException {
        obj.changeScene("MainPage.fxml"); //complete later
    }
}
