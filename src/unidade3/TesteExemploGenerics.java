package unidade3;

public class TesteExemploGenerics {

	public static void main(String[] args) {

		// obs.: não é necessário passar o tipo genérico na segunda parte (new)
		
		ExemploGenerics<Integer> iob = new ExemploGenerics<>(88);
		iob.showType();
		int v = iob.getOb();
		System.out.println("Valor de v: " + v);
		
		ExemploGenerics<String> sob = new ExemploGenerics<>("Gen.");
		sob.showType();
		String s = sob.getOb();
		System.out.println("Valor de s: " + s);

	}

}
