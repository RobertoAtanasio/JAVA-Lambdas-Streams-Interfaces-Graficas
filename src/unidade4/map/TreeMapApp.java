package unidade4.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapApp {

	public static void main(String[] args) {

		// A classeTreeMaputiliza internamente umaárvore red-black (árvoresbinárias semibalanceadas) que 
		// garante que as chaves contidas serãomantidas em ordem ascendente.
		
		Map<Integer, String> mapa = new TreeMap<>();
		mapa.put(4, "Bruno");
		mapa.put(2, "Umberto");
		mapa.put(3, "Fernando");
		mapa.put(5, null);
		mapa.put(3, "Caetano");
		mapa.put(1, "Umberto");
		System.out.println(mapa);
	}
}
