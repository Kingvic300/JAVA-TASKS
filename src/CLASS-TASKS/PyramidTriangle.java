public class PyramidTriangle {
	public static void main(String[] args) {
		int number = 12;

		for (int count = 1;count <= number;count++) {
			for (int spaces = count;spaces < number;spaces++) {				System.out.print(" ");
			}
			for (int counter = 1;counter<=(2*count-1);counter++) {
				System.out.print("*");	
			}
			System.out.println();
		}
	}
}
