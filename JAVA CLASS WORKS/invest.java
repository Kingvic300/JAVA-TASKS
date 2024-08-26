import java.util.Scanner;
class investor {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("investment amount");
double amount = scan.nextDouble();
System.out.println("interest rate");
double rate = scan.nextDouble();
System.out.println("number of years");
double years = scan.nextDouble();
double Total = amount*rate*years;
System.out.printf("value is %3f" ,Total);
}
}