package unidade2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TesteCharacterStream {

	public static void main(String[] args) {
		
//		FileReader in = null;
//		FileWriter out = null;
//
//		try {
//			in = new FileReader("C:\\Java\\in.txt");
//			out = new FileWriter(new File("C:\\Java\\out.txt"));
//			int c;
//			while ((c = in.read()) != -1) {
//				out.write(c);
//				out.write(System.lineSeparator());
//			}
//			out.close();
//		} catch (IOException e) {
//			System.out.println(">>> " + e.getMessage());
//		}
//		System.out.println("Done");
		
		String name = "John Doe";
        int age = 44;
        double temp = 26.9;
        FileWriter fw;
        try {
            fw = new FileWriter(new File("C:\\Java\\mytextfile.txt"));
             
            fw.write(String.format("My name is %s.",name));
            fw.write(System.lineSeparator()); //new line
            fw.write(String.format("I am %d years old.",age));
            fw.write(System.lineSeparator()); //new line
            fw.write(String.format("Today's temperature is %.2f.",temp));
            fw.write(System.lineSeparator()); //new line
            fw.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
         
        System.out.println("Done 1");
		
        Logger log1 = new Logger("C:\\Java\\file1.txt");
        File f = new File("C:\\Java\\file2.txt");
        Logger log2 = new Logger(f);
         
        log1.log("This is written in the first file");
        log2.log("This is written in the second file");
        log1.log("This is appended to the first file");
        log2.log("This is appended to the second file");
        
        System.out.println("Done 2");
	}

}
