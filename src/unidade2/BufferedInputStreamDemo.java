package unidade2;

// Maiores informa��es: https://www.geeksforgeeks.org/java-io-bufferedinputstream-class-java/

// Java program to demonstrate working of BufferedInputStream
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

// Java program to demonstrate BufferedInputStream methods 
public class BufferedInputStreamDemo {

	public static void main(String args[]) throws IOException 
    { 
        // attach the file to FileInputStream 
        FileInputStream fin = new FileInputStream("C:/Java/in.txt"); 
  
        BufferedInputStream bin = new BufferedInputStream(fin); 
  
        // illustrating available method 
        System.out.println("Number of remaining bytes:" + bin.available()); 
  
        // illustrating markSupported() and mark() method 
        boolean b=bin.markSupported(); 
        if (b) 
            bin.mark(bin.available()); 
  
        // illustrating skip method 
        /*Original File content: 
        * This is my first line 
        * This is my second line*/
        bin.skip(4); 
        System.out.println("FileContents :"); 
  
        // read characters from FileInputStream and 
        // write them 
        int ch; 
//        bin.reset(); 
        while ((ch=bin.read()) != -1) 
            System.out.print((char)ch); 
  
        System.out.println("------------------------------------------"); 
        
        // illustrating reset() method 
        bin.reset(); 
        while ((ch=bin.read()) != -1) 
            System.out.print((char)ch); 
  
        // close the file 
        fin.close(); 
    }
}
