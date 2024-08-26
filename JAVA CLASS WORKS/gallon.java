import java.util.Scanner;
class CostGallon {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("driving distance");
double distance = scan.nextDouble();
System.out.println("miles per gallon");
double miles = scan.nextDouble();
System.out.println("price per gallon");
double price = scan.nextDouble();
double Total = distance/miles*price;
System.out.printf("Total driving cost is $%.3f" ,Total);
}
}