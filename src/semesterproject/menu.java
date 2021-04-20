/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semesterproject;


import javafx.animation.AnimationTimer;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

/**
 *
 * @author leoba
 */


public class menu {

    private Alert menu;
    private AnimationTimer Time;
    public void showMenu(){
    
        menu = new Alert(Alert.AlertType.CONFIRMATION,"Do you want to play?");
        menu.setHeaderText("CARD GAME 24");
        menu.setTitle("GAME");
        menu.setHeight(400);
        menu.showAndWait().ifPresent(response -> {
                        if (response == ButtonType.OK) {
                            menu.close();
                        }
                        else if (response == ButtonType.CANCEL){
                            System.exit(0);
                        }
                    });
    }
    
    public void startTime(){
        Time.start();
    }
    
    public void endTime(){
        Time.stop();
    }
    public String getTime(){
        return Time.toString();
    }
}
