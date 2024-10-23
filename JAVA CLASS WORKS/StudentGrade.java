import java.util.Scanner; 
public class StudentGrade{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("How many students do you have ");
			int row = input.nextInt();
		System.out.println("How many subject do they offer "); 
			int column = input.nextInt(); 
		int[][] array = new int [row][column];
		for(int count = 0; count < row; count++){
			for(int counter = 0; counter < column; counter++){
		System.out.print("Enter marks for student " + (count + 1) + " in subject " + (counter + 1) + ": ");
                	array[count][counter] = input.nextInt();

			}
		}
		      System.out.println("Marks entered for each student:");
       		for (int count = 0; count < row; count++) {
        		for (int counter = 0; counter < column; counter++) {
              		}
       		}


	}
}	