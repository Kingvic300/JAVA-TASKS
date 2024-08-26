import java.util.Scanner;
import java.lang.Math;
class rect{
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("width");
double width = scan.nextDouble();
System.out.println("height");
double height = scan.nextDouble();
double Total = 2*width*height;
System.out.printf("The perimeter Is %2f", Total);
}
}