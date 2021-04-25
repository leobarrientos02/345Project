/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semesterproject;

import java.util.Arrays;
import java.util.List;

/**
 * The game class extends feature of BasicMath and uses
 * it's method's to evaluate expressions to match game
 * solutions
 * @author Adam Gordon,Leonel Barrientos, Adam Gordon
 */
public class game extends BasicMath {
   
    private String op1, op2, op3;
    private float num1, num2, num3, num4;
    /**
     * gets first value
     * @return first value
     */
    
    public float getNum1(){
        return num1;
    }
    /**
     * sets first value
     * @param Num first value
     */
    public void setNum1(float Num){
        num1 = Num;
    }
    /**
     * Gets second value
     * @return 2nd value
     */
    
    public float getNum2(){
        return num2;
    }
    /**
     * Sets second Value
     * @param Num second Value
     */
    public void setNum2(float Num){
        num2 = Num;
    } 
    /**
     * gets 3rd value
     * @return 3rd value
     * 
     */
    public float getNum3(){
        return num3;
    }
    /**
     * sets 3rd value
     * @param Num 3rd value
     */
    public void setNum3(float Num){
        num3 = Num;
    }    
    /**
     * sets 4th value
     * @param Num 4th value
     */
    public void setNum4(float Num){
        num4 = Num;
    }    
    /**
     * gets 4th value
     * @return 4th value
     */
    public float getNum4(){
        return num4;
    }
    /**
     * returns first operand
     * @return first operand
     */
    public String getOp1(){
        return op1;
    }
    /**
     * returns second operand
     * @return second operand
     */
    public String getOp2(){
        return op2;
    }
    /**
     * returns 3rd operand
     * @return 3rd operand
     */
    public String getOp3(){
        return op3;
    }
    /**
     * sets 1st operand
     * @param c 1st operand
     */
    public void setOp1(String c){
        op1 = c;
    }
    /**
     * sets 2nd operand
     * @param c 2nd operand
     */
    public void setOp2(String c){
        op2 = c;
    }
    /**
     * sets 3rd operand
     * @param c 3rd operand
     */
    public void setOp3(String c){
        op3 = c;
    }    
    /**
     * This method removes white space from input
     * @param str String to remove white space
     * @return string with spaces removed
     */
    public String removeSpaces(String str){
        String str2 = str;
        return str2.replaceAll(" ", "");
    }
    
    /**
     * This method tests to see if a number matches up with another number
     * @param str string to evaluate
     * @return true,false 
     */
    public boolean isNumber(String str){
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i)) == false){
                return false;
            }
        }
        return true;
    }
    /**
     * This method looks through the strings and enters it into a List
     * @param str expression to perform method on
     * @return Array as list
     */
    public List<String> findDigit(String str){
             
        str = str.replaceAll("[^0-9]+", " ");
        return Arrays.asList(str.trim().split(" "));
    }
    /**
     * This method overrides the toString class in basic Math
     * @return String form of game solution
     */
    @Override
    public String toString(){
        return String.format("%s%s%s%s%s%s",num1,op1,num2,op2,num3,op3,num4);
    }

}
