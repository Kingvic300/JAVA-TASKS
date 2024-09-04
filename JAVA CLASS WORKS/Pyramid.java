import java.util.Scanner;
public class Pyramid{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.println("input a number:"); 
		int number = input.nextInt(); 

		for(int count = 1; count <=  number; count++){ 
			for(int counter = number - count; counter >0; counter--){
				System.out.print(" ");
		}
		//for(int triangle = count; triangle >0; triangle--){
		//	System.out.print(triangle);
		//}
		System.out.println();
		}
	}
} 