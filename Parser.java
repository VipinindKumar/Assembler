/** Take an instruction and return its binary code
 * 
 * Initializes with an instruction 
 * identify the instruction A/C instruction
 * break it down and convert each field to its binary
 * return a complete binary of the input instruction
 **/
 
public class Parser {
    public String instruction;
    public Symbol st = new Symbol();
    public Code code = new Code();
    
    // Initializes with an instruction 
    public Parser(String inst) {
        this.instruction = inst.replaceAll(" ", "");
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
        if (instruction[0] == "@") {
            // then its an A-instruction
            
        }
        else if (instruction[0] == "(") {
            // Label
        }
        else {
            // C-instruction
        }
    }
    
    // return the A-instruction's part to be converted
    // convert symbols into corresponding number
    // boolean a = ainst.chars().allMatch(Character::isLetter);
    public String aInstruction() {
        String a;
        String ainst = instruction.split("@")[0];
        
        // if it is a Symbol
        if (ainst.chars().allMatch(Character::isLetter)) {
            ainst = Symbol.read(ainst);
        }
        
        return code.aInstruction(ainst);
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