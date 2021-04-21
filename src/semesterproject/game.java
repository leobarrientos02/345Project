/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semesterproject;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 *
 * @author leoba
 */
public class game extends BasicMath {
   
    private String op1, op2, op3;
    private float num1, num2, num3, num4;
    private int c1,c2,c3,c4;
    
    public String removeSpaces(String str){
        String str2 = str;
        return str2.replaceAll(" ", "");
    }
    
    public int operand(String str){
        int temp = 0;
        if(str.contains("+")){
            temp =1;
        }
        else if(str.contains("-")){
            temp =2;
        }
        else if(str.contains("*")){
            temp =3;
        }
        else if(str.contains("/")){
            temp =4;
        }
        else if(str.contains("(")){
            temp =5;
        }
        else if(str.contains(")")){
            temp =6;
        }
        else{
            temp=0;
        }
        return temp;
    }
    
    public List<String> findDigit(String str){
             
        str = str.replaceAll("[^0-9]+", " ");
        return Arrays.asList(str.trim().split(" "));
    }
    

}
