	package TICTACTOE;

	public class TicTacToe{
		public static void main(String[] args){
			char[][] board = boards();
			Board.printBoard(board);
			Game.gameBoard(board);
		}

		public static char[][] boards() {
			return new char[][]{{' ', ' ', '|', ' ', ' ', ' ', '|', ' ', ' '},
							 {'-', '-', '+', '-', '-', '-', '+', '-', '-'},
							 {' ', ' ', '|', ' ', ' ', ' ', '|', ' ', ' '},
							 {'-', '-', '+', '-', '-', '-', '+', '-', '-'},
							 {' ', ' ', '|', ' ', ' ', ' ', '|', ' ', ' '}};
		}
	}

