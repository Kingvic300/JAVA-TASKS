import java.util.Scanner; 
public class TicTacToe{
	public static void main(String[] args){

	
	char[][] board = {{' ',' ','|',' ',' ',' ','|',' ',' '},
			  {'-','-','+','-','-','-','+','-','-'},
			  {' ',' ','|',' ',' ',' ','|',' ',' '},
			  {'-','-','+','-','-','-','+','-','-'},
			  {' ',' ','|',' ',' ',' ','|',' ',' '}};

	int number = 0;
	while(true){
		Scanner input = new Scanner(System.in);
		System.out.println("First player turn ranging from 1 to 9 ");
			int numbers = input.nextInt(); 
		playerMoves(board, numbers, "player");
		printBoard(board);
		if(numbers > 5){
			break;
		}
		System.out.println("second player turn ranging from 1 to 9 ");
			int number1 = input.nextInt(); 
		playerMoves(board, number1, "player1");
		printBoard(board);
		
	}
	}
	public static void printBoard(char[][] board){
		for(char[] row : board){
			for(char column : row){
				System.out.print(column); 
			}
			System.out.println(); 
		}
	}
	public static void playerMoves(char[][] board, int number, String player){
		char character = ' ';
		if(player.equals("player")){
			character = 'X';
		}else if(player.equals("player1")){
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
}