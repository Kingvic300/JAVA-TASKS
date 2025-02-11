package TICTACTOE;

import java.util.Scanner;

public class Game{

    public static void gameBoard(char[][] board){
        Scanner input = new Scanner(System.in);
        int count = 0;
        while (count < 9){
            System.out.println("First player turn to play X by inputting numbers from 1 to 9 ");
            int number = input.nextInt();
            if(!Board.isBoardFull(board)){
                PlayerMoves.playerMoves(board, number, "player");
                Board.printBoard(board);
            }else{
                System.out.println("First player turn to play X by inputting numbers from 1 to 9 ");
                number = input.nextInt();
                PlayerMoves.playerMoves(board, number, "player");
                Board.printBoard(board);
            }
            if(PlayerMoves.checkForWin(board)){
                System.out.println("Player X wins!");
                break;
            }
            if(!Board.isBoardFull(board)){
            System.out.println("Second player turn to play O by inputting numbers from 1 to 9 ");
            int number1 = input.nextInt();
                PlayerMoves.playerMoves(board, number1, "player1");
                System.out.println("Space occupied");
                Board.printBoard(board);
            }else{
                System.out.println("Second player turn to play O by inputting numbers from 1 to 9 ");
                int number1 = input.nextInt();
                PlayerMoves.playerMoves(board, number1, "player1");
                Board.printBoard(board);
            }
            if(PlayerMoves.checkForWin(board)){
                System.out.println("Player O wins!");
                break;
            }
            count++;
        }
    }
}