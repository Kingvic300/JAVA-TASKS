import java.util.Scanner;
public class NumberCounter22 {
	public static void main(String[] args ) {
		Scanner input = new Scanner(System.in);
		System.out.println("input a number: ");
		int number = input.nextInt();

		int positive = 0;
		int negative = 0;
		int zero = 0 ;
		int count = 0;

	//	while(count <= number){
 	//		negative = number;
	//		zero = number;

	//	System.out.printf("input number %d", count);
	//	int input1 = input.nextInt();


		for(int counter = number; counter < 5 ; counter++) {

			if (number % 2 == 0){
				positive += 1;
			
			}else if(number % 2 == 1){
				negative += 1;

			}else if(number == 0) {
			count += 1;
			}
	}

	
		System.out.printf("input %d positive number%n",positive);
		System.out.printf("input %d negative number%n", negative);
		System.out.printf("input %d zero number%n", zero);
}
}