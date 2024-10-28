import java.util.Scanner; 
public class StudentGrade{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("How many students do you have ");
			int row = input.nextInt();
		System.out.println("How many subject do they offer "); 
			int column = input.nextInt(); 
		int counts = 1;
		int[][] array = new int [row][column];
		for(int count = 0; count < row; count++){
			for(int counter = 0; counter < column; counter++){
		System.out.print("Enter marks for student " + (count + 1) + " in subject " + (counter + 1) + ": ");
				if(array[count][counter] < 100){
                			array[count][counter] = input.nextInt();
					
				}else{
					break;
				}
			}
		}
			System.out.print("student");
       		for (int count = 0; count < row; count++){
			System.out.print("sub"+" "+(counts - 1));
			System.out.println(); 
			System.out.print("student"+" "+(count + 1));
        		for (int counter = 0; counter < column; counter++){
				System.out.print("\t"+array[count][counter]); 
				counts++;
              		}
       		}


	}
}	