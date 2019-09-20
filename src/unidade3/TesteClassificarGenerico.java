package unidade3;

public class TesteClassificarGenerico {

	public static void main(String[] args) {
		
//		ClassificarGenerico classificar = new ClassificarGenerico();		
//		Double valor = classificar.max(6L, 15L);
		
		Double valor = ClassificarGenerico.max(6L, 15L);
		System.out.println("valor: " + valor);

	}

}
