/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semesterproject;

import javafx.scene.image.Image;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.scene.image.ImageView;
/**
 *
 * @author gorda
 */
public abstract class ImageInterface {
    
    public String fileName;
    public Image image;
    public ImageView imageView;
    public FileInputStream stream;

    public String getFileName(){
        return this.fileName;
    }
    
       public Image getImage(){
         return this.image;
     }
    
     public void setFileName(String fileName){
        this.fileName = fileName;
     }
     public void setImage(String fileName){
         this.image = image;
     }
  
}
