package unidade1;

public class TesteThrows {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {

		int i = 0;
		String frases[]= {"um","dois","três"};
		while (i < 4) {
			System.out.println(frases[i]);
			i++;	
		}
	}

}
