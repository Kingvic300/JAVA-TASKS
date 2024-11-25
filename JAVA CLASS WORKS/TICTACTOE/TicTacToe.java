package TICTACTOE;

public class TicTacToe{
	public static void main(String[] args){
		char[][] board = {{' ', ' ', '|', ' ', ' ', ' ', '|', ' ', ' '},
				         {'-', '-', '+', '-', '-', '-', '+', '-', '-'},
				         {' ', ' ', '|', ' ', ' ', ' ', '|', ' ', ' '},
				         {'-', '-', '+', '-', '-', '-', '+', '-', '-'},
				         {' ', ' ', '|', ' ', ' ', ' ', '|', ' ', ' '}};
		Board.printBoard(board);
		Game.gameBoard(board);
	}
}

