package unidade4.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListApp {

	/*
	 * Classe ArrayList
	 * � A classe ArrayList utiliza internamente um vetor (array)
	 * de objetos, cujo tamanho inicial � de 10 posi��es. Caso n�o seja suficiente,
	 * um novo vetor � alocado com tamanho igual a 1.5 vezes maior e todo o conte�do
	 * � copiado para este novo vetor.
	 * 
	 * � Esta implementa��o � prefer�vel quando o
	 * tamanho da lista � previs�vel (evitando realoca��es) e as opera��es de
	 * inser��o e remo��o s�o feitas, em sua maioria, no fim da lista (evitando
	 * deslocamentos), ou quando a lista � mais lida do que modificada (otimizado
	 * para leitura aleat�ria)
	 */

	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		lista.add("vermelho");
		lista.add("verde");
		lista.add("verde");
		lista.add("amarelo");
		System.out.println(lista);
	}

}
