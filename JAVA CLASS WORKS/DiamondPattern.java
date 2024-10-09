import java.util.Scanner; 
public class DiamondPattern{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of triangles: "); 
		int number = input.nextInt();
	
		System.out.print("  ");
		for (int count = 1;count < number;count++) {
			System.out.print("    ");

			for (int space = count;space < number;space++) {
				System.out.print(" ");
			}
			System.out.print(" "+" ");
	
			for (int counter = 1;counter <= (1 * count - 1+1);counter++) {
				System.out.print("* ");
			}
	
			System.out.println();
			System.out.print("  ");
		}
	
	        for (int count = number;count > 0;count--) {
	  		System.out.print("   ");
	
			for (int space = number;space >= count;space--) {
				System.out.print(" ");
			}

			System.out.print(" "+" ");

 			for (int counter = 1;counter <= (1* count - 1+1);counter++) {
				System.out.print("* ");
	 		}

			System.out.println();

			System.out.print("  ");
		} 
	}
}
