package unidade4.exemplos;

import java.util.HashSet;
import java.util.Set;

public class TesteClienteCurso {

public static void main(String[] args) {
		
		Set<Curso> cursoA = new HashSet<>();
		Set<Curso> cursoB = new HashSet<>();
		
		// A ^ B
		carregarCursos(cursoA, cursoB);
		cursoA.retainAll(cursoB);
		System.out.println("A interseção B: " + cursoA);

		// A - B
		carregarCursos(cursoA, cursoB);
		cursoA.removeAll(cursoB);
		System.out.println("A - B: " + cursoA);
		
		// B - A
		carregarCursos(cursoA, cursoB);
		cursoB.removeAll(cursoA);
		System.out.println("B - A: " + cursoB);
		
		// A U B
		carregarCursos(cursoA, cursoB);
		cursoA.addAll(cursoB);
		System.out.println("A U B: " + cursoA);
		
		// criar clientes
		carregarCursos(cursoA, cursoB);
		Cliente A = new Cliente();
		A.setCursos(cursoA);
		
		Cliente B = new Cliente();		
		B.setCursos(cursoB);
		
		System.out.println("Cliente A: " + A.toString());
		System.out.println("Cliente B: " + B.toString());
		
	}

	private static void carregarCursos(Set<Curso> cursoA, Set<Curso> cursoB) {
		Curso java8 = new Curso("Java 8");
		Curso oracle12c = new Curso("Oracle12c");
		Curso sql = new Curso("SQL");
		cursoA.clear();
		cursoB.clear();
		cursoA.add(java8);
		cursoA.add(oracle12c);
		cursoB.add(java8);
		cursoB.add(sql);
	}

}
