package unidade3;

public class ConstrutorGenericoNotaAluno {

	double valor;

	<T extends Number> ConstrutorGenericoNotaAluno(T obj) {
		valor = obj.doubleValue();
	}
	
	public <T extends Number> Double retornarValorGenerico(T obj) {
		return obj.doubleValue();
	}

}
