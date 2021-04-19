/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semesterproject;

/**
 *
 * @author gorda
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javafx.scene.image.Image;

public class FullDeckOfCards extends Card{
   private ArrayList<Card> deck;
   private Image backOfCardImage;

    //1. define the class
    //2. define the instance variables
    //3. create Constructor - this will define the object in the system
    //4. create get/set methods
    //5. create any custom methods


    /**
     * This is a 1 argument constructor that passes in a collection
     * of Card objects
     * @param deck
     */
   public FullDeckOfCards(ArrayList<Card> deck) {
        this.deck = deck;
        
    }

    /**
     * This constructor builds the deck
     */
    public FullDeckOfCards()
    {
        List<String> suits = Card.getValidSuits(); 
        List<String> faceNames = Card.getValidCardFaces();

        deck = new ArrayList<>();

        for (String suit:suits)
        {
            for (String faceName:faceNames)
                deck.add(new Card(/*faceName,suit,value*/));
        }
        
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    public void setDeck(ArrayList<Card> deck) {
        this.deck = deck;
    }

    public Image getBackOfCardImage() {
        return backOfCardImage;
    }

    public void setBackOfCardImage(Image backOfCardImage) {
        this.backOfCardImage = backOfCardImage;
    }

    /**
     * This method will shuffle the deck of cards
     */
    public void shuffle()
    {
        Collections.shuffle(deck);
    } 
}
