import java.util.Scanner;
import java.util.Random;
public class Game{
	public static void main(String[] args){
		Hangman();
	}
	public static void Hangman(){
		String[] words = {"level","gerald","victor","jesse","akerele"};
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a letter in the word");
		String name = input.next();
		String[] randomWord = words;
			System.out.print(randomWord); 
	}

}