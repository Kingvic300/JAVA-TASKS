import java.util.Scanner;
public class leapYear{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("enter a year:"); 
	int year = input.nextInt();
	isLeapYear(year);
	}
	public static void isLeapYear(int year){
	int years = year%2;
	if(years<=0){
		System.out.println("it is a leap year:"); 
	}else{
		System.out.println("it is not a leap year:"); 
	}
	}
} 