import java.util.Scanner;
public class AdditionQuiz {
	public static void main(String[] args){ 
<<<<<<< HEAD
		int num1 = (int)(System.currentTimeMillis() % 10);
		int num2 = (int)(System.currentTimeMillis() / 10 % 10);
		Scanner input = new Scanner(System.in);
		System.out.println("What is " + num1 + " + " + num2 + " ? ");
		int answer = input.nextInt();
		System.out.println(num1 + " + " + num2 + " = " + answer + " "+ (num1 + num2 == answer));

=======
	int num1 = (int)(System.currentTimeMillis() % 10);
	int num2 = (int)(System.currentTimeMillis() / 10 % 10);
	Scanner input = new Scanner(System.in);
	System.out.println("What is " + num1 + " + " + num2 + " ? ");
	int answer = input.nextInt();
	System.out.println(num1 + " + " + num2 + " = " + answer + " "+ (num1 + num2 == answer));
	 
>>>>>>> be67abf0c4f921afdfa2c61fabb9e921e0b17b05
	}
} 