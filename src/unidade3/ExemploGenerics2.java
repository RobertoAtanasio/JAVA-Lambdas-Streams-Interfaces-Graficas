package unidade3;

public class ExemploGenerics2 <T,V> {

	T ob1;
	V ob2;
	
	public ExemploGenerics2(T ob1, V ob2) {
		this.ob1 = ob1;
		this.ob2 = ob2;
	}

	public T getOb1() {
		return ob1;
	}

	public void setOb1(T ob1) {
		this.ob1 = ob1;
	}

	public V getOb2() {
		return ob2;
	}

	public void setOb2(V ob2) {
		this.ob2 = ob2;
	}

	void showType() {
		System.out.println("1.1. Tipo T e-> " + ob1.getClass());
		System.out.println("1.2. Tipo T e-> " + ob1.getClass().getName());
		System.out.println("2.1. Tipo T e-> " + ob2.getClass());
		System.out.println("2.2. Tipo T e-> " + ob2.getClass().getName());
	}
}
