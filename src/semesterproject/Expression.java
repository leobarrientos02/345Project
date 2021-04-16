/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semesterproject;


/**
 *
 * @author leoba
 */
public class Expression {
       
    
    private int value1;
    private int value2;
    private int value3;
    private int value4;
    
    public int getValue1(){
        return value1;
    }
    public void setValue1(int value){
        value1 = value;
    }
    
    public int getValue2(){
        return value2;
    }
    public void setValue2(int value){
        value2 = value;
    } 
    
    public int getValue3(){
        return value3;
    }
    public void setValue3(int value){
        value3 = value;
    }    

    public void setValue4(int value){
        value4 = value;
    }    
    public int getValue4(){
        return value4;
    }
    
    // Default Constructor
    public Expression(){
        
        value1 = 0;
        value2= 0;
        value3=0;
        value4=0;
    }
    
    //Constructor
    public Expression(int v1, int v2, int v3, int v4){
        
        
        value1 = v1;
        value2 = v2;
        value3 = v3;
        value4 = v4;
        
    }
    
    public String PrintExpression(String userInput){
        
        String Expression = String.valueOf(value1)+ "," + String.valueOf(value2) + ", " +
                String.valueOf(value3) + ", " + String.valueOf(value4);
        return Expression;
    }
        
    
}
