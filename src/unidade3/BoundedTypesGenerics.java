package unidade3;

public class BoundedTypesGenerics <T extends Number> {

	T[] num;

	BoundedTypesGenerics(T[] num) {
		this.num = num;
	}

	public double media() {
		double soma = 0;
		int i;
		for (i = 0; i < num.length; i++) {
			soma = soma + num[i].doubleValue(); // OK
		}
		return (soma / i);
	}

}
