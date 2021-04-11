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
 * face, and value
 * @author Adam Gordon
 */
public class Card {
    private String cardFace, suit;
    private Image image;
    protected Integer value;
 // constructor
    public Card() {
        setCardFace(cardFace);
        setSuit(suit);
        String fileName = cardFace + "_of_"+suit+".png";
        image = new Image("./images/"+fileName);
    }

    public String getCardFace() {
        return cardFace;
    }

    /**
     * This method will validate that the card images are correct and will
     * have the correct value when instantiating the argument
     * 
     * @return 2,3,4,5,6,7,8,9,10,jack,queen,king,ace
     */
    public static List<String> getValidCardFaces()
    {
        return Arrays.asList("2","3","4","5","6","7","8","9","10","jack",
                            "queen","king","ace");
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    /**
     * Method to set card object to correct value, throws exception if
     * 
     * @param cardFace 2,3,4,5,6,7,8,9,10,jack,queen,king
     */
    public void setCardFace(String cardFace) {
        List<String> validCardFaces = getValidCardFaces();
        cardFace = cardFace.toLowerCase();

        if (validCardFaces.contains(cardFace))
            this.cardFace = cardFace;
        else
            throw new IllegalArgumentException("Valid face names are: "+
                            validCardFaces);
    }
    public void setCardValue(int value){
        this.value = value;
    }
    public int getCardValue(){
        return this.value;
    }
    public String getSuit() {
        return suit;
    }

    /**
     * This method will return a list of valid suits
     * @return spades, hearts, clubs, diamonds
     */
    public static List<String> getValidSuits()
    {
        return Arrays.asList("hearts","diamonds","spades","clubs");
    }

    public void setSuit(String suit) {
        List<String> validSuits = getValidSuits();
        suit = suit.toLowerCase();

        if (validSuits.contains(suit))
            this.suit = suit;
        else
            throw new IllegalArgumentException("valid suits are: "+ validSuits);
    }

    public String toString()
    {
        return String.format("%s of %s, value is %s", cardFace, suit,value);
    }
}
