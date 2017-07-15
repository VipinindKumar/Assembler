/** Translate differetn instruction fields into binary code
 * 
 * different methods invoked with the part of instruction
 * as arguments and returns the correspoinding binary code
 * for that field
 * 
 **/
 import java.util.*;
 
public class Code {
    public Code() {
        // comp table
        Map c = new HashMap();
        c.put("0",   "0101010");
        c.put("1",   "0111111");
        c.put("-1",  "0111010");
        c.put("D",   "0001100");
        c.put("A",   "0110000");
        c.put("!D",  "0001101");
        c.put("!A",  "0110001");
        c.put("-D",  "0001111");
        c.put("-A",  "0110011");
        c.put("D+1", "0011111");
        c.put("A+1", "0110111");
        c.put("D-1", "0001110");
        c.put("A-1", "0110010");
        c.put("D+A", "0000010");
        c.put("D-A", "0010011");
        c.put("A-D", "0000111");
        c.put("D&A", "0000000");
        c.put("D|A", "0010101");
        c.put("M",   "1110000");
        c.put("!M",  "1110001");
        c.put("-M",  "1110011");
        c.put("M+1", "1110111");
        c.put("M-1", "1110010");
        c.put("D+M", "1000010");
        c.put("D-M", "1010011");
        c.put("M-D", "1000111");
        c.put("D&M", "1000000");
        c.put("D|M", "1010101");
        
        //dest table
        Map d = new HashMap();
        d.put("M",   "001");
        d.put("D",   "010");
        d.put("MD",  "011");
        d.put("A",   "100");
        d.put("AM",  "101");
        d.put("AD",  "110");
        d.put("AMD", "111");
        
        // jump table
        Map j = new HashMap();
        j.put("JGT", "001");
        j.put("JEQ", "010");
        j.put("JGE", "011");
        j.put("JLT", "100");
        j.put("JNE", "101");
        j.put("JLE", "110");
        j.put("JMP", "111");
    }
    
    public String comp(String comp) {
        
    }
    
    public String dest(String dest) {
        
    }
    
    public String jump(String jump) {
        
    }
    
    public String aInstruction(String ainst) {
        
    }
}