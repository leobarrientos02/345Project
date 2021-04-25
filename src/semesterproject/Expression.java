/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semesterproject;


/**
 * Expression extends BasicMath and is meant to 
 * store the expression for the ScriptEngine to analyze
 * @author Adam Gordon, Leonel Barrientos, 
 */
public class Expression extends BasicMath {
       
    
    private int value1;
    private int value2;
    private int value3;
    private int value4;
    private String op1;
    private String op2;
    private String op3;
    
    /**
     * retrieves a value
     * @return 1 value
     */
    public int getValue1(){
        return value1;
    }
    /**
     * sets a value
     * @param value number to be evaluated 
     */
    public void setValue1(int value){
        value1 = value;
    }
    /**
     * retrieves value 2
     * @return value 2
     */
    public int getValue2(){
        return value2;
    }
    /**
     * Sets value 2
     * @param value -  value 2 to be evaluated 
     */
    public void setValue2(int value){
        value2 = value;
    } 
    /**
     * retrieves value 3
     * @return 3rd value
     */
    public int getValue3(){
        return value3;
    }
    /**
     * sets value 3
     * @param value 3rd number to be evaluated 
     */
    public void setValue3(int value){
        value3 = value;
    }    
    /**
     * Sets value 4
     * @param value  value 4 in expression to  be evaluated
     */
    public void setValue4(int value){
        value4 = value;
    }    
    /**
     * retrieves value 4
     * @return value 4
     */
    public int getValue4(){
        return value4;
    }
    /**
     * Retrieves first operand in string version
     * @return string representation of operand 1
     */
    public String getOp1(){
        return op1;
    }
    /**
     * Retrieves second operand in string version
     * @return string representation of operand 2
     */
    public String getOp2(){
        return op2;
    }
    /**
     * Retrieves third operand in string version
     * @return string representation of operand 3
     */
    public String getOp3(){
        return op3;
    }
   /**
    * Sets 1st operand 
    * @param c 1st operand
    */
    public void setOp1(String c){
        op1 = c;
    }
    /**
     * Sets  operand 2
     * @param c  operand 2
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
     * Default constructor for Expression Object
     */
    public Expression(){
        
        value1 = 0;
        value2= 0;
        value3=0;
        value4=0;
        op1 = " ";
        op2 = " ";
        op3 = " ";
    }
    
    /**
     * Constructor for Expression with values input
     * @param v1 value 1
     * @param v2 value 2
     * @param v3 value 3
     * @param v4 value 4
     */
    public Expression(int v1, int v2, int v3, int v4){
            
        value1 = v1;
        value2 = v2;
        value3 = v3;
        value4 = v4;
        
    }
    /**
     * Returns String of the expression to be evaluated
     * @return String of expression
     */
    public String PrintExpression(){
        
        
        String Expression = String.valueOf(value1)+ op1 + String.valueOf(value2) + op2 +
                String.valueOf(value3) + op3 + String.valueOf(value4);
        return Expression;
    }
    /**
     * Overrides toString method of BasicMath class
     * @return String format of expression class
     */
    @Override
    
    public String toString(){
        
      return String.format("From the Expression Class %s %s %s %s %s %s %s",value1,op1,value2,op2,value3,op3,value4);
    }
}
