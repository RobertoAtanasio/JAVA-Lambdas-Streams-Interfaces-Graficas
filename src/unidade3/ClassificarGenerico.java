package unidade3;

public class ClassificarGenerico {

	public static <T extends Number> Double max(T x, T y) {
		return x.doubleValue() > y.doubleValue() ? x.doubleValue() : y.doubleValue();
	}
}
