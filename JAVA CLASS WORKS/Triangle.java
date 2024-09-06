import java.util.Scanner;
public class Triangle {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter number of sides: "); 
	int side = input.nextInt();
		for (int count = 1; count<=side; count++){ 
			for (int counter = count-1; counter<=side-count;counter++){
				System.out.print(" * ");
			}
			System.out.println();	 
		}

			
		 
	}
}

