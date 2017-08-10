/** Translate differetn instruction fields into binary code
 * 
 * different methods invoked with the part of instruction
 * as arguments and returns the correspoinding binary code
 * for that field
 * 
 * 
 * Code(): creates table with predeined conversions for comp, dest and jump
 * 
 * Can get corresponding binary value for different part of instructions
 * using comp(String), dest(String), jump(String) and aInstruction(String)
 * with there corresponding part from an assembly language instruction
 **/
 import java.util.HashMap;
 
public class Code {
    public Map c = new HashMap();
    public Map d = new HashMap();
    public Map j = new HashMap();
    
    public Code() {
        // comp table
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
        d.put("M",   "001");
        d.put("D",   "010");
        d.put("MD",  "011");
        d.put("A",   "100");
        d.put("AM",  "101");
        d.put("AD",  "110");
        d.put("AMD", "111");
        
        // jump table
        j.put("JGT", "001");
        j.put("JEQ", "010");
        j.put("JGE", "011");
        j.put("JLT", "100");
        j.put("JNE", "101");
        j.put("JLE", "110");
        j.put("JMP", "111");
    }
    
    /** comp cannot be null here, if it is
     * then that means instruction parsing
     * is not correct
     */
    public String comp(String comp) {
        if (comp == null) throw NullPointerException();
        return c.get(comp);
    }
    
    /** If either of dest and jump is null
     * it returns "000" 
     */
    public String dest(String dest) {
        if (dest == null) return "000"
        return d.get(dest);
    }
    
    public String jump(String jump) {
        if (jump == null) return "000"
        return j.get(jump);
    }
    
    /** just return
     * binary of the decimal number
     */
    public String aInstruction(String ainst) {
        return intToBinary(Integer.parseInt(ainst));
    }
    
    // Convert an int to its 15bit binary form
    private String intToBinary (int n) {
        String binary = "";
        for(int i = 0; i < 15; i++, n/=2) {
          switch (n % 2) {
             case 0:
                binary = "0" + binary;
                break;
             case 1:
                binary = "1" + binary;
                break;
            }
        }
        return binary;
    }
}