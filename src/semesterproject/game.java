/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semesterproject;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author leoba
 */
public class game extends BasicMath {
   
    private String op1, op2, op3;
    private float num1, num2, num3, num4;
    
    public float getNum1(){
        return num1;
    }
    public void setNum1(float Num){
        num1 = Num;
    }
    
    public float getNum2(){
        return num2;
    }
    public void setNum2(float Num){
        num2 = Num;
    } 
    
    public float getNum3(){
        return num3;
    }
    public void setNum3(float Num){
        num3 = Num;
    }    

    public void setNum4(float Num){
        num4 = Num;
    }    
    public float getNum4(){
        return num4;
    }
 
    public String getOp1(){
        return op1;
    }
    
    public String getOp2(){
        return op2;
    }
    
    public String getOp3(){
        return op3;
    }
    
    public void setOp1(String c){
        op1 = c;
    }
    
    public void setOp2(String c){
        op2 = c;
    }
    
    public void setOp3(String c){
        op3 = c;
    }    
    
    public String removeSpaces(String str){
        String str2 = str;
        return str2.replaceAll(" ", "");
    }
    
    
    public boolean isNumber(String str){
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i)) == false){
                return false;
            }
        }
        return true;
    }
    
    public List<String> findDigit(String str){
             
        str = str.replaceAll("[^0-9]+", " ");
        return Arrays.asList(str.trim().split(" "));
    }
    

}
