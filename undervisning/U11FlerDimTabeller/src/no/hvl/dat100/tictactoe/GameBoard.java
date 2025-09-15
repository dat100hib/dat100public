package no.hvl.dat100.tictactoe;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class GameBoard extends JFrame {

	static final long serialVersionUID = 0;
	
	private JButton[][] buttons;
	private JTextArea statustext;
	private GameController controller;

	private static String EMPTY_BUTTON_STR = " ";
	private static String NEW_GAME_STR = "New Game";
	private static int STATUSAREA_LENGTH = 10;

	public GameBoard() throws HeadlessException {
		super("Tic-Tac-Toe");

		GameController controller = new GameController();
		this.controller = controller;

		// build up the main window layout
		setLayout(new BorderLayout());

		JPanel boardpanel = new JPanel();
		JPanel statuspanel = new JPanel();

		// setup the board itself
		boardpanel.setLayout(new GridLayout(TicTacToe.SIZE, TicTacToe.SIZE));
		statuspanel.setLayout(new FlowLayout());

		// setup the buttons
		buttons = new JButton[TicTacToe.SIZE][TicTacToe.SIZE];
		
		for (int y = 0; y < TicTacToe.SIZE; y++) {
			for (int x = 0; x < TicTacToe.SIZE; x++) {
				
				JButton button = new JButton(EMPTY_BUTTON_STR);

				buttons[y][x] = button;

				button.addActionListener(new BoardBtnListener(this, x, y));
				
				boardpanel.add(button);
			}
		}

		// setup the status area
		JTextArea statustext = new JTextArea(1, STATUSAREA_LENGTH);
		this.statustext = statustext;

		// setup the new game button
		JButton newgamebtn = new JButton(NEW_GAME_STR);
		newgamebtn.addActionListener(new NewGameBtnListener(this));

		statuspanel.add(newgamebtn);
		statuspanel.add(statustext);

		// setup the board and status into main frame
		add(boardpanel, BorderLayout.CENTER);
		add(statuspanel, BorderLayout.SOUTH);

		// startup the main window/frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);

	}

	// method invoked by BoardBtnListener
	public void buttonPressed(int x, int y) {

		System.out.println("Button pressed " + x + " " + y);

		// get button
		JButton pressedbutton = buttons[y][x];

		// update text of button according to turn
		char player = controller.getTurn();
		pressedbutton.setText(Character.toString(player));

		// disable the button since this field can no longer be chosen
		pressedbutton.setEnabled(false);

		// game controller checks whether we now have a winner
		char winner = controller.checkGameBoard(x, y, player);

		if ((winner == TicTacToe.X_PLAYER_CHR)
				|| (winner == TicTacToe.O_PLAYER_CHR)) {

			// announce the winner in the status text area
			statustext.setText(winner + " is the winner!");

			// disable all buttons - as the game is now over
			for (JButton[] btns : buttons) {
				for (JButton button : btns) {
					button.setEnabled(false);
				}
			}

		} else {
			controller.nextTurn();
		}
	}

	// invoke by the "New Game" button listener
	public void newGame() {

		// enable all buttons and reset text
		for (JButton[] btns : buttons) {
			for (JButton button : btns) {
				button.setEnabled(true);
				button.setText(EMPTY_BUTTON_STR);
			}
		}

		// clear the status text area
		statustext.setText("");

		// clear the game controller by
		// creating a new GameController object
		controller = new GameController();
	}

}
