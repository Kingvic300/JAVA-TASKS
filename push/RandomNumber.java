import java.util.Scanner;
import java.util.Random;
public class RandomNumber {

public static void main(String[] args){

Random random = new Random();

int digit = random.nextInt(10);


Scanner input = new Scanner(System.in);


int  guess = 0;


while(guess <=3) {
System.out.println("enter any number(from 1- 10):");
guess = input.nextInt();

if (guess > digit) {
System.out.println("guess is too high try again");
}
else if (guess < digit) {
System.out.println(" guess is too low try again");
}
else  {

	System.out.println("this guess is correct: " + digit);
	System.out.println("number of guess is:" + guess);
		
}

}
	 
}
}