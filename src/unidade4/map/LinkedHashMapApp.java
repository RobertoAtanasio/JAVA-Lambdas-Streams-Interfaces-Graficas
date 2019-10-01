package unidade4.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapApp {

	public static void main(String[] args) {

		// A classeLinkedHashMapé subclasse de HashMape adiciona previsibilidade à 
		// ordem de iteração sobre os elementos, isto porque mantém ordenados os elementos por ordem de inserção
		
		// não ordena a saída. Permite valores NULL.
		
		Map<Integer, String> mapa = new LinkedHashMap<>();
		mapa.put(4, "Bruno");
		mapa.put(2, "Umberto");
		mapa.put(3, "Fernando");
		mapa.put(null, null);
		mapa.put(3, "Caetano");
		mapa.put(1, "Umberto");
		System.out.println(mapa);

	}

}
