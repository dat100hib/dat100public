package no.hvl.dat100.jplab11.oppgave2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyBrowser extends JFrame {

	public static int MAX_LINES = 30;
	public static int MAX_WIDTH = 30;

	private static int MAX_URL_SIZE = 50;
	private static String GO_BUTTON_STR ="Go";
	
	public MyBrowser() {
		
		super("myExplorer");

		// build up the main window layout
		setLayout(new BorderLayout());

		// setup the top panel
		JPanel toppanel = new JPanel();
		toppanel.setLayout(new FlowLayout());

		// setup the buttons
		JButton gobutton = new JButton(GO_BUTTON_STR);
		JTextField urltext = new JTextField(MAX_URL_SIZE);
		
		toppanel.add(gobutton);
		toppanel.add(urltext);
		
		JTextArea webpagetext = new JTextArea(MAX_LINES + 1,MAX_WIDTH);
		
		gobutton.addActionListener(new GoBtnListener(webpagetext, urltext));
				
		// setup the board and status into main frame
		add(toppanel, BorderLayout.CENTER);
		add(webpagetext, BorderLayout.SOUTH);

		// startup the main window/frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);

	}
}
