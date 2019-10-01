package unidade4;

import java.util.ArrayList;

public class NoteBook {

	static ArrayList<String> anotacoes;
	
	public static void main(String[] args) {
		
		anotacoes = new ArrayList<>();
		anotacoes.add("Comprar pão");
		anotacoes.add("Vender carro");
		anotacoes.add("Encontrarás as 11h30");

		double t1 = System.currentTimeMillis();
		
		for (int i = 3; i < 1003; i++) {
			anotacoes.add("Texto: " + i);
		}
		
		double t2 = System.currentTimeMillis();
		
		System.out.println("tempo: " + (t2 - t1));
		System.out.println(anotacoes);
	}

}
