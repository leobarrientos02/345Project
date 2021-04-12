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
public class Combinations {
    
    private String operation1;
    private String operation2;
    private String operation3;
    
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
    
    public void setOperation(String op){
        operation1 = op;
    }
    public String getOperation(){
        return operation1;
    }

    public void setOperation2(String op){
        operation2 = op;
    }
    public String getOperation2(){
        return operation2;
    }
    
    public void setOperation3(String op){
        operation3 = op;
    }
    public String getOperation3(){
        return operation3;
    }    
    
    // Default Constructor
    public Combinations(){
        
        value1 = 0;
        value2= 0;
        value3=0;
        value4=0;
        operation1 = "NONE";
        operation2="NONE";
        operation3="NONE";
    }
    
    //Constructor
    public Combinations(int v1, int v2, int v3, int v4, String op, String op2, String op3){
        
        
        value1 = v1;
        value2 = v2;
        value3 = v3;
        value4 = v4;
        operation1 = op;
        operation2 = op2;
        operation3 = op3;
        
    }
    
    
    public String PrintExpression(){
        
        String Expression;
        Expression = String.valueOf(value1)+operation1+String.valueOf(value2)+operation2
                +String.valueOf(value3)+operation3+String.valueOf(value4);
        return Expression;
    }
    
    
    
}
