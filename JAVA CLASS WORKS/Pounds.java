import java.util.Scanner;
class kilogram {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("number of pounds");
double pounds = scan.nextDouble();
System.out.println("one pound in kilogram");
double kilogram = scan.nextDouble();
double Total = pounds*kilogram;
System.out.printf("kilogram is %2f" ,Total);
}
}