import java.util.Scanner;
public class Addition {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("input the sum of 10 natural numbers:");
int number= 0;
int sum = 1;

while(sum<=10){
System.out.println("input a value");
int value = input.nextInt();
number = number + value;
sum = sum + 1;

}
System.out.println("sum of total is\n" + number);
}
}