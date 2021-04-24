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
 * @autho Adam Gordon, Leonel Barrientos, Bryan Gonzalez
 */
public class Card {
    
    private String cardFace, suit;
    private Image image;
    private int value;
   
    public Card() {
        setCardFace(cardFace);
        setSuit(suit);
        String fileName = cardFace + "_of_"+suit+".png";
        image = new Image("./images/"+fileName);
    }
    /**
     * This method gets face representative of a playing card for the Card class
     * @return cardFace "2","3","4","5","6","7","8","9","10","jack","queen","king","ace"
     */
    public String getCardFace() {
        return cardFace;
    }

    /**
     * This method validates the strings that are valid for
     * card representation.
     * 
     * @return 2,3,4,5,6,7,8,9,10,jack,queen,king,ace
     */
    public static List<String> getValidCardFaces()
    {
        return Arrays.asList("2","3","4","5","6","7","8","9","10","jack",
                            "queen","king","ace");
    }
    /**
     * Gets image of a card object
     * @return 
     */
    public Image getImage() {
        return this.image;
    }
    /**
     * Gets value of a card object
     * @return 1,2,3,4,5,6,7,8,9,10,11,12,13
     */
     public int getCardValue(){
        return this.value;
    }
    /**
     * Sets image for card object
     * @param image filename of the image for the object to be set
     */
    public void setImage(Image image) {
        this.image = image;
    }

    /**
     * This method sets the face to be used by the Card Object
     * to generate an image, using a list
     * @param cardFace 2,3,4,5,6,7,8,9,10,jack,queen,king,ace
     * @throws IllegalArgumentException
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
    /**
     * Returns suit of a card object
     * @return  spades, hearts, clubs, diamonds
     */
    public String getSuit() {
        return suit;
    }

    /**
     * Returns a list of valid suits of a card
     * 
     * @return spades, hearts, clubs, diamonds
     */
    public static List<String> getValidSuits()
    {
        return Arrays.asList("hearts","diamonds","spades","clubs");
    }
    /**
     * Sets suit of a card object
     * @param suit spades, hearts, clubs, diamonds
     * @throws IllegalArgumentException
     */
    public void setSuit(String suit) {
        List<String> validSuits = getValidSuits();
        suit = suit.toLowerCase();

        if (validSuits.contains(suit))
            this.suit = suit;
        else
            throw new IllegalArgumentException("valid suits are: "+ validSuits);
    }
    /**
     * Overrides toString method of object class, 
     * @return String representation of a Card object
     */
    @Override
    public String toString()
    {
        return String.format("This card is %s of %s, it's image is at %s", cardFace, suit,image);
    }
}
