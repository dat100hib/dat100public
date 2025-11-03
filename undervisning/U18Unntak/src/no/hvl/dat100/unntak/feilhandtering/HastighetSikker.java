package no.hvl.dat100.unntak.feilhandtering;

import javax.swing.JOptionPane;

public class HastighetSikker {

	public static void main(String[] args) {

		boolean ok = false;

		do {

			try {
				String kmstr = JOptionPane.showInputDialog("Avstand i kilometer");
				int km = Integer.parseInt(kmstr);

				String tmstr = JOptionPane.showInputDialog("Tid i timer");
				int tm = Integer.parseInt(tmstr);

				int hastighet = km / tm;
				System.out.println("Hastighet: " + hastighet);
				ok = true;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Feil: Input ikke et tall");
			} catch (ArithmeticException e) {
				JOptionPane.showMessageDialog(null, "Feil: tid kan ikke være 0");
			}
		} while (!ok);
	}
}
