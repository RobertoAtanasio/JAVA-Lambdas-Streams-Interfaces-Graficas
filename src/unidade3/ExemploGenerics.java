package unidade3;

public class ExemploGenerics <T> {

	T ob;

	ExemploGenerics(T ob) {
		this.ob = ob;
	}

	T getOb() {
		return this.ob;
	}

	void showType() {
		System.out.println("1. Tipo T e-> " + ob.getClass());
		System.out.println("2. Tipo T e-> " + ob.getClass().getName());
	}

}
