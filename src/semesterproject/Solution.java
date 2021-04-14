/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semesterproject;
import java.util.Arrays;
import javax.script.ScriptEngineManager;

/**
 *
 * @author gorda
 */
public class Solution {
    ScriptEngineManager factory = new ScriptEngineManager();
    ScriptEngine engine = factory.getEngineByName("JavaScript");
    
    Object res = engine.eval(“11*3+8");
    System.out.println( res );
}
