import java.util.Scanner;
class square {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("input first integer");
double integer1 = scan.nextDouble();
System.out.println("input second integer");
double integer2 = scan.nextDouble();
double square1 = integer1*integer1;
double square2 = integer2*integer2;
double sum = integer1*integer1+integer2*integer2;
double difference = integer1*integer1-integer2*integer2;
System.out.printf("The square1 %1f", square1);
System.out.printf("The square2 %1f", square2);
System.out.printf("The sum %2f", sum);
System.out.printf("The difference is %2f", difference);
}
}