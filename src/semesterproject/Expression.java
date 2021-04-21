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
public class Expression extends BasicMath {
       
    
    private int value1;
    private int value2;
    private int value3;
    private int value4;
    private String op1;
    private String op2;
    private String op3;
    
    
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
    
    // Default Constructor
    public Expression(){
        
        value1 = 0;
        value2= 0;
        value3=0;
        value4=0;
        op1 = " ";
        op2 = " ";
        op3 = " ";
    }
    
    //Constructor
    public Expression(int v1, int v2, int v3, int v4){
            
        value1 = v1;
        value2 = v2;
        value3 = v3;
        value4 = v4;
        
    }
    
    public String PrintExpression(){
        
        
        String Expression = String.valueOf(value1)+ op1 + String.valueOf(value2) + op2 +
                String.valueOf(value3) + op3 + String.valueOf(value4);
        return Expression;
    }
}
