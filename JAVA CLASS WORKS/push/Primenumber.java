import java.util.Scanner;
public class Primenumber{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("input a number"); 
int number = input.nextInt();
int factors = 0; 
for(int count = 1;count <= number; count++){
if(number%count==0) factors++;}
if(factors==2)
	System.out.println("number is a prime number");
if(factors!=2)
	System.out.println("number is not a prime number");  

}
}