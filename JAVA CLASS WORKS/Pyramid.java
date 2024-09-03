import java.util.Scanner;
public class Pyramid{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("input a number:"); 
	int number = input.nextInt();
	for(int count = 0; count <= number; count++){ 
	for(int counter = 1; counter > 0 ;counter++){
	System.out.println("*");
	}
	System.out.println();
	}
	}
} 