import java.util.Scanner
public class multiple {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("input first integer");
int number1 = input.nextInt();
System.out.print("input second integer");
int number2 = input.nextInt();
int triple = number1*number1*number1;
int doubled = number2*number2;
int remainder = triple%doubled;
System.out.printf("multiple is %2f, remainder");
}
}
