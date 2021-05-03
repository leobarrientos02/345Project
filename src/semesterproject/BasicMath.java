
package semesterproject;

/**
 * The BasicMath class represents a simple Math equation,
 * using 2 numbers and an operation.
 * @author Adam Gordon,Leonel Barrientos, Bryan Gonzalez
 */
public class BasicMath {
    
    protected int value1;
    protected int value2;
    protected String operation;
    /**
     * Sets 1 value of object
     * @param value1 value of number
     */
    public void setValue1(int value1){
       this.value1 = value1;
    }
    /**
     *  Sets 1 value of object
     * @param value2 value of number
     */
    public void setValue2(int value2){
        this.value2 = value2;
    }
    /**
     * Sets operation for object
     * @param o operand to be used
     */
    public void setOperation(String o){
        this.operation =  o;
    }
    /**
     * Gets value of "a" for object
     * @return float a
     */
    public int getValue1(){
        return this.value1;
    }
    /**
     * Gets value of "b" for object
     * @return b
     */
    public int getValue2(){
        return this.value2;
    }
    /**
     * Gets operation of this object
     * @return + - * /
     */
    public String getOp1(){
        return operation;
    }
    
    /**
     * Default Constructor
     */
    public BasicMath(){
        this.value1= 0;
        this.value2 = 0;
        this.operation = " ";
    }
    
    /**
     * Overloaded constructor
     * @param value1 -value1
     * @param value2 - value2
     * @param o - operation to be performed
     */
    public BasicMath(int value1, int value2, String o){
        this.value1 = value1;
        this.value2 = value2;
        this.operation = o;
    }
    /**
     * This method takes 2 numbers and performs simple arithmetic
     * @param a - value 1
     * @param b - value 2
     * @param c - operation to be performed
     * @return - result of operation performed on 2 values
     */
    public float applyOperator(int a, int b, char c) {
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
     * @return  String value of math operation
     */
    public String printExpression(){
        
       String Expression = String.valueOf(value1)+ operation + String.valueOf(value2);
        return Expression;
    }
    /**
     * This method overrides the object toString method 
     * @return String expression of basic math
     */
    @Override
    public String toString(){
        return String.format("From the BasicMath Class : %s "+"%s"+"%s is the expression.",value1,operation,value2);
    }
} 
