public class Asterisk{
	public static void main(String[] args){
		squareOfAsterisks();

	}
	public static void squareOfAsterisks(){
		for (int count = 1; count<=4;count++){
			System.out.println("  ");
			for(int counter = 1; counter<=4; counter++){
				System.out.print(" * ");
			}
		}
	}
}