package unidade4;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetApp {

	public static void main(String[] args) {

//		TreeSet<String> lista = new TreeSet<>();
		Set<String> lista = new TreeSet<>();
		lista.add("Vermelho");
		lista.add("Verde");
		lista.add("Amarelo");
		lista.add("Verde");
		System.out.println(lista);

	}

}
