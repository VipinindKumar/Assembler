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
    public Parser(String inst, Symbol !!!) {
        // saves the instruction without any white spaces
        this.instruction = inst.replaceAll(" ", "");
        !!!
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
    
    // check if the instruction is a Label
    public boolean isLabel() {
        if (instruction[0] == "(") {
            return true;
        }
        return false;
    }
    
    // returns label from the instruction
    public String label(){
        lbl = instruction.split("(")[0];
        lbl = lbl.split(")")[0];
        return lbl;
    }
    
    
    // +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    // convert the instruction into it's corresponding binary code
    public String binary() {
        if (instruction[0] == "@") {
            // then its an A-instruction
            return aInstruction();
        }
        else {
            // C-instruction
        }
    }
    
    // return the A-instruction's part to be converted
    // convert symbols into corresponding number
    // boolean a = ainst.chars().allMatch(Character::isLetter);
    public String aInstruction() {
        String ainst = instruction.split("@")[0];
        
        // if it is a Symbol then get its address
        // checks if it is not all digits, if true convert the symbol
        if (!ainst.chars().allMatch(Character::isDigit)) {
            ainst = Symbol.read(ainst);
        }
        
        return code.aInstruction(ainst);
    }
    
    // return comp field
    // dest=comp;jump
    public String comp() {
        String co;
        if (instruction.contains("=")) {
            co = instruction.split("=")[1];
            if (co.contains(";") {
                co = co.split(";")[0];
            }
        }
        else if (instruction.contains(";")) {
            co = instruction.split(";")[0];
        }
        return code.comp(co);
    }
    
    // return dest field
    // dest=comp;jump
    public String dest() {
        if (instruction.contains("=")) {
            String de = instruction.split("=")[0];
            return code.dest(de);
        }
        return "000";
    }
    
    // return jump field
    // dest=comp;jump
    public String jump() {
        if (instruction.contains(";")) {
            String ju = instruction.split(";")[1];
            return code.jump(ju);
        }
        return "000";
    }
}