import java.util.Scanner;
public class even{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("input an integer");
	int number = input.nextInt();
	if (number %2==0){
		System.out.println("number is even");
	}else if (number %2!=0){
		System.out.println("number is odd");
}
}
}