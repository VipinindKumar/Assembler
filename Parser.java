/** Take an instruction and return its binary code
 * 
 * Initializes with an instruction 
 * identify the instruction A/C instruction
 * break it down and convert each field to its binary
 * return a complete binary of the input instruction
 **/
 
public class Parser {
    public String instruction;
    
    // Initializes with an instruction 
    public Parser(String inst) {
        this.instruction = inst;
    }
    
    // check if it's an instruction(not white space or comment)
    public boolean isInstruction() {
        if (instruction == null || instruction.isEmpty())
            return false;
        else if (instruction[0] == "/" && instruction[1] == "/")
            return false;
        else 
            return true;
    }
    
    // convert the instruction into it's corresponding binary code
    public String binary() {
        
    }
    
    // return the A-instruction's part to be converted
    // convert symbols into corresponding number
    // boolean a = ainst.chars().allMatch(Character::isLetter);
    public String aInstruction() {
        
    }
    
    // return comp field
    public String comp() {
        
    }
    
    // return dest field
    public String dest() {
        
    }
    
    // return jump field
    public String jump() {
        
    }
}