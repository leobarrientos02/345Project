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
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import java.util.List;

import java.util.HashSet;
import java.util.Set;

import java.util.Timer;
import javafx.animation.AnimationTimer;
import javax.swing.JFrame;
import java.util.TimerTask;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;


/**
 * FXML Controller class for Card Game Project
 *
 * @author gorda and Leonel
 */
public class ProjectLayoutController implements Initializable {

    //FILE
    private File f;
    private PrintWriter pw= null;

    
    // Images

    // Card InputStream variables

    private InputStream stream;
    private InputStream stream2;
    private InputStream stream3;
    private InputStream stream4;
    //Clock Image Variables
    private InputStream stream5;
    private InputStream stream6;
    private InputStream stream7;
    private InputStream stream8;
    //Card Image variables
    private Image image1;
    private Image image2;
    private Image image3;
    private Image image4;
    //Digit Class Instance Variables
    clockDigit right = new clockDigit(0);
    clockDigit midRight = new clockDigit(0);
    clockDigit midLeft = new clockDigit(0);
    clockDigit left = new clockDigit(0);

    
    //File Name
    private String fileName;
    private int value1, value2, value3, value4;
    private float answer;
    
    private String userInput;

    
    private long min, sec, hr, totalSeconds;
    

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
    @FXML
    private ImageView minute1;
    @FXML
    private ImageView minute2;
    @FXML
    private ImageView second2;
    @FXML
    private ImageView second1;
    
    private menu m;
    
    private Timer time = new Timer();
            
