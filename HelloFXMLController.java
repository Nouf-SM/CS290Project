
package helloFX;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author Nousa
 */
public class HelloFXMLController implements Initializable {

    @FXML
    private Button loginButton;
    @FXML
    private Button cabutton;

    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void login1(ActionEvent event) throws IOException {
        Hellofx obj = new Hellofx();
        obj.changeScene("Login.fxml");
    }

    @FXML
    private void createAcc1(ActionEvent event) throws IOException {
        Hellofx obj = new Hellofx();
        obj.changeScene("CreateAccount.fxml");
    }
 
}
