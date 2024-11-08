package TICTACTOE;

import java.util.Scanner;

public class Game {

    public static void gameBoard(char[][] board) {
        boolean boardIsFull = true;
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("First player turn ranging from 1 to 9 ");
            int numbers = input.nextInt();
            PlayerMoves.playerMoves(board, numbers, "player");
            Board.printBoard(board);

            System.out.println("Second player turn ranging from 1 to 9 ");
            int number1 = input.nextInt();
            PlayerMoves.playerMoves(board, number1, "player1");
            Board.printBoard(board);

            Board.isBoardFull(board);
        }
    }
}
