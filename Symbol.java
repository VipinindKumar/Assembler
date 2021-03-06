/** Manage all the symbols in a symbol table
 * 
 * -first add all the pre-defined symbols into 
 *  a symbol table
 * -method add() use to add more symbols into the table
 * -method read() to check the value for a particular key
 * 
 * Symbol class makes a symbol table filled with predefined symbols 
 * of the assembly language. and 
 * provides methods to add a variable and Label(with next instruction number)
 * and read(String) method to read from symbol table
 **/
 import java.util.*;
 
public class Symbol {
    public HashMap<String, String> s = new HashMap<String, String>();
    private int n = 16;
    
    public Symbol() {
        s.put("SP",         "0");
        s.put("LCL",        "1");
        s.put("ARG",        "2");
        s.put("THIS",       "3");
        s.put("THAT",       "4");
        s.put("R0",         "0");
        s.put("R1",         "1");
        s.put("R2",         "2");
        s.put("R3",         "3");
        s.put("R4",         "4");
        s.put("R5",         "5");
        s.put("R6",         "6");
        s.put("R7",         "7");
        s.put("R8",         "8");
        s.put("R9",         "9");
        s.put("R10",       "10");
        s.put("R11",       "11");
        s.put("R12",       "12");
        s.put("R13",       "13");
        s.put("R14",       "14");
        s.put("R15",       "15");
        s.put("SCREEN", "16384");
        s.put("KBD",    "24576");
    }
    
    // add variable to symbol tabel
    public void addvar(String var) {
        s.put(var, String.valueOf(n));
        n++;
    }
    
    // add the label, 
    // @param label name and next instruction number (when in memory)
    public void addLabel(String label, int nextInst) {
        s.put(label, String.valueOf(nextInst));
    }
    
    // translate a symbol into memory address
    // if symbol is not present add it and 
    // then return memory address
    public String read(String symb) {
        String sym = s.get(symb);
        if (sym == null) {
            addvar(symb);
            sym = s.get(symb);
        }
        return sym;
    }
}