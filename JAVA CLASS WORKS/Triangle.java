import java.util.Scanner;
public class Triangle {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter number of sides: "); 
	int side = input.nextInt();
		
		//for (int count = 0; count<=side; count++){
		//	System.out.println("   "); 
		//for (int counter = 1; counter<=count;counter++){
		//	System.out.print("*     ");
		//}
		//}
	
		for (int count = 0; count<=side; count++){
			System.out.println (" * ");
		for (int counter = 1; counter<=count; counter++){	
			System.out.print("");
		}
		} 
	}
}

