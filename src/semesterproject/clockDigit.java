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
import java.util.List;
import javafx.scene.image.ImageView;
/**
 *
 * @author gorda
 */
public class clockDigit {
    private String fileName;
    protected File file;
    private int number;
    protected Image digital;
    

    
   
  

    public clockDigit(int number){
        setNumber(number);
        setFileName(number);
        ;
        
    }
    protected void setNumber(int number){
        this.number = number;
    }
    protected void setFileName(int number){
        this.fileName = "clock"+number+".png";
    }

    protected int getNumber(){
        return this.number;
    }
    protected String getFileName(){
        return this.fileName = fileName;
    }

    
    public String toString()
    {
        return String.format("%s is picture %s", number,fileName);
    }

  
}

