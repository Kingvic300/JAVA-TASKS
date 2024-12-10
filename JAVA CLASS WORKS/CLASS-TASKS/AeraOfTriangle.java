import java.util.Scanner;
public class AeraOfTriangle{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number for x1:");
			double x1 = input.nextDouble();

		System.out.println("Enter a number for y1:");
			double y1 = input.nextDouble();

		System.out.println("Enter a number for x2:");
			double x2 = input.nextDouble();

		System.out.println("Enter a number for y2:");
			double y2 = input.nextDouble();

		System.out.println("Enter a number for x3:");
			double x3 = input.nextDouble();

		System.out.println("Enter a number for y3:");
			double y3 = input.nextDouble();
		double side1 = Math.sqrt((x2-x1)*(x2-x1)+(y2 -y1)*(y2 -y1));
		double side2 = Math.sqrt((x3-x2)*(x3-x2)+(y3-y2)*(y3-y2));
		double side3 = Math.sqrt((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3));
		double side = (side1+side2+side3)/2;
		double area = Math.sqrt(side*(side-side1)*(side-side2)*(side-side3));
		System.out.printf("%.2f",area);

	}
} 