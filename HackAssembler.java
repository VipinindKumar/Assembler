/** An Assembler for the Hack computer(16bit computer in Nand2Tetris course).
 * 
 * Handle I/O files,
 * Open the file provided in arguments
 * read a instruction
 * convert it into binary code
 * write the binary code in the output file
 **/

public class HackAssembler {
    // read the file and
    // in a loop read a instruction
    // convert it into binary
    // write it into output file
    public static void main(String[] args) {
        // read the file
        BufferedReader in = new BufferedReader(new FileReader(new File(args[0])));
		
        // write it into output file
        String outfile = args[0].split(".")[0] + ".hack";
        BufferedWriter out = new BufferedWriter(new FileWriter(new File(outfile)));
        
        // in a loop read an instruction
        String inst;
        // first pass to record all the Labels in Symbol table
        BufferedReader in1 = new BufferedReader(new FileReader(new File(args[0])));
        while ((inst = in1.readLine()) != null) {
            Parser parser = new Parser(inst);
            if (parser.isInstruction()) {
                // convert it into binary
                inst = parser.binary();
                // write it into output file
                out.write(inst);
                out.newLine();
            }
        }
        
        while ((inst = in.readLine()) != null) {
            Parser parser = new Parser(inst);
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
}