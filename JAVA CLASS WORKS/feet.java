import java.util.Scanner;
class meters {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("number of feet");
double feet = scan.nextDouble();
System.out.println("one foot");
double foot = scan.nextDouble();
double Total = feet*foot;
System.out.printf("meters is %2f" ,Total);
}
}