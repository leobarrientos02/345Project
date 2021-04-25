/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semesterproject;



import java.io.FileNotFoundException;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;


/**
 * Menu class is run upon Program Startup to introduce player
 * to the game via Alert Box
 * @author Adam Gordon, Leonel Barrientos, Bryan Gonzalez
 */


public class menu {

    private Alert menu;
    /**
     * Initial screen that loads on startup describing the game
     * @throws FileNotFoundException if files not found
     */
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
