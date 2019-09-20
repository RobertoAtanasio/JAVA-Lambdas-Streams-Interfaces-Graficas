package unidade1;

import java.util.Scanner;

public class Calculadora {

	public static void dividir (int n1, int n2)  throws ArithmeticException {
		System.out.println("Saída: " + n1/n2);
	}
	
	public static void main(String[] args) throws DivisaoZeroException {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro valor:");
		int n1 = entrada.nextInt(); 
		System.out.println("Digite o segundo valor:");
		int n2 = entrada.nextInt();
		entrada.close();
		try {			
			dividir(n1,n2);
		} catch (ArithmeticException e) {
//			System.out.println("Erro de divisão por ZERO");
			throw new DivisaoZeroException("Erro de divisão por zero.");
		}
	}
}
