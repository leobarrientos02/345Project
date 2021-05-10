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
import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;


/**
 * FXML Controller class for Card Game Project
 *
 * @author Adam Gordon, Leonel Barrientos, 
 */
public class ProjectLayoutController implements Initializable {

    //FILE
    private File f;
    private PrintWriter pw= null;

    // Card InputStream variable
    private InputStream stream;
    private InputStream stream2;
    private InputStream stream3;
    private InputStream stream4;
    private Card card1 = new Card();
    private Card card2 = new Card();
    private Card card3 = new Card();
    private Card card4 = new Card();

    @FXML
    private Button timeBtn2;

    //Card Image variables
    private Image image1;
    private Image image2;
    private Image image3;
    private Image image4;

    
    //File Name
    private String fileName;
    private int value1, value2, value3, value4;
    private float answer;

    private String userInput;



    @FXML
    private AnchorPane anchorPane;
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
     
    // TIME 
    @FXML
    private TextField timer111;
    private int seconds=0, minutes=0, hours=0;
    private Timer timer1 = new Timer();
    @FXML
    private Button timeBtn;
    @FXML
    private ImageView leftBox;
    @FXML
    private ImageView midLeftBox;
    @FXML
    private ImageView rightBox;
    @FXML
    private ImageView midRightBox;


    /**
     * printTime is an extension of TimerTask,to keep track of elapsed game time
     */
    public class printTime extends TimerTask{
 

