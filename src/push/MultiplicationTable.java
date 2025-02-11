import java.util.Scanner;
public class MultiplicationTable {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number:"); 
		int number = input.nextInt();
	for(int count = number; count <=number; count++){
		for(int counter = 1; counter <=10;counter++){
		System.out.printf("%d*%d=%d",count,counter, count*counter);

	}
}
}


}