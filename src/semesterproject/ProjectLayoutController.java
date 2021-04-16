/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semesterproject;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * FXML Controller class for Card Game Project
 *
 * @author gorda
 */
public class ProjectLayoutController implements Initializable {

    
    // Images
    private InputStream stream;
    private InputStream stream2;
    private InputStream stream3;
    private InputStream stream4;
    private InputStream stream5;
    
    private Image image1;
    private Image image2;
    private Image image3;
    private Image image4;
    
    private String fileName;
    private int value1, value2, value3, value4;
    
    private String userInput;
    
    private Expression express;
    
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
    private TextField checkAnswer;
    @FXML
    private Button verifyButton;
    @FXML
    private Button quit;
    
            
    @Override



    public void initialize(URL url, ResourceBundle rb) {
        try {
            logAction("Game Session Initialized", file);
            ShowRandomCard();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ProjectLayoutController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public String Generate_RandomCard(){
        //Generate a random card from the deck
       
        fileName="";
        String value ="";
        String cardType = "";
        //Generate Random number to choose from the array
        Random rn = new Random();
        int answer = rn.nextInt(4) + 1;
        switch(answer){
            case 1:
                cardType = "spades";
                break;
            case 2:
                cardType= "diamonds";
                break;
            case 3:
                cardType="clubs";
                break;
            case 4:
                cardType = "hearts";
                break;
            default:
                break;
        }
    
        // Generate Random number for card value
        Random rn2 = new Random();
        int answer2 = rn2.nextInt(13) + 1;
        switch (answer2) {
            case 1:
                value = "ace";
                break;
            case 2:
                value = "2";
                break;
            case 3:
                value = "3";
                break;
            case 4:
                value = "4";
                break;
            case 5:
                value = "5";
                break;
            case 6:
                value = "6";
                break;
            case 7:
                value = "7";
                break;
            case 8:
                value = "8";
                break;
            case 9:
                value = "9";
                break;
            case 10:
                value="10";
                break;
            case 11:
                value = "jack";
                break;
            case 12:
                value = "queen";
                break;
            case 13:
                value = "king";
                break;
            default:
                break;
        }
        
        return fileName = value + "_of_" + cardType + ".png";

    }
    
    private int getCardValue(String fileName){
        
        int temp=0;
        
        char[] ch = new char[fileName.length()];
        for(int i=0; i< fileName.length();i++){
            ch[i] = fileName.charAt(i);
        }
        
        switch (ch[0]) {
            case 'a':
                temp=1;
                break;
            case '2':
                temp=2;
                break;
            case '3':
                temp=3;
                break;
            case '4':
                temp=4;
                break;
            case '5':
                temp=5;
                break;
            case '6':
                temp=6;
                break;
            case '7':
                temp=7;
                break;
            case '8':
                temp=8;
                break;
            case '9':
                temp=9;
                break;
            case '1':
                temp =10;
                break;
            case 'j':
                temp=11;
                break;
            case 'q':
                temp=12;
                break;
            case 'k':
                temp=13;
                break;
            default:
                break;
        }
        
        return temp;
    }
    
    private void ShowRandomCard() throws FileNotFoundException{
        logAction("Generated new Game", file);
        String file = Generate_RandomCard();
        stream = new FileInputStream("src/images/" + file);
        image1 = new Image(stream);
        
        value1 = getCardValue(fileName);
        
        String file2 = Generate_RandomCard();
        if(file.equals(file2)){
            file2 = Generate_RandomCard();
        }
        if( file.equals(file2) == false){
            stream2 = new FileInputStream("src/images/"+ file2);
            image2 = new Image(stream2);           
        }
        value2 = getCardValue(fileName);
        
        
        String file3 = Generate_RandomCard();
        if(file3.equals(file2)|| file3.equals(file)){
            file3 = Generate_RandomCard();
        }
        if(file3.equals(file2) == false || file3.equals(file) == false){
            stream3 = new FileInputStream("src/images/" + file3);
            image3 = new Image(stream3);            
        }
        value3 = getCardValue(fileName);     
        
        String file4 = Generate_RandomCard();
        if(file4.equals(file3)|| file4.equals(file2) || file4.equals(file)){
            file4=Generate_RandomCard();
        }
        if(file4.equals(file3) == false || file4.equals(file3) == false || file4.equals(file) == false){
            stream4 = new FileInputStream("src/images/" + file4);
            image4 = new Image(stream4);
        }
        value4 = getCardValue(fileName);
        
        //Testing if values are equal to cards on screen
        //int answer = value1 + value2 + value3 + value4;
        //answerDisplay.setText(String.valueOf(answer));
        
        
        // Create the image view
        Card1.setImage(image1);
        Card11.setImage(image2);
        Card111.setImage(image3);
        Card1111.setImage(image4);
    }
   
    @FXML
    private void displaySolution(ActionEvent event) throws FileNotFoundException {
        cheatkey = (Button)event.getSource();
        switch( cheatkey.getText()){
            case "Show Solution":
                
                // SORT THE CARD VALUES
                // The solutions txt file is sorted in accending order
                // Sorting the values, would allow to find a solution with
                // the random card values shown.
                int digits[] = new int[4];
                digits[0] = value1;
                digits[1] = value2;
                digits[2] = value3;
                digits[3] = value4;
                
                int temp=0;
                for (int i = 0; i < 4; i++) {
                    for (int j = i + 1; j < 4; j++) { 
                        if (digits[i] > digits[j]) {
                            temp = digits[i];
                            digits[i] = digits[j];
                            digits[j] = temp;
                        }
                    }
                }
                // LETS FIND A SOLUTION
                Expression s1 = new Expression(digits[0], digits[1],digits[2],digits[3]);
                String op = " " + String.valueOf(s1.getValue1())+ " " + String.valueOf(s1.getValue2())+ " " +
                        String.valueOf(s1.getValue3()) + " " + String.valueOf(s1.getValue4());
                String solution="";
                Scanner scanner = new Scanner(new FileInputStream("src/semesterproject/solution.txt"));
                while(scanner.hasNextLine()){
                    String s = scanner.nextLine();
                    if( s.indexOf(op) != -1){
                       solution = scanner.nextLine();
                       answerDisplay.setText(solution);
                      logAction("Solution Displayed", file);
                    }
                }
         }
        
    }

    @FXML
    private void generateNewGame() throws FileNotFoundException{
        checkAnswer.clear();
        ShowRandomCard();
        answerDisplay.clear();
        logAction("Generate new game", file);
    }


    @FXML
    private void checkAnswer(ActionEvent event) throws FileNotFoundException {
        
        userInput = checkAnswer.getText();
                
        verifyButton = (Button)event.getSource();
        
        switch ( verifyButton.getText()){
            
            
            case "Verify":
       
                userInput = checkAnswer.getText();
                        
                
                express = new Expression();
                               
                String temp = express.PrintExpression(userInput);
                //answerDisplay.setText(String.valueOf(temp));                      
                
                if( userInput.equals("24")){
                    logAction("WON THE GAME", file);
                    Alert alert = new Alert(AlertType.CONFIRMATION,"Do you want to play again?");
                    alert.setHeaderText("CORRECT");
                    alert.showAndWait().ifPresent(response -> {
                        if (response == ButtonType.OK) {
                            try {
                                checkAnswer.clear();
                                ShowRandomCard();
                                answerDisplay.clear();
                                logAction("Generate new game", file);
                            } catch (FileNotFoundException ex) {
                                Logger.getLogger(ProjectLayoutController.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    });
                }
                else if( userInput.isEmpty()){
                    logAction("User input faulty", file);
                    Alert alert = new Alert(AlertType.ERROR, "Please Enter an Expression");
                    alert.setHeaderText("NO ANSWER");
                    alert.showAndWait();          
                }
                else{
                    logAction("User input incorrect", file);
                    Alert alert = new Alert(AlertType.ERROR, "WRONG, NOT EQUAL TO 24");
                    alert.setHeaderText("WRONG");
                    alert.showAndWait();  
                }
                
            break;
        }
    }

    @FXML
    private void quitProgram(ActionEvent event) {
        
        quit = (Button)event.getSource();
        
        switch( quit.getText()){
            
            case "Quit":
                Alert alert = new Alert(AlertType.CONFIRMATION, "Are you sure you want to quit?");
                alert.showAndWait().ifPresent(response -> {
                    if (response == ButtonType.OK) {
                        logAction("Quit the game", file);
                        System.exit(0);
                    }
                });
                
                break;
        }
    }
 File file = new File("log.txt");
    public void logAction(String string,File file){
        
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        try{
        FileWriter writer = new FileWriter("log.txt");
        writer.write(timeStamp + string +" Action was Done by user.");
     
        writer.close();
}
        catch(IOException e){
            System.out.print("Error");
        }
    }
}
