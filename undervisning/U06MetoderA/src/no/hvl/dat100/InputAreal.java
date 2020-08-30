package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class InputAreal {

	public static void main(String[] args) {
		
		String breddeStr = showInputDialog("Bredde:");
		int bredde = parseInt(breddeStr);

		String hoydeStr = showInputDialog("Høyde:");
		int hoyde = parseInt(hoydeStr);
		
		int a = areal(bredde,hoyde);
		
		showMessageDialog(null,"Areal: " + a);
	}
	
	private static int areal(int bredde, int hoyde) {
		
		int flateareal = bredde * hoyde;
		
		return flateareal;
	}

	private int lesInnTall(String message) {
		
		String tallStr = showInputDialog("Høyde:");
		int tall = parseInt(tallStr);
		
		return tall;
	}
}
