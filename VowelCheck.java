/* Assignment 8.4: Program to count number of vowels in a text file.
   Print the total number of vowels in the file
*/

import java.io.*;	// Importing java io files

class VowelCheck {

	public static void main(String[] args) throws IOException {	// throws IOException to show it has IO exception

		try {
			File infile = new File(args[0]);	// Input file passed via argument 0 at command line
			FileInputStream in = new FileInputStream(infile);
			DataInputStream din = new DataInputStream(new BufferedInputStream(in));

			File otfile = new File(args[1]);	// Input file passed via argument 1 at command line
			FileOutputStream ot = new FileOutputStream(otfile);
			DataOutputStream dout = new DataOutputStream(new BufferedOutputStream(ot));

			int rd;
			int count=0;
			String message;

			while ((rd = in.read()) != -1)
			{
				switch ((char)rd) {
				case 'a' :
				case 'A' :
				case 'e' :
				case 'E' :
				case 'i' : 
				case 'I' :
				case 'o' :
				case 'O' :
				case 'u' :
				case 'U' :
					count++;
				}
			}
			message = "Process complete! Total number of vowels in the file: " + count;
			dout.writeUTF(message);	// Write output in output file via data output stream object dout 
			dout.close();	// object flushed and closed
			System.out.println(message);	// Message at command prompt
		} catch (Exception e){System.out.println(e);}	// catch any exceptions and display on command prompt
	}
}

/* Command line:

C:\Users\Akhil Sharma\acadgild\java-rookie\src>javac -d "C:\Users\Akhil Sharma\acadgild\java-rookie\classes" VowelCheck.java

C:\Users\Akhil Sharma\acadgild\java-rookie\src>java VowelCheck "C:\Users\Akhil Sharma\acadgild\java-rookie\asg\java-asg-eightdotfour\vowelfile.txt" "C:\Users\Akhil Sharma\acadgild\java-rookie\asg\java-asg-eightdotfour\vowelcount.txt"
Process complete! Total number of vowels in the file: 15

*/