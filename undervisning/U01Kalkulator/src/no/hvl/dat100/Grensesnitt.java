package no.hvl.dat100;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Grensesnitt extends JFrame {

	public Grensesnitt() {

		JButton pluss = new JButton("+");
		JButton minus = new JButton("-");
		JButton mul = new JButton("*");
		JButton div = new JButton("/");

		final JTextField tall1 = new JTextField(5);
		final JTextField tall2 = new JTextField(5);
		final JTextField resultat = new JTextField(20);

		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2,1));

		JPanel operatorer = new JPanel();
		
		operatorer.add(tall1);

		operatorer.add(pluss);
		pluss.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int number1 =Integer.parseInt(tall1.getText());
				int number2 = Integer.parseInt(tall2.getText());
				int result = Kalkulator.add(number1, number2);

				resultat.setText(Integer.toString(result));
			}
		});
		
		operatorer.add(minus);
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int number1 =Integer.parseInt(tall1.getText());
				int number2 = Integer.parseInt(tall2.getText());
				int result = Kalkulator.sub(number1, number2);

				resultat.setText(Integer.toString(result));
			}
		});
		
		operatorer.add(mul);
		mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int number1 =Integer.parseInt(tall1.getText());
				int number2 = Integer.parseInt(tall2.getText());
				int result = Kalkulator.mul(number1, number2);

				resultat.setText(Integer.toString(result));
			}
		});
		
		operatorer.add(div);
		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int number1 =Integer.parseInt(tall1.getText());
				int number2 = Integer.parseInt(tall2.getText());
				int result = Kalkulator.div(number1, number2);

				resultat.setText(Integer.toString(result));
			}
		});
		
		operatorer.add(tall2);
		
		panel.add(operatorer);
		panel.add(resultat);

		add(panel);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Grensesnitt();
			}
		});
	}

}

