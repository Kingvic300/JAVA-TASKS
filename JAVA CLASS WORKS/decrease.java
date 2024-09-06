import java.util.Scanner;
public class decrease {
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("enter three numbers:");
	int num1 = input.nextInt();
	int num2 = input.nextInt();
	int num3 = input.nextInt();
	System.out.print(displaySortedNumber(num1,num2,num3));
	}
	public static int displaySortedNumber(int num1,int num2,int num3){
	int small = 0;
	int smaller = 0;
	int smallest = 0;
	if(num1<smallest){
		smallest = num1;
		return smallest;
	}else if(num1<smaller){
		smaller = num1;
		return smaller;
	}
	}
}