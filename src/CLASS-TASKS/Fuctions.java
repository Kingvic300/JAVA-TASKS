import java.util.Scanner;

public class Fuctions{
	public static void main(String[] args){
		largest();
	}
	public static void largest(){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of scores:");
		int score = input.nextInt();
		int[] array = new int[score];
		int large = array[0];
		for(int count = 0; count < array.length;count++){ 
			System.out.print("Enter your score: ");
				array[count] = input.nextInt(); 
		}

		for(int counter = 0; counter < array.length;counter++){ 
			System.out.print(array[counter]+" "+"\n");
			if (large<array[counter]){
				large = array[counter];
			}	
		}
		System.out.println("Your largest is: "+ large); 

	}
} 