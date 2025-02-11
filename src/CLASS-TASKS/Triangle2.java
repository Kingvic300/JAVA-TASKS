import java.util.Scanner;
public class Triangle2 {
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("enter length of the sides and height of the equilateral triangle:"); 
	double length = input.nextDouble();
	double area = 0.433012702*(length)*(length);
	double volume = area*length;
	System.out.print("the area is: "+ area+" ");
	System.out.print("the volume is: "+ volume+" "); 
	}
}