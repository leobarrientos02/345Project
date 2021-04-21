/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semesterproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.scene.image.Image;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javafx.scene.image.ImageView;
/**
 *
 * @author gorda
 */
public class clockDigit extends ImageInterface {
    
     protected int number;
     private String fileName = "src/images/clock"+number+".png";
     
    

    
   
  

    public clockDigit(int number){
        setNumber(number);
        setFileName(number);
        image = new Image(fileName);
        
        ;
    }
   
    protected String getFileName(int number){
        return this.fileName;
    }
    protected int getNumber(){
        return this.number;
    }
    protected void setNumber(int number){
        this.number = number;
    }
    protected void setFileName(int number){
        this.fileName = "src/images/clock"+number+".png";
    }
    protected void displayImage(int number){
        setFileName(number);
        this.image= new Image(fileName);
        this.imageView = new ImageView(image);
    }
    
    @Override
    public String toString()
    {
        return String.format("%s digit's filename is %s", number,fileName);
    }

  
}

