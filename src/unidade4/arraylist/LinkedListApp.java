package unidade4.arraylist;

import java.util.LinkedList;

public class LinkedListApp {

	public static void main(String args[]) {
		// se definirmos como List<String> lista = new LinkedList<>(); os m�todos lista.removeFirst(); e lista.removeLast();
		// n�o estar�o dispon�veis pois esses m�todos s�o espec�ficos do LinkedList.
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
