
package semesterproject;
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
    /**
     * Gets fileName string for card object
     * @return fileName
     */

    public String getFileName(){
        return this.fileName;
    }
    /**
     * Gets suit string of card object
     * @return suit
     */
        public String getSuit() {
        return suit;
    }  


    /**
     * Sets face of card object
     * @param cardFace 
     */
    public void setCardFace(String cardFace) {
            this.cardFace = cardFace;
      
    }
    /**
     * sets suit of card object
     * @param suit 
     */
    public void setSuit(String suit){
        this.suit = suit;
    }
    /**
     * Sets filename of card object
     * @param cardFace
     * @param suit 
     */
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
