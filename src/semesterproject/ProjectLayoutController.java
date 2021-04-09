/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semesterproject;



import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class for Card Game Project
 *
 * @author gorda
 */
public class ProjectLayoutController implements Initializable {

    @FXML
    private AnchorPane anchorpane;
    @FXML
    private ImageView Card1;
    @FXML
    private ImageView Card11;
    @FXML
    private ImageView Card111;
    @FXML
    private ImageView Card1111;
    @FXML
    private TextField answerDisplay;
    @FXML
    private Button cheatkey;
    @FXML
    private Button refresh;
    @FXML
    private TextArea TextExpression;
    @FXML
    private TextField checkAnswer;
    @FXML
    private Button verifyButton;
    @FXML
    private Button quit;

    

  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void displaySolution(ActionEvent event) {
    }

    @FXML
    private void generateNewGame(ActionEvent event) {
    }

    @FXML
    private void checkAnswer(ActionEvent event) {
    }

    @FXML
    private void quitProgram(ActionEvent event) {
    }
    
}

