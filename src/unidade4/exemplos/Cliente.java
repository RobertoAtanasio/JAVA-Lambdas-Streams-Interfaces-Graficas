package unidade4.exemplos;

import java.util.Set;

public class Cliente {

	private Set<Curso> cursos;
	
	public Set<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(Set<Curso> cursos) {
		this.cursos = cursos;
	}
	
	@Override
	public String toString() {
		return "Cliente [cursos=" + cursos + "]";
	}
}
