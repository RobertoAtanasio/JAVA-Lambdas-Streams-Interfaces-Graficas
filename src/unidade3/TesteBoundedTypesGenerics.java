package unidade3;

public class TesteBoundedTypesGenerics {

	public static void main(String[] args) {
		
		Integer num[] = {1,2,3,4};
		BoundedTypesGenerics<Integer> teste = new BoundedTypesGenerics<>(num);
		System.out.println("Média: " + teste.media());
	}
}
