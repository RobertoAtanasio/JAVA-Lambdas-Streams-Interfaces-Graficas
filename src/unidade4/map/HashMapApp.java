package unidade4.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapApp {

	public static void main(String[] args) {

		// A classe HashMap utiliza internamente tabela hash para armazenar as chaves de um Mapa.
		
		// ordena a saída. Permite valores NULL.
		
		Map<Integer, String> mapa = new HashMap<>();
		mapa.put(1, "Bruno");
		mapa.put(2, "Umberto");
		mapa.put(4, "Umberto");
		mapa.put(3, "Fernando");
		mapa.put(null, null);
		mapa.put(5, null);
		mapa.put(3, "Caetano");
		System.out.println(mapa);

		System.out.println(mapa.get(2));

	}

}
