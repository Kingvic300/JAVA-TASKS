import java.util.Scanner;
class temp {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("amount of water");
double water = scan.nextDouble();
System.out.println("initial temp");
double temp1 = scan.nextDouble();
System.out.println("final temp");
double temp2 = scan.nextDouble();
double  Energy = (temp1-temp2)*4184;
System.out.printf("Energy needed is %3f" ,Energy);
}
}