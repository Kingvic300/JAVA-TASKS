
import java.util.Random;
import java.util.Scanner;
public class GuessTheNumber {
    public static void main(String[] args) {
        game();
    }

    public static void game() {
        Random random = new Random();
        int numberOfGuess = random.nextInt(1000) + 1;
        int numberOfTrial = 0;
        Scanner input = new Scanner(System.in);
        boolean win = false;
        while (win == false) {
            System.out.println("Guess a number between 1 and 1000:");
            int guess = input.nextInt();
            numberOfTrial++;

            if (guess < numberOfGuess) {
                System.out.println("Too low. Try again:");
            }else if (guess > numberOfGuess) {
                System.out.println("Too high. Try again:");
            }else{
                win = true;
            }
        }

        System.out.println("Correct you got the answer stay tuned for your reward");
        System.out.println("you guessed " + numberOfTrial + " times");
        System.out.println("Do you want to play again, Enter 1 to play again and 0 to quit");
        int number = input.nextInt(); 

        if (number==1){
            game();
        }else{
            System.out.println("Thanks for playing");
        }
    }
}
