import java.util.Scanner;
public class LogisticsService{
	public static void main(String[] args){

	Scanner scan = new Scanner(System.in);

	System.out.println("enter a number: "); 
	int number = scan.nextInt();
	System.out.println(RiderDeliveries(number)); 
	}
	public static int RiderDeliveries(int number) {
		int rider = 0;
		if (number < 50) {
			number = rider * 160 + 5000;
			return number;
		} else if (number >= 50 && number < 60) {
			number = rider * 50 + 5000;
			return number;
		} else if (number >= 60 && number < 70) {
			number = rider * 250 + 5000;
			return number;
		} else if (number >= 70) {
			number = rider * 500 + 5000;
			return number;
		}
		return number;
	}

}