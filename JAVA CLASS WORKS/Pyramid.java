import java.util.Scanner;
public class Pyramid{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.println("input a number:"); 
		int number = input.nextInt(); 

		for(int count = 1; count <=number; count++){ 
			for(int counter = number; counter <=number; counter++){
				System.out.print(number);
		}
		System.out.println();
		}
	}
} 