        @Override
        public void run() {
 
            seconds = seconds +1;
            
            if(seconds == 59){
                seconds=0;
                minutes = minutes + 1;
            }
            else if( minutes == 59){
                seconds=0;
                minutes = 0;
                hours = hours + 1;
            }
            else if( hours == 24){
                seconds =0;
                minutes = 0;
                hours = 0;
            }
            timer111.setText(String.valueOf(hours) + "hrs   " + String.valueOf(minutes) + "min    " + String.valueOf(seconds)+ "s  " );
        }         
    }
    
    
    @Override
    /**
     * Method that starts the game automatically when loaded
     * using parameters in the FXMLLoader class
     * @throws FileNotFound Exception
     */
    public void initialize(URL url, ResourceBundle rb) {
                
        try {
            logAction("GAME SESSION INITIALIZE");
            showRandomCard();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ProjectLayoutController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * This method takes in a card object, and uses a RNG system
     * to choose an unused card for the game
     * @param card
     * @return 
     */
    public Card generateRandomCard(Card card){
        //Generate a random card from the deck
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
        card.setSuit(cardType);
        card.setCardFace(value);
        card.setFileName(value, cardType);
        return card;

    }
    
 
    /**
     * This method
     * @param fileName from the Generate_Random_Card method
     * @return a value to use in calculating the solution
     */
    public int getCardValue(String fileName){
        
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
    /**
     * ShowRandomCard is a method to display images of 4 random cards
     * @throws FileNotFoundException if filename is wrong
     */
    public void showRandomCard() throws FileNotFoundException{
        logAction( "asked for new deck");
        generateRandomCard(card1);
        stream = new FileInputStream("src/images/" + card1.getFileName());
        image1 = new Image(stream);
        
        value1 = getCardValue(card1.getFileName());
        
        
        /* The first card value can be any card from the image folder
        // now the next card are going to require us to ensure the same
        // cards are not repeated on screen. Each time we generate a new 
        // random card we test if the file is equal to the previous cards
        // file name, if so regenerate another card else stream the file
        // show the image to the screen.*/
        generateRandomCard(card2);
        if(card1.getFileName().equals(card2.getFileName())){
            generateRandomCard(card2);
        }
        if( card1.getFileName().equals(card2.getFileName()) == false){
            stream2 = new FileInputStream("src/images/"+ card2.getFileName());
            image2 = new Image(stream2);           
        }
        value2 = getCardValue(card2.getFileName());
        
        
        generateRandomCard(card3);
        if(card3.getFileName().equals(card2.getFileName())||card3.getFileName().equals(card1.getFileName())){
            card3 = generateRandomCard(card3);
        }
        
        if(card3.getFileName().equals(card2.getFileName()) == false || card3.getFileName().equals(card1.getFileName()) == false){
            stream3 = new FileInputStream("src/images/" + card3.getFileName());
            image3 = new Image(stream3);            
        }
        value3 = getCardValue(card3.getFileName());     
        
       generateRandomCard(card4);
        if(card4.getFileName().equals(card4.getFileName())|| card4.getFileName().equals(card2.getFileName()) || card4.getFileName().equals(card1.getFileName())){
            generateRandomCard(card4);
        }
        if(card4.getFileName().equals(card4.getFileName()) == false || card4.getFileName().equals(card2.getFileName()) == false || card4.getFileName().equals(card1.getFileName()) == false){
            stream4 = new FileInputStream("src/images/" + card4.getFileName());
            image4 = new Image(stream4);
        }
        value4 = getCardValue(card4.getFileName());
            
        
        //Testing if values are equal to cards on screen
        //int answer = value1 + value2 + value3 + value4;
        //answerDisplay.setText(String.valueOf(answer));
        
        
        // Create the image view
        rightBox.setImage(image1);
        midRightBox.setImage(image2);
        midLeftBox.setImage(image3);
        leftBox.setImage(image4);
       // timer1.schedule( new printTime(), 0, 1000);
        logAction("Started timer");
    }
    /**
     * displaySolution is a method which displays the solution
     * by reading from a text file showing all solutions for each combination.
     * @param event Pressing the Show Solution Button
     * @throws FileNotFoundException if answer is not in the key/
     */
    @FXML
    public void displaySolution(ActionEvent event) throws FileNotFoundException {
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
                
                // Reads in all the solutions from solution.txt
                // which holds all the solutions and also all
                // no possible solutions.
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
    /**
     * This method starts the game upon program launch, as well as when
     * the user presses the refresh button, showing the random cards and starting the timer
     * @throws FileNotFoundException 
     */
    @FXML
    public void generateNewGame() throws FileNotFoundException{
        checkAnswer.clear();
        showRandomCard();
        answerDisplay.clear();
        logAction("Started timer");
        logAction("generated a new game");
    }
    /**
     * checkAnswer uses the ScriptEngineManager to verify if the user has 
     * input the correct answer or not using the JavaScript Engine. Uses
     * objects from the game class, and
     * @param event Clicking the Verify button
     * @throws FileNotFoundException if
     * @throws ScriptException 
     */
    @FXML
    public void checkAnswer(ActionEvent event) throws FileNotFoundException, ScriptException {
        
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
                // Using the size variable which hold the size of the digits List
                // which grabs the four numbers from the user input. If size is not
                // equal to 4, there are more or less than 4 numbers in the input.
                else if (size != 4){
                    flag = false;
                    Alert alert2 = new Alert(AlertType.ERROR, "Please enter an expression with 4 values");
                    alert2.setHeaderText("Wrong amount of numbers.");
                    alert2.setTitle("Error");
                    alert2.showAndWait(); 
                }
                // This validation is used to ensure that only the values provided on the
                // screen are used in the input.
                else if( digits.contains(String.valueOf(value1)) == false ||digits.contains(String.valueOf(value2)) == false ||
                        digits.contains(String.valueOf(value3)) == false || digits.contains(String.valueOf(value4)) == false){
                    flag = false;
                    alert3.showAndWait();
                }
                // If everything passes through the validation then "flag" remains true
                else if(flag = true){
                    
                    // Using a ScriptEnginer to evaluate the userinput
                    // using JavaScript.
                    ScriptEngineManager mgr = new ScriptEngineManager();
                    ScriptEngine engine = mgr.getEngineByName("JavaScript");
                    
                    answerDisplay.setText((String.valueOf(engine.eval(str_e))));
                    
                    // Answer grabs the value from the answerDisplay 
                    //which would show the user the answer to their expression. 
                    answer = Float.parseFloat(answerDisplay.getText());
                    if( answer == 24 ){
                    
                        logAction("WON THE GAME");
                        String totalT = timer111.getText();
                        // Send an alert box to tell the user they won
                        Alert alert4 = new Alert(AlertType.CONFIRMATION,"Do you want to play again?");
                        alert4.setHeaderText("CORRECT! It took you " + totalT);
                        alert4.showAndWait().ifPresent(response -> {
                            if (response == ButtonType.OK) {
                                try {
                                    // Resets the game
                                    checkAnswer.clear();
                                    showRandomCard();
                                    answerDisplay.clear();
  
                                    // Resets the time
                                    
                                    timer111.clear();
                                    seconds = 0;
                                    minutes = 0;
                                    hours = 0;
                                    
                                    logAction("generated a new game");
                                } catch (FileNotFoundException ex) {
                                    Logger.getLogger(ProjectLayoutController.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                        });
                    }
                    else if ( answer != 24){
                        logAction("User input incorrect");
                        // Tells the user that they are wrong
                        Alert alert5 = new Alert(AlertType.ERROR, "WRONG, NOT EQUAL TO 24");
                        alert5.setHeaderText("WRONG");
                        alert5.showAndWait();  
                    }
                }
                
            break;


        }
    }
    /**
     * quitProgram ,this method quits the application using a button. It displays an alert box
     * to confirm quitting the application
     * @param event When the quit button is pressed.
     */
    @FXML
    public void quitProgram(ActionEvent event) {
        
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
    
    /**
     * This method writes user actions to a log file, complete with a timestamp
     * @param event - whenever a user action is done, via button press or text input
     */
    public void logAction(String event){
        
        String timeStamp = new SimpleDateFormat("MM/dd/yyyy, HH:mm:ss").format(new Date());
        try{
        f = new File("log.txt");
        FileWriter writer = new FileWriter(f, true);
        pw = new PrintWriter(writer);
        pw.println(timeStamp + "  ----> User " + event + ".");
        }catch(IOException e){
            System.out.println("File does not exist");
        }
        if( pw !=null){
            pw.close();
        }
    }
    /**
     * the endTime method resets the clock to 0.
     * @param event tmeBtn2
     * @throws InterruptedException handled by default exception handler 
     */
    @FXML
    public void endTime(ActionEvent event) throws InterruptedException {
        timeBtn2 = (Button)event.getSource();
        
        switch( timeBtn2.getText()){
            
            case "Reset Timer":
                
                timer111.clear();
                seconds = 0;
                minutes = 0;
                hours = 0;
                break;
        }
        logAction("reset timer");
    }
    
    /**
     * Starts a new game timer upon Refresh or opening the application
     * @param event 
     */
    @FXML
    public void startTime(ActionEvent event) {
        timer1.schedule( new printTime(), 0, 1000);
        logAction("Started timer");
    }


}
