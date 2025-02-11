import java.util.Scanner;

public  class Scores{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.println("Enter number of scores:");
		int score = input.nextInt();
		int[] array = new int[score];
		int large = array[0];
		int low = array[0];
		int num = array[0];
		int counts = 0;
 
	for(int count = 0; count < array.length;count++){ 
		System.out.println("Enter your score: "+count);
			array[count] = input.nextInt(); 
			counts+=1;
	}

	for(int counter = 0; counter < array.length;counter++){ 
		System.out.print(array[counter]+" "+"\n");
			num += array[counter];
		if (large<array[counter]){
			large = array[counter];
		}	
		if (low>array[counter]){
			low = array[counter];
		}

	}
	int average = num/counts;
	System.out.println("Your average score is: "+ average);
	System.out.println("Your largest is: "+ large); 
	System.out.println("Your lowest is: "+ low);
	}
} 