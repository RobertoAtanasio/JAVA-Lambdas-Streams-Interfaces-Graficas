package unidade1;

public class DivisaoZeroException extends Exception {

	private static final long serialVersionUID = 9152193233092304378L;
	
	public DivisaoZeroException(String mens) {
		super(mens);
		System.out.println(mens);
	}

}
