/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semesterproject;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

public class SemesterProject extends Application{
    
    @Override
    public void start(Stage stage) throws Exception{
    Parent root = FXMLLoader.load(getClass().getResource("ProjectLayout.fxml"));
    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.setTitle("Card Game");
    stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
