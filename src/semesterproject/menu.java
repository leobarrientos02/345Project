/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semesterproject;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import javafx.animation.AnimationTimer;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DialogPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.Border;

/**
 *
 * @author leoba
 */


public class menu {

    private Alert menu;
    
    public void showMenu() throws FileNotFoundException{
        
        
        menu = new Alert(Alert.AlertType.CONFIRMATION,"Do you want to play?");
        menu.setHeaderText("CARD GAME 24");
        menu.setTitle("GAME");
        menu.setHeight(310);
        

        menu.setContentText("Card game 24, four random card from a full deck of cards are"
                + " displayed on screen and you are required to use the card values to create an"
                + " expression that equals 24.\nDO YOU THINK YOU CAN TAKE ON THIS CHALLENGE?");
        menu.showAndWait().ifPresent(response -> {
                        if (response == ButtonType.OK) {
                            menu.close();
                        }
                        else if (response == ButtonType.CANCEL){
                            System.exit(0);
                        }
                    });
    }
    
}
