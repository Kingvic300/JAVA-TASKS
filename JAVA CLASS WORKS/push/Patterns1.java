import java.util.Scanner;
public class Patterns1 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter number of sizes: "); 
	int size = input.nextInt(); 
		TopTriangle(size);
		BottomTriangle(size);
	}

	public static void TopTriangle(int size) {	
		for (int count = size; size<=size; count++){
			System.out.println(" "); 
		for (int counter = size; counter<=count; 
counter++){
			System.out.print(" * ");
		}
		}
	}
	public static void BottomTriangle(int size) {
		for (int count = 1; size<=size; count++){
			System.out.println (" ");
		for (int counter = size; counter>=count; counter--){	
			System.out.print(" * ");
		}
		} 
	}

}