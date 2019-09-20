package unidade2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TesteByteStream {

	public static void main(String[] args) {
		
		FileInputStream in = null;
		FileOutputStream out = null;

		try {
			in = new FileInputStream("C:\\Java\\in.txt");
			out = new FileOutputStream(new File("C:\\Java\\out.txt"));
			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
			in.close();
			out.close();
		} catch (IOException e) {
			System.out.println(">>> " + e.getMessage());
		}
		
		System.out.println("Done");
	}

}
