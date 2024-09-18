import java.util.Scanner; 	
public class TaskFive{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int count = 0;
	for(int number = 1;number<=10;number++){
		System.out.println("Enter your score");
		int score = input.nextInt();
		if(number%2==0){
			count+=score;
			System.out.println(count);
	}
	}
	}	
} 