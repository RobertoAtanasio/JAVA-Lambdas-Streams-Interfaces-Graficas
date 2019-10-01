package unidade4.arraylist;

import java.util.LinkedList;

public class LinkedListApp {

	public static void main(String args[]) {
		// se definirmos como List<String> lista = new LinkedList<>(); os métodos lista.removeFirst(); e lista.removeLast();
		// não estarão disponíveis pois esses métodos são específicos do LinkedList.
		LinkedList<String> lista = new LinkedList<>();
		lista.add("vermelho");
		lista.add("verde");
		lista.add("verde");
		lista.add("amarelo");
		System.out.println(lista);
		
		lista.removeFirst();
		lista.removeLast();
		System.out.println(lista);
	}
}
