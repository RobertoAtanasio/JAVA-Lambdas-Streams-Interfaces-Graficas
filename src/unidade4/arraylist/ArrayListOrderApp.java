package unidade4.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListOrderApp {
	
	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		lista.add("vermelho");
		lista.add("verde");
		lista.add("verde");
		lista.add("amarelo");
		Collections.sort(lista);
		System.out.println(lista);
	}
}
