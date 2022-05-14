
package helloFX;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Nousa
 */
public class SettingsController implements Initializable {
    ObservableList <String> languages = FXCollections.observableArrayList("العربية", "الإنجليزية");
    @FXML
    private ChoiceBox choiceBox;
    Hellofx obj = new Hellofx();

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        choiceBox.setValue("العربية");
        choiceBox.setItems(languages);
    }    

    @FXML
    private void toScheduling(MouseEvent event) throws IOException {
        obj.changeScene("Schedule.fxml"); //later
    }

    @FXML
    private void toHome(MouseEvent event) throws IOException {
        obj.changeScene("MainPage.fxml"); //later
    }

    @FXML
    private void toProfile(MouseEvent event) throws IOException {
        obj.changeScene("Profile.fxml"); //later
    }

    @FXML
    private void logOut(ActionEvent event) throws IOException {
        obj.changeScene("HelloFXML.fxml");
    }
}
