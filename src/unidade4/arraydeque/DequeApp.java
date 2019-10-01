package unidade4.arraydeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeApp {

	public static void main(String args[]) {
		Deque<String> lista = new ArrayDeque<>();
		lista.add("vermelho");
		lista.add("verde");
		lista.add("verde");
		lista.add("amarelo");
		
		lista.addFirst("primeiro");
		lista.addLast("último");
		
		String peekFirst = lista.peekFirst();
		String peekLast = lista.peekLast();
		
		System.out.println("peekFirst: " + peekFirst);
		System.out.println("peekLast: " + peekLast);
		
		System.out.println(lista);
		lista.removeFirst();
		lista.removeLast();
		System.out.println(lista);
	}
}
