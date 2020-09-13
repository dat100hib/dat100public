package no.hvl.dat100.tictactoe;

public class GameController {

	private char[][] board;
	private char turn;

	public GameController() {
		turn = TicTacToe.X_PLAYER_CHR; // Player 'X' starts the game
		board = new char[TicTacToe.SIZE][TicTacToe.SIZE];
	}

	public char getTurn() {
		return turn;
	}

	public void nextTurn() {
		switch (turn) {
		case TicTacToe.X_PLAYER_CHR:
			turn = TicTacToe.O_PLAYER_CHR;
			break;
		case TicTacToe.O_PLAYER_CHR:
			turn = TicTacToe.X_PLAYER_CHR;
			break;
		}
	}

	// check board given that field (x,y) has been selected by player
	public char checkGameBoard(int x, int y, char player) {
		char winner = ' ';

		System.out.println("Updating Gameboard (" + x + "," + y + ") = " + player);
		board[y][x] = player;

		System.out.println("Checking Gameboard");

		if (checkGameBoardPlayer(TicTacToe.X_PLAYER_CHR)) {
			winner = TicTacToe.X_PLAYER_CHR;
		} else if (checkGameBoardPlayer(TicTacToe.O_PLAYER_CHR)) {
			winner = TicTacToe.O_PLAYER_CHR;
		}

		System.out.println("Winner = " + winner);

		return winner;
	}

	public boolean checkGameBoardPlayer(char player) {

		boolean gameover = false;

		// check all rows on the board (horizontal)
		int y = 0;
		while (!gameover && y < TicTacToe.SIZE) {

			gameover = checkHorizontal(y, player);
			y++;
		}

		// check all columns on the board (vertical)
		int x = 0;
		while (!gameover && x < TicTacToe.SIZE) {

			gameover = checkVertical(x, player);
			x++;
		}

		if (!gameover) {
			gameover = checkDiagonals(player);
		}

		return gameover;
	}

	private boolean checkHorizontal(int y, char player) {

		boolean allequal = true;

		// TicTacToe.SIZE gir størrelse på brettet

		// TODO - START

		// TODO - SLUTT

		// return allequal;
		return false; // REMOVE ME
	}

	private boolean checkVertical(int x, char player) {

		boolean allequal = true;

		// TicTacToe.SIZE gir størrelse på brettet

		// TODO - START

		// TODO - SLUTT

		// return allequal;
		return false; // REMOVE ME
	}

	private boolean checkDiagonals(char player) {

		boolean allequal_lr = true; // for checking left to right diagonal
		boolean allequal_rl = true; // for checking right to left diagonal

		// TicTacToe.SIZE gir størrelse på brettet

		// TODO - START
		
		// sjekk om alle karakterer/innganger på første diagonalen i
		// 2-dim tabellen board har karakteren player

		// sjekk om alle karakterer/innganger på andre diagonalen i
		// 2-dim tabellen board har karakteren player

		// TODO - SLUTT

		// return allequal_lr || allequal_rl;
		return false; // REMOVE ME
	}

}
