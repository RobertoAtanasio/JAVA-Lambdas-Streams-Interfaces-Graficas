package unidade2;

import javax.swing.JOptionPane;

public class TesteJOptionPane {

	public static void main(String[] args) {

		String notas = JOptionPane.showInputDialog("Informe a nota");
		float nota = 0;
		try {
			if (notas.toString().trim().equals("")) {
				JOptionPane.showMessageDialog(null, "Informe uma nota válida");
				main(args);
			}
			nota = Float.parseFloat(notas);	
		} catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "Nota não informada");
			System.exit(0);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Informe uma nota válida");
			main(args);
		}
		
		System.out.println("Nota: " + nota);
		
		if (nota < 0 || nota > 100) {
			JOptionPane.showMessageDialog(null, "Nota inválida. Deve está compreendida entre 0 e 100");
			main(args);
		} else if (nota < 50) {
			JOptionPane.showMessageDialog(null, "Nota insuficiente");
		} else if (nota < 70) {
			JOptionPane.showMessageDialog(null, "Nota regular");
		} else if (nota < 90) {
			JOptionPane.showMessageDialog(null, "Nota boa");
		} else {
			JOptionPane.showMessageDialog(null, "Nota excelente");
		}
		System.exit(0);		// finalizando a aplicação

	}

}
