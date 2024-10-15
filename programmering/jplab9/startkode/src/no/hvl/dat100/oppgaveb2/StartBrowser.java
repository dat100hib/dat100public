package no.hvl.dat100.oppgaveb2;

import javax.swing.SwingUtilities;

public class StartBrowser {

	public static void main(String[] args) {

		// a bit of voodoo to start the Swing UI thread
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new MyBrowser();
			}
		});
	}
}
