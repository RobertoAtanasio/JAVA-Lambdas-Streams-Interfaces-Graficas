package unidade4;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetApp {

	public static void main(String[] args) {

//		LinkedHashSet<String> lista = new LinkedHashSet<>();
		Set<String> lista = new LinkedHashSet<>();
		lista.add("Vermelho");
		lista.add("Verde");
		lista.add("Amarelo");
		lista.add("Verde");
		System.out.println(lista);

	}

}
