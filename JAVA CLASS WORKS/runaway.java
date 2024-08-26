import java.util.Scanner;
class runway {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("number of speed");
double speed = scan.nextDouble();
System.out.println("one pound in acceleration");
double acceleration = scan.nextDouble();
double Total = speed*speed/acceleration*acceleration;
System.out.printf("runway length is %2f" ,Total);
}
}