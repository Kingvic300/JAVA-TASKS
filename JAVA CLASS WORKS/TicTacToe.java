public class TicTacToe{
	public static void main(String[] args){
	char[][] ticTac = {{'x','o','x'},{'o','o','o'},{'x','o','x'}};
	for(int count = 0; count<ticTac.length;count++){
		for(int counter = 0 counter<ticTac.length; counter++){
			System.out.print(ticTac[count][counter]);
		}
		System.out.println(); 
	}
	}

}