
package helloFX;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import static helloFX.CreateAccountController.emp;
import java.io.IOException;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;

/**
 * FXML Controller class
 *
 * @author Nousa
 */
public class ForgotPassController implements Initializable {

    @FXML
    private ImageView arrow;
    @FXML
    private PasswordField newPass;
    Hellofx obj = new Hellofx();
    @FXML
    private Label warning;
    @FXML
    private PasswordField confirmPass;
    @FXML
    private Button newPassButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void goBack(MouseEvent event) throws IOException {
        obj.changeScene("HelloFXML.fxml");
    }

    @FXML
    private void toLogin(ActionEvent event) throws IOException {
        if (newPass.getText().isEmpty() || confirmPass.getText().isEmpty()){
            warning.setText("عذرا قم بتعبئة جميع الحقول");
        }
        else if (!(newPass.getText().equals(confirmPass.getText()))){
            warning.setText("أعد كتابة كلمة المرور بشكل صحيح");
        }
        else {
            emp.setPassword(newPass.getText());
            obj.changeScene("HelloFXML.fxml");
        }
    }  
}
