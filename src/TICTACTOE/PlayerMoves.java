package TICTACTOE;
public class PlayerMoves{
    public static void playerMoves(char[][] board, int number, String player){
        char character = ' ';
        if(player.equals("player")){
            character = 'X';
        }else
        if(player.equals("player1")){
            character = 'O';
        }
        switch(number){
            case 1:
                board[0][0] = character;
                break;
            case 2:
                board[0][4] = character;
                break;
            case 3:
                board[0][8] = character;
                break;
            case 4:
                board[2][0] = character;
                break;
            case 5:
                board[2][4] = character;
                break;
            case 6:
                board[2][8] = character;
                break;
            case 7:
                board[4][0] = character;
                break;
            case 8:
                board[4][4] = character;
                break;
            case 9:
                board[4][8] = character;
                break;
            default:
                break;
        }
    }
    public static boolean checkForWin(char[][] board){
        for (int count = 0; count <= 4; count += 2) {
            if (board[count][0]!= ' ' && board[count][0] == board[count][4] && board[count][4] == board[count][8]){
                return true;
            }
        }
        for (int counter = 0; counter <= 8; counter += 4){
            if (board[0][counter]!= ' ' && board[0][counter] == board[2][counter] && board[2][counter] == board[4][counter]){
                return true;
            }
        }
        if (board[0][0]!= ' ' && board[0][0] == board[2][4] && board[2][4] == board[4][8]){
            return true;
        }
        if (board[0][8]!= ' ' && board[0][8] == board[2][4] && board[2][4] == board[4][0]){
            return true;
        }

        return false;
    }
}
