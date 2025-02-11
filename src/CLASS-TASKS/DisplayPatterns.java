import java.util.Scanner; 
public class DisplayPatterns{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter number:");
		int number = input.nextInt();
		displayPattern(number); 
	}
	public static void displayPattern(int number){
		for (int count = 1;count <=number; count++){
			for (int counter = 10; count>number;count--){
				System.out.println(" "); 		
			for(int counts = 1; counts<=number;count++){
				System.out.println("*"); 
			}
				System.out.println();
			}
		}
	}
}