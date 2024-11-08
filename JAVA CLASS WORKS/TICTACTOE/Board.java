package TICTACTOE;

public class Board {

    public static void printBoard(char[][] board) {
        for (char[] row : board) {
            for (char column : row) {
                System.out.print(column);
            }
            System.out.println();
        }
    }

    public static boolean isBoardFull(char[][] board) {
        for (int count = 0; count < board.length; count++) {
            for (char[] chars : board) {
                if (chars[count] == 'X' || chars[count] == 'O') {
                    return false;
                }
            }
        }
        return true;

    }
}