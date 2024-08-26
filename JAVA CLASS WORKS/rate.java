import java.util.Scanner;
class rate {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("interest rate");
double rate1 = scan.nextDouble();
System.out.println("balance rate");
double rate2 = scan.nextDouble();
double Total = rate2*(rate1/1200);
System.out.printf("interest is %2f",Total);
}
}