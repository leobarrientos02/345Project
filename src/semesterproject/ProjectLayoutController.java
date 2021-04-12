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

    
    // Images
    private InputStream stream;
    private InputStream stream2;
    private InputStream stream3;
    private InputStream stream4;
    
    private Image image1;
    private Image image2;
    private Image image3;
    private Image image4;
    private String fileName;
    private int value1, value2, value3, value4;
    
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
        try {
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
        int answer2 = rn2.nextInt(12) + 1;
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
                value = "jack";
                break;
            case 11:
                value = "queen";
                break;
            case 12:
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
            case 'j':
                temp=10;
                break;
            case 'q':
                temp=11;
                break;
            case 'k':
                temp=12;
                break;
            default:
                break;
        }
        
        return temp;
    }
    
    private void ShowRandomCard() throws FileNotFoundException{
        String file = Generate_RandomCard();
        stream = new FileInputStream("src/images/" + file);
        image1 = new Image(stream);
        
        value1 = getCardValue(fileName);
        
        String file2 = Generate_RandomCard();
        while(file.equals(file2)){
            file2 = Generate_RandomCard();
        }
        if( !file.equals(file2)){
            stream2 = new FileInputStream("src/images/"+ file2);
            image2 = new Image(stream2);           
        }
        value2 = getCardValue(fileName);
        
        
        String file3 = Generate_RandomCard();
        while(file3.equals(file2) || file3.equals(file)){
            file3 = Generate_RandomCard();
        }
        if(!file3.equals(file2) || !file3.equals(file)){
            stream3 = new FileInputStream("src/images/" + file3);
            image3 = new Image(stream3);            
        }
        value3 = getCardValue(fileName);     
        
        String file4 = Generate_RandomCard();
        while(file4.equals(file3) || file4.equals(file3) || file4.equals(2)){
            file4=Generate_RandomCard();
        }
        if(!file4.equals(file3) || !file4.equals(file3) || !file4.equals(2)){
            stream4 = new FileInputStream("src/images/" + file4);
            image4 = new Image(stream4);
        }
        value4 = getCardValue(fileName);
        
        int answer = value1 + value2 + value3 + value4;
        answerDisplay.setText(String.valueOf(answer));
        
        
        // Create the image view
        Card1.setImage(image1);
        Card11.setImage(image2);
        Card111.setImage(image3);
        Card1111.setImage(image4);
    }

    @FXML
    private void displaySolution(ActionEvent event) {
        cheatkey = (Button)event.getSource();
        
        switch( cheatkey.getText()){
            case "Get Answer":

                break;
        }
    }

    @FXML
    private void generateNewGame() throws FileNotFoundException{
        
            ShowRandomCard();   
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
