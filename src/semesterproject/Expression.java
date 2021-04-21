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
    private char op1;
    private char op2;
    private char op3;
    
    private char stack[];
    private int top;
    
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
    public void setOp1(char c){
        op1 = c;
    }
    public char getOp1(){
        return op1;
    }
    public char getOp2(){
        return op2;
    }
    public char getOp3(){
        return op3;
    }
    public void setOp2(char c){
        op2 = c;
    }
    public void setOp3(char c){
        op3 = c;
    }    
    
    // Default Constructor
    public Expression(){
        
        value1 = 0;
        value2= 0;
        value3=0;
        value4=0;
        op1 = ' ';
        op2 = ' ';
        op3 = ' ';
    }
    
    //Constructor
    public Expression(int v1, int v2, int v3, int v4){
            
        value1 = v1;
        value2 = v2;
        value3 = v3;
        value4 = v4;
        
    }
    
    public String PrintExpression(){
        
        String Expression = String.valueOf(value1)+ "," + String.valueOf(value2) + ", " +
                String.valueOf(value3) + ", " + String.valueOf(value4);
        return Expression;
    }
    
    public char[] clean(String userInput){
        
        // FIRST CLEAN THE INPUT
        String str = userInput.strip();
        
        // LETS SEPERATE THE VALUES AND OPERATIONS
        char[] c = str.toCharArray();
        return c;
    }
    
    public int getOpIndex(char[]c){
        int opIndex;
        int temp=0;
        //GET FIRST OPERATION
        for(int i = 0;i < c.length;i++){
            if(c[i] == '+'){
                opIndex=i;
                temp = opIndex;
            }
            else if(c[i] == '-'){
                opIndex=i;
                temp = opIndex;
            }
            else if(c[i] == '/'){
                opIndex=i;
                temp = opIndex;
            }
            else if(c[i] == '*'){
                opIndex=i;
                temp = opIndex;
            }
            
        }    
        return temp;
    }
    
    public char getOp(char[]c){
        
        char temp = ' ';
        //GET FIRST OPERATION
        for(int i = 0;i < c.length;i++){
            if(c[i] == '+'){
                temp = '+';
            }
            else if(c[i] == '-'){
                temp = '-';
            }
            else if(c[i] == '/'){
                temp = '/';
            }
            else if(c[i] == '*'){
                temp = '*';
            }
        }        
        
        return temp;
    }
    
    public int getParenthesis(char[] c){
        int temp = 0;
        //GET FIRST OPERATION
        for(int i = 0;i < c.length;i++){
            if(c[i] == '('){
                temp = i;
            }
            if(c[i] == ')'){
                temp = i;
            }
        }   
        return temp;
    }
    
    public char Stripper(String userInput){
        String s = userInput;
        char op= ' ';
        if( s.contains("+")){
            op = '+';
        }
        
        if( s.contains("-")){
            op = '-';
        }
        if( s.contains("/")){
            op = '/';
        }
        if( s.contains("*")){
            
        }   
        if(s.contains("x")){
            op = '*';
        }
        if( s.contains("X")){
            op = '*';
        }
        
        return op;
    }
    
            
    public float calc(String userInput){
        float solution=0;
        char[] c = clean(userInput);
        Expression e = new Expression();
        String s = userInput.trim();
        //String s = g.replaceAll(" ", "0");
        //char d = e.Stripper(userInput);
        //GET FIRST OPERATION
        e.setOp1(getOp(c));
        int index1 = getOpIndex(c);
        
        e.setOp2(getOp(c));
        int index2 = getOpIndex(c);
       
        e.setOp3(getOp(c));
        int index3 = getOpIndex(c);
        
        String temp;
        String temp2;
        
        // FIRST VALUE
        temp = s.substring(0, index1);
        e.setValue1(Integer.parseInt(temp));
        
        // REMOVE FROM STRING
        temp2 = s.substring(index1+1, s.length());
        e.setValue2(Integer.parseInt(temp2));
        
       // solution = e.applyOperator(e.getValue1(), e.getValue2());
        
        
        // REMOVE FROM STRING
        //String temp3 = s.substring(index2+1, s.length());
                
        // solution = Float.parseFloat(e.print(e.getValue1(), e.getValue2(),e.getOp1()));
        return solution;   
    }
    
}
