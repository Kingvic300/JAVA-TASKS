import java.util.Scanner;
import java.lang.Math;

public class PassMark{
	public static void main(String[] args ){
		Scanner input = new Scanner(System.in);

		System.out.println("input 10 number");
		
		int passmark = 50;
		int count = 1;
		int passed = 0;
		int failed = 0;

		while(count <=10){
			int number = input.nextInt();		
		
		
			if (number >= passmark){
		
				System.out.println("they passed");
				passed = passed +1;
			} else {
		
				System.out.println("they failed");
				failed = failed +1;
		
			}

			count++;
		}

		System.out.printf("no of students that passed %d \n", passed);
		System.out.printf("no of students that failed %d \n", failed);

	}
}