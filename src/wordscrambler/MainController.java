/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordscrambler;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Gergö Szijarto
 */
public class MainController implements Initializable {

    @FXML
    private TextField tfGuess;
    @FXML
    private Label lblWord;
    @FXML
    private Button btnGuess;

    Model m = new Model();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        lblWord.setText(m.shuffle());
        
    }

    @FXML
    private void btnGuessPressed(ActionEvent event) {
        m.handleInput(tfGuess.getText());
        lblWord.setText(m.getCurrentWord());
        tfGuess.setText(null);
    }

}
