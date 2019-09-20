package unidade2;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JApplet;

public class AloMundo extends JApplet {

	private static final long serialVersionUID = 294411019461386429L;

	@Override
	public void init() {
		System.out.println("Inicializando...");
	}
	
	@Override
	public void start() {
		System.out.println("Executando...");
	}
	
	@Override
	public void stop() {
		System.out.println("Finalizando...");
	}
	
	@Override
	public void destroy() {
		System.out.println("Destroying...");
	}
	
	@Override
	public void paint(Graphics g) {
		System.out.println("Desenhando...");
//		g.drawRect(0, 0, 150, 150);
		g.setColor(Color.BLUE); 
		this.setSize(400, 100);
		this.setBackground(Color.GREEN);
		g.setFont(new Font("Times New Roman", Font.BOLD, 30));
		g.drawString("Versão JVM " + System.getProperty("java.version"), 20, 20);
		g.drawString("Versão S.O " + System.getProperty("os.name"), 50, 50);
		
	}
}
