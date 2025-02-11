import java.util.Scanner;
public class AssignGrades{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of students:");
			int students = input.nextInt();
			int[] array = new int[students];
		for(int count = 0;count<array.length;count++){
			System.out.println("Enter your score: ");
			array[count] = input.nextInt();
		}
		for(int counter = 0;counter<array.length;counter++){
			System.out.println("Student score is "+array[counter]+" and grade is");
		}
	}
}