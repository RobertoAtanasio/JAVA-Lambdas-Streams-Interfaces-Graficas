package unidade2;

import java.awt.Graphics;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class Avaliacao extends JApplet {

	private static final long serialVersionUID = 8443403291422132045L;

	@Override
	public void paint(Graphics g) {

		String notas = JOptionPane.showInputDialog("Informe a nota");
		float nota = Float.parseFloat(notas);
		
		if (nota < 0 || nota > 100) {
			JOptionPane.showMessageDialog(null, "Nota inválida. Deve está compreendida entre 0 e 100");
			paint(null);
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
