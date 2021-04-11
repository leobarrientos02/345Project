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
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
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
        
        refresh = (Button)event.getSource();
        
        switch( refresh.getText()){
            
            case "Refresh Cards":
    
                Card1.setX(0);
                Card1.setY(0);
                
                break;
        }
        
    }

    @FXML
    private void checkAnswer(ActionEvent event) {
    }

    @FXML
    private void quitProgram(ActionEvent event) {
        
        quit = (Button)event.getSource();
        
        switch( quit.getText()){
            
            case "Quit":
                Alert alert = new Alert(AlertType.CONFIRMATION, "Are you sure you want to quit?");
                alert.showAndWait().ifPresent(response -> {
                    if (response == ButtonType.OK) {
                        System.exit(0);
                    }
                });
                
                break;
        }
    }
    
    
}
