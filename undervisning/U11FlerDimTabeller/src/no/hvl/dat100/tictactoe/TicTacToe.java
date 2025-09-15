package no.hvl.dat100.tictactoe;

import javax.swing.SwingUtilities;

public class TicTacToe {

	// size of game board
	public static int SIZE = 3;

	// character representation of player identity
	public final static char X_PLAYER_CHR = 'X';
	public final static char O_PLAYER_CHR = 'O';

	// string representation of player identity
	public final static String X_PLAYER_STR = Character.toString(TicTacToe.X_PLAYER_CHR);
	public final static String O_PLAYER_STR = Character.toString(TicTacToe.O_PLAYER_CHR);

	public static void main(String[] args) {

		// a bit of voodoo so start the Swing UI thread
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new GameBoard();
			}
		});
	}
}
