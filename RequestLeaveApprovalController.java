
package helloFX;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import static helloFX.CreateAccountController.emp;
import java.io.IOException;
import java.time.LocalDate;

/**
 * FXML Controller class
 *
 * @author rawanalabdulkarim
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class RequestLeaveApprovalController implements Initializable {

    @FXML
    private ImageView arrow;

    @FXML
    private DatePicker datePicker1;

    @FXML
    private DatePicker datePicker2;

    @FXML
    private Label id_label;

    @FXML
    private Label name_label;

    @FXML
    private Label output_date1Lable;

    @FXML
    private Label output_date2Lable;

    @FXML
    private Label reason_label;

    @FXML
    private Button select_date1Button;

    @FXML
    private Button select_date2Button;

    @FXML
    private Button send_request;
    @FXML
    private Label SendMessageLable;
    Hellofx obj = new Hellofx();
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        name_label.setText(emp.getName());
        id_label.setText(emp.getID()); 
    }
    @FXML
    private void SendRequest(ActionEvent event) {
        SendMessageLable.setText("تم ارسال الطلب بنجاح");  
    }
    @FXML
    private void goBack(MouseEvent event) throws IOException {
        obj.changeScene("MainPage.fxml");
    }

    @FXML
    void select_date1ButtonHandler(ActionEvent event) {
        LocalDate lacalDate1 = datePicker1.getValue();
        output_date1Lable.setText(lacalDate1+"من ");
    }

    @FXML
    void select_date2ButtonHandler(ActionEvent event) {
        LocalDate localDate2 = datePicker2.getValue();
        output_date2Lable.setText(localDate2+" الى");
    }

}