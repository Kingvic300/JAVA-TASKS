import java.util.Scanner;
public class ClassWork {
	public static void main(String[] args){
	int number = 0;
	Triangle(number);
	Converter(number);
	Meters(number);
	SquareMeters(number);
	FinancialApplication(number);
	SumDigit(number);
	}
	public static void Triangle(int number){
	Scanner input = new Scanner(System.in);
	System.out.println("enter length of the sides and height of the equilateral triangle:"); 
	double length = input.nextDouble();
	double area = 0.433012702*(length)*(length);
	double volume = area*length;
	System.out.println("the area is: "+ area+" ");
	System.out.println("the volume is: "+ volume+" "); 
	}
	public static void Converter(int number){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter miles:");
	double miles = input.nextDouble();
	double KILOMETER = 1.6;
	double kilometers = miles*KILOMETER;
	System.out.printf("%.2f ",kilometers,"\n");
	}
	public static void Meters(int number){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a value for meter:");
	double meters = input.nextDouble();
	double feet = meters*3.2788;
	System.out.printf("%.2f ",feet,"\n"); 
	}
	public static void SquareMeters(int number){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number in square meters:");
	double squareMeters = input.nextDouble();
	double ping = squareMeters*0.3025;
	System.out.printf("%.2f ",ping,"\n"); 	 
	}
	public static void FinancialApplication(int number){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the subtotal rate:");
	int subtotal = input.nextInt();
	System.out.println("Enter gratuity rate:"); 
	int gratuityrate = input.nextInt();
	int gratuity = subtotal/gratuityrate;
	int total = gratuity+subtotal;
	System.out.print("total is"+total+"\n"); 
	}
	public static void SumDigit(int number){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number between 0 and 1000:");
	int digit = input.nextInt();
	int digit1 = number%10;
	int digit2 = number/10;
	int total = digit1+digit2;
	System.out.print("sum of the digits is"+total); 


	}
}