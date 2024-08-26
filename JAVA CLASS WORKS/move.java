import java.util.Scanner;
class motion {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("first velocity");
double v1 = scan.nextDouble();
System.out.println("second velocity");
double v2 = scan.nextDouble();
System.out.println("time");
double t1 = scan.nextDouble();
double Total = (v1-v2)/t1;
System.out.printf("value is %3f" ,Total);
}
}