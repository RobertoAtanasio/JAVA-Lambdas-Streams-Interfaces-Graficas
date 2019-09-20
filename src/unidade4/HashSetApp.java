package unidade4;

import java.util.HashSet;
import java.util.Set;

public class HashSetApp {

	public static void main(String[] args) {
		
//		HashSet<String> lista = new HashSet<>();
		Set<String> lista = new HashSet<>();
		lista.add("Vermelho");
		lista.add("Verde");
		lista.add("Amarelo");
		lista.add("Verde");
		System.out.println(lista);
		
	}
}
