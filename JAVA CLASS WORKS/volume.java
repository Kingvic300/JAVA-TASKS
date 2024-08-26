import java.util.Scanner;
import java.lang.Math;
class volume{
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("length of triangle");
double length1 = scan.nextDouble();
System.out.println("area");
double area1 = scan.nextDouble();
double Total = area1*length1;
System.out.printf("The volume Is %2f", Total);
}
}