/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semesterproject;

/**
 * The BasicMath class represents a simple Math equation,
 * using 2 numbers and an operation.
 * @author Adam Gordon,Leonel Barrientos, Bryan Gonzalez
 */
public class BasicMath {
    
    private float a;
    private float b;
    private String operation;
    /**
     * Sets 1 value of object
     * @param v value of number
     */
    public void setA( float v){
        a = v;
    }
    /**
     *  Sets 1 value of object
     * @param v value of number
     */
    public void setB( float v){
        b = v;
    }
    /**
     * Sets operation for object
     * @param o operand to be used
     */
    public void setOperation(String o){
        operation =  o;
    }
    /**
     * Gets value of "a" for object
     * @return float a
     */
    public float getA(){
        return a;
    }
    /**
     * Gets value of "b" for object
     * @return b
     */
    public float getB(){
        return b;
    }
    /**
     * Gets operation of this object
     * @return + - * /
     */
    public String getO(){
        return operation;
    }
    
    /**
     * Default Constructor
     */
    public BasicMath(){
        a= 0;
        b = 0;
        operation = " ";
    }
    
    /**
     * Overloaded constructor
     * @param v1 -value a
     * @param v2 - value b
     * @param o - operation to be performed
     */
    public BasicMath(float v1, float v2, String o){
        a = v1;
        b = v2;
        operation = o;
    }
    /**
     * This method takes 2 numbers and performs simple arithmetic
     * @param a - value 1
     * @param b - value 2
     * @param c - operation to be performed
     * @return - result of operation performed on 2 values
     */
    public float applyOperator(float a, float b, char c) {
        switch (c) {
            case '+':
                return a + b;
            case  '-':
                return b - a;
            case '*':
                return a * b;
            case '/':
                return b / a;
            default:
                return Float.NaN;
        }
    }
    /**
     * This method returns a string of the result of the operator
     * @param v1 -1st value
     * @param v2 -2nd value
     * @param c - operator
     * @return  String value of math operation
     */
    public String print(int v1, int v2, char c){
        
        float answer = applyOperator(v1,v2,c);
        
        return String.valueOf(answer);
    }
    /**
     * This method overrides the object toString method 
     * @return String expression of basic math
     */
    @Override
    public String toString(){
        return String.format("From the BasicMath Class : %s "+"%s"+"%s is the expression.",a,operation,b);
    }
} 
