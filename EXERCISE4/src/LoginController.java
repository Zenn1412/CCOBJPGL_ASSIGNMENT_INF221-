import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Node;

public class LoginController {
    
    @FXML
    TextField mytextfield;

    @FXML
    PasswordField mypasswordfield;
    
    @FXML
    ButtonField mybutton;

    public void login(ActionEvent Event) throws IOException{
        String username = mytextfield.getText();
        String password = mypasswordfield.getText();

        if (username.equals("paulo") && password.equals("agapito1234")) {

            Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();    
            stage.setScene(scene);
            stage.show();

        }else {
            
        }

    }

}
