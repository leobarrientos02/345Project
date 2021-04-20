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
 *
 * @author gorda
 */
public class clockDigit {
    private String digit, fileName;
    private Image digiPic;
    private int number;
    
    public clockDigit(){
        setDigit(digit);
        setImage(digiPic);
        String fileName =   "clock"+number+".png";
    }
    public void setDigit(String digit){
        this.digit = digit;
    }
    public void setImage(Image image){
        this.digiPic = image;
    }
    public void setValue(int number){
        this.number = number;
    }
    public String getDigit(){
        return this.digit;
    }
    public Image getImage(){
        return this.digiPic;
    }
    public int getNumber(){
        return this.number = number;
       
    }
    public void setValidClockDigits(String digits) {
        List<String> validClockDigits = getValidClockDigits();
       

        if (validClockDigits.contains(digit))
            this.digit = digit;
        else
            throw new IllegalArgumentException("Valid Clock Digits are: "+
                            validClockDigits);
    }
    public static List<String> getValidClockDigits(){
        
    return Arrays.asList("0","1","2","3","4","5","6","7","8","9");
    }
    
    public String toString()
    {
        return String.format("%s is picture %s, value is %s", digit,digiPic,number);
    }
}

