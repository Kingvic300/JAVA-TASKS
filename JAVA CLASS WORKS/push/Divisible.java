import java.util.Scanner;
public class Divisible {
	public static void main(String[] args ){
		Scanner input = new Scanner(System.in);
		System.out.print("input an integer");
			int number = input.nextInt();
		if(number%4 ==0&&number%5==0){
			System.out.print("number is divisible");
		}else {
			System.out.print("number is not divisible");
		}
	}
}
