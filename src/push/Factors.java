import java.util.Scanner;
public class Factors{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("input a number"); 
int number = input.nextInt();
int factors = 0; 
for(int count = 1;count <= number; count++){
if(number%2!=0) factors++;
System.out.print("the factors are " + factors);
	break;
}  

}
}