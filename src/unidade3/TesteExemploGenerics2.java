package unidade3;

public class TesteExemploGenerics2 {

	public static void main(String[] args) {
		
		ExemploGenerics2<Integer, String> teste = new ExemploGenerics2 <>(88,"ABC");
		teste.showType();
		int v = teste.getOb1();
		String s = teste.getOb2();
		System.out.println("Valor de v: " + v);
		System.out.println("Valor de s: " + s);
		
		ExemploGenerics2<String, String> teste2 = new ExemploGenerics2 <>("Roberto","Atanásio");
		teste2.showType();
		String v2 = teste2.getOb1();
		String s2 = teste2.getOb2();
		System.out.println("Valor de v: " + v2);
		System.out.println("Valor de s: " + s2);
	}
}
