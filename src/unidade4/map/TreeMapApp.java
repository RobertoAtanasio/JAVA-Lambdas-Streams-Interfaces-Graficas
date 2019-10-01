package unidade4.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapApp {

	public static void main(String[] args) {

		// A classeTreeMaputiliza internamente uma�rvore red-black (�rvoresbin�rias semibalanceadas) que 
		// garante que as chaves contidas ser�omantidas em ordem ascendente.
		
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
