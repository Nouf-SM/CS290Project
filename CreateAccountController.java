
package helloFX;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Nousa
 */
public class CreateAccountController implements Initializable {

    @FXML
    private Label title_label;
    @FXML
    private TextField id;
    @FXML
    private Label pass_label;
    @FXML
    private Label id_label;
    @FXML
    private Button create_acc;
    @FXML
    private Label warning;
    @FXML
    private PasswordField password;
    @FXML
    private Label pass_title1;
    @FXML
    private PasswordField password_confirm;
    @FXML
    private Label email_label;
    @FXML
    private Label phone_label;
    @FXML
    private CheckBox instructor;
    @FXML
    private TextField email;
    @FXML
    private TextField phone;
    @FXML
    private Label name_label;
    @FXML
    private TextField name;
    public static Employee emp = new Employee();
    @FXML
    private ImageView arrow;
    Hellofx obj = new Hellofx();
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void create_acc(ActionEvent event) throws InterruptedException, IOException {
        if (id.getText().isEmpty() || password.getText().isEmpty() || password_confirm.getText().isEmpty()
                || email.getText().isEmpty() || phone.getText().isEmpty() || name.getText().isEmpty()) {
            warning.setText("عذرا قم بتعبئة كل الحقول");
        }
        else if (!(password.getText().equals(password_confirm.getText()))) {
            warning.setText("أعد كتابة الرقم السري بشكل صحيح");
        }
        else {
            emp.setName(name.getText()); emp.setID(id.getText());
            emp.setPassword(password.getText()); emp.setEmail(email.getText());
            emp.setPhone(phone.getText());
            obj.changeScene("HelloFXML.fxml"); 
        }
    }
    @FXML
    private void goBack(MouseEvent event) throws IOException {
        obj.changeScene("HelloFXML.fxml");
    }
}
