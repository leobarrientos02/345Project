/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semesterproject;


import javafx.scene.image.Image;
import java.util.Arrays;
import java.util.List;

/**
 * Card class - This class will represent a playing card by suit,
 * face, and value, and also generate an image for display.
 * 
 * @author Adam Gordon, Leonel Barrientos, Bryan Gonzalez
 */
public class Card {
    
    private String cardFace, suit;
    private String fileName;
   
   /**
    * Default Constructor for Card class
    */
    public Card() {
        cardFace = " ";
        suit = " ";
        fileName = cardFace + "_of_"+suit+".png";
        
    }
    /**
     * This method gets face representative of a playing card for the Card class
     * @return cardFace "2","3","4","5","6","7","8","9","10","jack","queen","king","ace"
     */
    public String getCardFace() {
        return cardFace;
    }


    public String getFileName(){
        return this.fileName;
    }
        public String getSuit() {
        return suit;
    }  


    /**
     * 
     */
    public void setCardFace(String cardFace) {
            this.cardFace = cardFace;
      
    }
    /**
     * Returns suit of a card object
     * @return  spades, hearts, clubs, diamonds
     */

    public void setSuit(String suit){
        this.suit = suit;
    }
    public void setFileName(String cardFace,String suit){
        this.fileName= cardFace + "_of_"+suit+".png";
    }
    /**
     * Overrides toString method of object class, 
     * @return String representation of a Card object
     */
    @Override
    public String toString()
    {
        return String.format("This card is %s of %s.", cardFace, suit);
    }
}
