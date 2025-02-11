import java.util.Scanner;
import java.util.Random;
public class GuessTheNumberGame{
	public static void main(String[] args){
	guessNumber();
	}
	public static void guessNumber(){

		Random random = new Random();
		int digit = random.nextInt();

		Scanner input = new Scanner(System.in);
		int  guess = 0;

		while(guess <=10){
			System.out.println("enter any number(from 1- 1000):");
				guess = input.nextInt();
			if(guess>1000){
				System.out.println("INVALID:");
			}else if(guess<1){
				System.out.println("INVALID:");

			}else{ 
				if (guess > digit) {
					System.out.println("guess is too high try again");

				}else if (guess < digit){
					System.out.println(" guess is too low try again");

				}else{
					System.out.println("this guess is correct: " + digit);		
				}
			}
		}
	}
}