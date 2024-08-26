import java.util.Scanner;
public class NumberCounter {
	public static void main(String[] args ) {
		Scanner input = new Scanner(System.in);

System.out.println("Enter a number");
int number = input.nextInt();
int positive = 0;
int negative = 0;
int zero = 0;

while( number != -1){


	if (number > 0){
	positive = positive +1;
	}else if (number < 0){
	negative = negative +1;
	}else if (number<= 0){
		zero = zero +1;
		}

	number = input.nextInt();	

}

System.out.printf("input %d is the positive number%n", positive);
System.out.printf("input %d  is the negative number%n", negative);
System.out.printf("input %d  is the zero number%n", zero);

}


}