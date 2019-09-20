package unidade2;

import java.io.FileInputStream;
import java.io.IOException;

public class StreamApp {

	public static int byteStream() throws IOException {
		
		int contador = 0;
		FileInputStream entrada = new FileInputStream("C:/Java/in.txt");
		while (entrada.read() != -1) {
			contador++;
		}
		entrada.close();
		return contador;
		
	}
	
	public static int caracterLetra(char letra) throws IOException {
	
		int contador = 0;
		FileInputStream entrada = new FileInputStream("C:/Java/in.txt");
		int c;
		while ((c = entrada.read()) != -1) {
			if ( c == letra) {				
				contador++;
			}
		}
		entrada.close();
		return contador;
	}
	
	public static void main(String[] args) {

		try {
			int contador = byteStream();			
			System.out.println("Total de caracteres: " + contador);
			String letra = "a";
			char charLetra = letra.charAt(0);
			contador = caracterLetra(charLetra);			
			System.out.println("Total de letras '" + letra + "' encontrada: " + contador);
		} catch (IOException e) {
			System.out.println(">>> " + e.getMessage());
		}

	}

}
