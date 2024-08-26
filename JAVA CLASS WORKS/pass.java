import java.util.Scanner;
public class pass{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("input a number");
	int number = input.nextInt();
	if (number>=60){
		System.out.println("you pass the exam");
	}else {
		System.out.println("you failed the exam");
	}


	}


}