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
        File infile = new File(args[0]);
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		// in a loop read an instruction
		String inst;
		while((inst = br.readLine()) != null) {
		    
		}
    }
}