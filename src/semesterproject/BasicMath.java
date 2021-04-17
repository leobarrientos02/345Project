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
public class BasicMath {
    
    private float a;
    private float b;
    private String operation;
    
    public void setA( float v){
        a = v;
    }
    
    public void setB( float v){
        b = v;
    }
    
    public void setOperation(String o){
        operation =  o;
    }
    
    public float getA(){
        return a;
    }
    public float getB(){
        return b;
    }
    public String getO(){
        return operation;
    }
    
    // DEFAULT CONSTRUCTOR
    public BasicMath(){
        a= 0;
        b = 0;
        operation = " ";
    }
    
    //CONSTRUCTOR
    public BasicMath(float v1, float v2, String o){
        a = v1;
        b = v2;
        operation = o;
    }
    
    public float applyOperator(float a, float b, char c) {
        switch (c) {
            case '+':
                return a + b;
            case '-':
                return b - a;
            case '*':
                return a * b;
            case '/':
                return b / a;
            default:
                return Float.NaN;
        }
    }
    
    public String print(int v1, int v2, char c){
        
        float answer = applyOperator(v1,v2,c);
        
        return String.valueOf(answer);
    }
    
} 
