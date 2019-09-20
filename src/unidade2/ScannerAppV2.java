package unidade2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Formatter;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ScannerAppV2 {

	public static void main(String[] args) {
		
		try {
			Scanner entrada = new Scanner(new FileReader("C:/Java/numeros.txt"));
			Formatter saida = new Formatter();
			double soma = 0;
			String valor;
			while (entrada.hasNext()) {
				valor = entrada.next();
				soma = soma + Double.parseDouble(valor);
			}
			entrada.close();
			JOptionPane.showMessageDialog(null, "O valor da soma é " + saida.format("%.2f", soma));
			saida.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
