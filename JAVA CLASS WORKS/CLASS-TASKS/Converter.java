import java.util.Scanner;
public class Converter {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter miles:");
		double miles = input.nextDouble();
		double KILOMETER = 1.6;
		double kilometers = miles*KILOMETER;
		System.out.printf("%.2f",kilometers);
	}
} 