    @Override
    // starts the game
    public void initialize(URL url, ResourceBundle rb) {

        try {
            logAction("GAME SESSION INITIALIZE");
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
        //returns card image
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
        logAction( "asked for new deck");
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
                      logAction("asked for Solution");
                    }
                }
         }
        
    }

    @FXML
    private void generateNewGame() throws FileNotFoundException{
        checkAnswer.clear();
        ShowRandomCard();
        answerDisplay.clear();
       
        logAction("generated a new game");
    }

    @FXML
    private void checkAnswer(ActionEvent event) throws FileNotFoundException, ScriptException {
        
        // game object
        game g = new game();
        
        //Create a flag
        boolean flag= true;
        
        userInput = checkAnswer.getText();
                
        verifyButton = (Button)event.getSource();
        
        switch ( verifyButton.getText()){
            
            case "Verify":
       
                userInput = checkAnswer.getText();
                
                // Clean userinput
                String str_e = g.removeSpaces(userInput);
                
                // Get the numbers in the input
                List<String> digits = g.findDigit(str_e);
                int size = digits.size();
                                           
                // if user enter wrong values, show alert
                // To print the card value that the user can use dynamically
                String Alert_Values = String.valueOf(value1) + ", " + String.valueOf(value2) + ", " + String.valueOf(value3) + ", or " + String.valueOf(value4);
                
                // Message for wrong values provided
                String msg1= "Wrong value, you can only use the values " + Alert_Values;
                
                //Create alert
                Alert alert3 = new Alert(AlertType.ERROR, msg1);
                alert3.setHeaderText("Wrong numbers.");
                alert3.setTitle("Error");
            
                /*
                The next following lines of codes are going to be input validation,
                to ensure that we have the correct form of an expression. I use a flag
                set to true, if the validation fails then the flag would be set false.
                This would be used to later do if ( flag= true) run the following
                */
                
                // Test if input is empty
                if ( userInput.isEmpty()){
                    flag = false;
                    Alert alert = new Alert(AlertType.ERROR, "Please enter an expression");
                    alert.setHeaderText("No input.");
                    alert.setTitle("Error");
                    alert.showAndWait();                   
                }
                else if (size != 4){
                    flag = false;
                    Alert alert2 = new Alert(AlertType.ERROR, "Please enter an expression with 4 values");
                    alert2.setHeaderText("Wrong amount of numbers.");
                    alert2.setTitle("Error");
                    alert2.showAndWait(); 
                }
                else if( digits.contains(String.valueOf(value1)) == false ||digits.contains(String.valueOf(value2)) == false ||
                        digits.contains(String.valueOf(value3)) == false || digits.contains(String.valueOf(value4)) == false){
                    flag = false;
                    alert3.showAndWait();
                }
                else if(flag = true){
                    
                    //answer = g.applyOperator(value1, value2, op);
                    //answer = g.game(str_e);
                    //answerDisplay.setText(String.valueOf(g.game(str_e)));
                    ScriptEngineManager mgr = new ScriptEngineManager();
                    ScriptEngine engine = mgr.getEngineByName("JavaScript");
                    answerDisplay.setText((String.valueOf(engine.eval(str_e))));
                    answer = Float.parseFloat(answerDisplay.getText());
                    if( answer == 24 ){
                    
                        logAction("WON THE GAME");
                        Alert alert4 = new Alert(AlertType.CONFIRMATION,"Do you want to play again?");
                        alert4.setHeaderText("CORRECT");
                        alert4.showAndWait().ifPresent(response -> {
                            if (response == ButtonType.OK) {
                                try {
                                    checkAnswer.clear();
                                    ShowRandomCard();
                                    answerDisplay.clear();
                                    logAction("generated a new game");
                                } catch (FileNotFoundException ex) {
                                    Logger.getLogger(ProjectLayoutController.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                        });
                    }
                    else if ( answer != 24){
                        logAction("User input incorrect");
                        Alert alert5 = new Alert(AlertType.ERROR, "WRONG, NOT EQUAL TO 24");
                        alert5.setHeaderText("WRONG");
                        alert5.showAndWait();  
                    }
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
                        logAction("Shutdown Application");
                        System.exit(0);
                    }
                });
                
                break;
        }
    }
    
    
    public void logAction(String event){
        
        String timeStamp = new SimpleDateFormat("MM/dd/yyyy, HH:mm:ss").format(new Date());
        try{
        f = new File("log.txt");
        FileWriter writer = new FileWriter(f, true);
        pw = new PrintWriter(writer);
        pw.println(timeStamp + "  ----> User " + event + ".");
        }catch(IOException e){
            System.out.println("ERROR");
        }
        if( pw !=null){
            pw.close();
        }
    }
    

    public void timer(){
        
    }
    
     Timer gameClock = new Timer();
    TimerTask increment = new TimerTask() {
        @Override
        public void run() {
            runClock(second2,second1,minute2,minute1);
        }

        private void runClock(ImageView image1,ImageView image2,ImageView image3,ImageView image4) {
            while(true){
            int counter1 = 0;
            int counter2 = 0;
            int counter3 = 0;
            int counter4= 0;
            right.displayImage(counter1);
            midRight.displayImage(counter2);
            midLeft.displayImage(counter3);
            left.displayImage(counter4);
            counter1++;
            if(counter1 ==10){
                counter2++;
                counter1 = 0;
                right.displayImage(counter1);
                midRight.displayImage(counter2);
                midLeft.displayImage(counter3);
                left.displayImage(counter4);
                counter1++;         
            }
            if(counter2 == 10){
                counter3++;
                counter1 = 0;
                counter2 = 0;
                right.displayImage(counter1);
                midRight.displayImage(counter2);
                midLeft.displayImage(counter3);
                left.displayImage(counter4);
                counter1++;
            }
            if(counter3 == 10){
                counter4++;
                counter1 = 0;
                counter2 = 0;
                counter3 = 0;
                right.displayImage(counter1);
                midLeft.displayImage(counter2);
                midRight.displayImage(counter3);
                left.displayImage(counter4);
                counter2++;
            if(counter4 == 10){
                right.displayImage(9);
                midRight.displayImage(9);
                midLeft.displayImage(9);
                left.displayImage(9);
                break;}}
            }
        }
    };

}

   
    
        

