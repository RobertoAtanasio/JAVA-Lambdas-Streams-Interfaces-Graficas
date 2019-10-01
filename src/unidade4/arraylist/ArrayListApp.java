package unidade4.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListApp {

	/*
	 * Classe ArrayList
	 * • A classe ArrayList utiliza internamente um vetor (array)
	 * de objetos, cujo tamanho inicial é de 10 posições. Caso não seja suficiente,
	 * um novo vetor é alocado com tamanho igual a 1.5 vezes maior e todo o conteúdo
	 * é copiado para este novo vetor.
	 * 
	 * • Esta implementação é preferível quando o
	 * tamanho da lista é previsível (evitando realocações) e as operações de
	 * inserção e remoção são feitas, em sua maioria, no fim da lista (evitando
	 * deslocamentos), ou quando a lista é mais lida do que modificada (otimizado
	 * para leitura aleatória)
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
