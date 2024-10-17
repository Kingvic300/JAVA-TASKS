import java.util.Scanner;
import java.util.Random;
public class Game{
	public static void main(String[] args){
		Hangman();
	}
	public static void Hangman(){
		String[] words = {"level","gerald","victor","jesse","akerele"};
		Random input = new Random();
		System.out.println("Enter a letter in the word");
		String name = input.nextLine();
		String[] randomWord = words;
			System.out.print(randomWord); 
	}

}