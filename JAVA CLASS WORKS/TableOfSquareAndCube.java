import java.util.Scanner;
public class  TableOfSquareAndCube{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("enter number you want to square and the cube:");
	int number = input.nextInt();
	int square = 0;
	int cube = 0;
	int num = 0;
	while(num <= 10){
	square = num*num;
	cube = num*num*num;
	num++;
	System.out.println(num+ "\t"+square + "\t"+cube);
	
	}	
	}
}