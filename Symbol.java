/** Manage all the symbols in a symbol table
 * 
 * -first add all the pre-defined symbols into 
 *  a symbol table
 * -methd add() use to add more symbols into the table
 * -method to check the value for a particular key
 * 
 **/
 
public class Symbol {
    public Map s = new HashMap();
    
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
}