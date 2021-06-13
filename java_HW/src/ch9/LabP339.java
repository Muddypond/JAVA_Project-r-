package ch9;
import java.io.*;
import java.util.*;

public class LabP339 {
	public static void main(String[] args) throws Exception {
		// Check command-line parameter usage
		if (args.length != 3) {
			System.out.println(
					"Usage: java ch9.LabP339 sourceFile oldStr newStr");
			System.exit(0);
		}
		// Check if source file exists
		File sourceFile = new File(args[0]);
		if (!sourceFile.exists()) {
			System.out.println("Source file " + args[0] + " does not exist");
			System.exit(0);
		}



		// Create a Scanner for input 
		Scanner input = new Scanner(sourceFile);
        String s2="";
        while (input.hasNext()) {
            String s1 = input.nextLine();  
            s2 = s2+s1.replaceAll(args[1], args[2])+"\n";
        }
        input.close(); 
        
        //a PrintWriter for output
        PrintWriter output = new PrintWriter(sourceFile);
        output.println(s2);
        output.close();
    }
}
