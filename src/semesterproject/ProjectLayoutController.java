/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semesterproject;

import javafx.scene.Group;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class for Card Game Project
 *
 * @author gorda
 */
public class ProjectLayoutController implements Initializable {

    
    @FXML
    private Pane midleftbox;
    @FXML
    private ImageView leftmidpic;
    @FXML
    private Pane midrightbox;
    @FXML
    private ImageView rightmidpic;
    @FXML
    private Pane leftbox;
    @FXML
    private ImageView leftpic;
    @FXML
    private Pane rightbox;
    @FXML
    private ImageView rightpic;
    @FXML
    private TextField toptextbox;
    @FXML
    private Button answerfinder;
    @FXML
    private Button refresh;

  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
