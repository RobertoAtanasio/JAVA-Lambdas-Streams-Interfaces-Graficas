package unidade1;

import java.io.IOException;

public class TesteLeitura {

	public static void main(String[] args) {

		byte [] bytes = new byte[10];
		System.out.print("Digite algo:");
		try {
			System.in.read(bytes);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.print("\nEco: " + new String(bytes));
	}

}
