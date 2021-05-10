package semesterproject;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Eatingplatano
 */
public class CardTest {
    
    public CardTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of getCardFace method, of class Card.
     */
    @Test
    public void testGetCardFace() {
        System.out.println("getCardFace");
        Card instance = new Card();
        String expResult = " ";
        String result = instance.getCardFace();
        assertEquals(expResult, result);
    }

    /**
     * Test of getFileName method, of class Card.
     */
    @Test
    public void testGetFileName() {
        System.out.println("getFileName");
        Card instance = new Card();
        String expResult = instance.getCardFace()+ "_of_"+instance.getSuit()+".png";
        String result = instance.getFileName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSuit method, of class Card.
     */
    @Test
    public void testGetSuit() {
        System.out.println("getSuit");
        Card instance = new Card();
        String expResult = " ";
        String result = instance.getSuit();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCardFace method, of class Card.
     */
    @Test
    public void testSetCardFace() {
        System.out.println("setCardFace");
        String cardFace = " ";
        Card instance = new Card();
        instance.setCardFace(cardFace);
    }

    /**
     * Test of setSuit method, of class Card.
     */
    @Test
    public void testSetSuit() {
        System.out.println("setSuit");
        String suit = " ";
        Card instance = new Card();
        instance.setSuit(suit);
    }

    /**
     * Test of setFileName method, of class Card.
     */
    @Test
    public void testSetFileName() {
        System.out.println("setFileName");
        String cardFace = " ";
        String suit = " ";
        Card instance = new Card();
        instance.setFileName(cardFace, suit);
    }

    
}