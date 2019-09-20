package unidade2;

import java.applet.Applet;

public class Identidade extends Applet {

	private static final long serialVersionUID = -6943070160080310597L;

	@Override
	public void init() {

		int I[][] = new int[3][3];
		for (int j = 0; j < 3; j++) {
			for (int j2 = 0; j2 < 3; j2++) {
				if (j == j2) {					
					I[j][j2] = 1; 
				} else {
					I[j][j2] = 0;
				}
				System.out.print(I[j][j2]);
			}
			System.out.println("\n---");
//			System.out.println(I[j][0] + " " + I[j][1] + " " + I[j][2]);
		}
		
	}
}
