package TICTACTOE;

public class Board{

    public static void printBoard(char[][] board){
        for (char[] row : board) {
            for (char column : row) {
                System.out.print(column);
            }
            System.out.println();
        }
    }
    public static boolean isBoardFull(char[][] board){
        for (int count = 0; count < board.length; count++) {
            for(int counter = 0; counter < board[count].length; counter++){
                if (board[count][counter] == ' '){
                    return false;
                }
            }
        }
        return true;
    }
}