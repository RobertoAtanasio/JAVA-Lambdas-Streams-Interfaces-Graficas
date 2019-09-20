package unidade3.grafico;

import java.util.ArrayList;
import java.util.List;

public class TesteGenerico {

	public static void main(String[] args) {

		List<Shape> lista = new ArrayList<>();
		lista.add(new Circle());
		lista.add(new Rectangle());
		
//		Rectangle rect = lista.get(0);	// por ser genêrico ão consegue fazer o CAST
		
		List<String> ls = new ArrayList<>();
		List<?> l = ls;
		l = lista;
		
		List<?>[] lst = new List<?>[10];				// CORRETO
//		List<String>[] lst2 = new List<String>[10];		// ERRO
		
	}

}
