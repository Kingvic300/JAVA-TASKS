import java.util.Scanner;
import java.lang.Math;
class calcu {
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
System.out.println("Input first integer");
double integer1 = scan.nextDouble();
System.out.print("Input second integer");
double integer2 = scan.nextDouble();
System.out.print("Input third integer");
double integer3 = scan.nextDouble();
double side= (integer1+integer2+integer3)/2;
double area = Math.sqrt(side*integer1*integer2*integer3);
System.out.printf("The side Is %3f", side);
System.out.printf("The Area Is %3f", area);

}
}