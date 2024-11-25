import java.util.Scanner;
public class Checks{
	public static void main(String[] args){
		checker();
	}
	public static void checker(){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer");
			int number = input.nextInt();
			boolean empty = (number <= 0);

		if (empty){
			System.out.print("it is empty");
		}else{
			int[] array = new int[number];
			System.out.print("It is not empty  ");
		}
	}
} 