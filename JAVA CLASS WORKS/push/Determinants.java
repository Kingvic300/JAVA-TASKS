import java.util.Scanner;
public class Determinants {
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("input a number");
	
	int number = input.nextInt();
		
		if (number%4==0&&number%5==0){
			System.out.println("number is divisible");
		} 
		else{ 
			System.out.println("number is not divisible");
		}
	}
}