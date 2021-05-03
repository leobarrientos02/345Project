/**
 * Team 4's JavaFX based 24 game. Developed for BCS345 at FSC , Spring 2021
 * @autho AdamGordon(PM), @LeonelBarrientos, and @BryanGonzalez 
 * @version 1.0
 * @since 4/24/21
 */
package semesterproject;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;

/**
 * This is the driver class for the GUI for the 24 game,
 * using JavaFX 2.0.  
 * @author Adam Gordon, Leonel Barrientos, Bryan Gonzalez
 * @version 1.0
 */
public class SemesterProject extends Application{
    private menu m;
    @Override
    /**
     * Set's the GUI up to read from the FXML file
     */
    public void start(Stage stage) throws Exception{
    Parent root = FXMLLoader.load(getClass().getResource("ProjectLayout.fxml"));
    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.setTitle("Card Game 24");
    stage.show();
    
    m = new menu();
    m.showMenu();
    }
    /**
     * Launches GUI automatically
     * @param args default argument
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
