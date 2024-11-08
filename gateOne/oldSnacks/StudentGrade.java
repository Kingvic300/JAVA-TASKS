package oldSnacks;

import java.util.Scanner;
public class StudentGrade{
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("How many students do you have ");
		int row = input.nextInt();

		System.out.println("How many subject do they offer ");
		int column = input.nextInt();

		int[][] array = new int[row][column];

		for (int count = 0; count < row; count++) {
			for (int counter = 0; counter < column; counter++) {
				System.out.println("Enter marks for student " + (count + 1) + " in subject " + (counter + 1) + ": ");
				array[count][counter] = input.nextInt();
			}
		}
		System.out.print("student");
		System.out.print("\t");

		for (int count = 0; count < column; count++) {
			System.out.print("\t" + "sub" + (count + 1));
		}
		int total = 0;
		System.out.print("\t" + "Total");
		System.out.print("\t" + "average");

		for (int count = 0; count < row; count++) {
			System.out.println();
			System.out.print("student" + " " + (count + 1) + "\t");
			for (int counter = 0; counter < column; counter++) {
				System.out.print(array[count][counter]);
				total += array[count][counter];
			}
			System.out.print("\t" + total);
			double average = total / column;
			System.out.print("\t" + average);
		}
	}
}	