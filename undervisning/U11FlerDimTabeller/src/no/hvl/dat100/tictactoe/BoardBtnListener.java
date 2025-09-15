package no.hvl.dat100.tictactoe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BoardBtnListener implements ActionListener {

	private int x, y;
	private GameBoard board;

	public BoardBtnListener(GameBoard board, int x, int y) {
		this.x = x;
		this.y = y;
		this.board = board;
	}

	public void actionPerformed(ActionEvent e) {

		board.buttonPressed(x, y);

	}
}
