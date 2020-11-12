package com.go2it.edu;
import javax.script.*;
public class Calculator {
    public static void main(String[] args) throws ScriptException {
        ScriptEngineManager factory = new ScriptEngineManager(); // create a script engine manager
        ScriptEngine engine = factory.getEngineByName ("nashorn"); // create a Nashorn script engine
        System.out.println(engine.eval(args[0]));
    }
}
