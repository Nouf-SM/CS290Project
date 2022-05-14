
package helloFX;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import static helloFX.CreateAccountController.emp;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author Nousa
 */
public class LoginController implements Initializable {

    @FXML
    private TextField id;
    @FXML
    private Label warning;
    @FXML
    private PasswordField password;
    @FXML
    private Label id_title;
    @FXML
    private Label pass_title;
    Hellofx obj = new Hellofx();
    @FXML
    private Button forgotpass;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void login2(ActionEvent event) throws IOException {
        if (id.getText().equals(emp.getID()) && password.getText().equals(emp.getPassword())) {
            warning.setText("تم تسجيل الدخول بنجاح");
            obj.changeScene("MainPage.fxml");
        }
        else if (id.getText().isEmpty() || password.getText().isEmpty()) {
            warning.setText("عذرا قم بتعبئة كل الحقول");
        }
        else {
            warning.setText("اسم مستخدم أو كلمة مرور خاطئة");
        }
    } 

    @FXML
    private void forgotPass(ActionEvent event) throws IOException {
        obj.changeScene("ForgotPass.fxml");
    }
}
