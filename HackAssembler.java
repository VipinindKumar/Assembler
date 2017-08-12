/** An Assembler for the Hack computer(16bit computer for Nand2Tetris course).
 * 
 * Handle I/O files,
 * Open the file provided in arguments
 * read a instruction
 * convert it into binary code
 * write the binary code in the output file
 **/
import java.io.*;

public class HackAssembler {
    public static Symbol st = new Symbol();
    
    // read the file and
    // in a loop read a instruction
    // convert it into binary
    // write it into output file
    public static void main(String[] args) {
		
        // in a loop read an instruction
        String inst;
        
        try {
            // first pass to record all the Labels in Symbol table
            BufferedReader in1 = new BufferedReader(new FileReader(new File(args[0])));
            // integer for keeping count of no. of instructions
            int n = 0;
            while ((inst = in1.readLine()) != null) {
                Parser parser = new Parser(inst, st);
                if (parser.isInstruction()) {
                    n++;
                    if (parser.isLabel()) {
                        st.addLabel(parser.label(), n);
                    }
                }
            }
            in1.close();
        }
        catch (IOException e){
            System.out.println(e);
        }
        
        
        try {
            // second pass to actually convert the assembly code to machine code
            // read the file
            BufferedReader in = new BufferedReader(new FileReader(new File(args[0])));
            
            // write it into output file
            String outfile = args[0].replace("asm", "hack");
            BufferedWriter out = new BufferedWriter(new FileWriter(new File(outfile)));
            
            // read the instructions
            while ((inst = in.readLine()) != null) {
                Parser parser = new Parser(inst, st);
                if (parser.isInstruction()) {
                    // convert it into binary
                    inst = parser.binary();
                    // write it into output file
                    out.write(inst);
                    out.newLine();
                }
            }
            in.close();
            out.close();
        }
        catch (IOException e){
            System.out.println(e);
        }
        
    }
}