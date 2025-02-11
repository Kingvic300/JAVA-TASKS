import java.util.Scanner; 	
public class TaskThree{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int count = 0;
	for(int number = 1;number<=10;number++){
	System.out.println("Enter your score");
	int score = input.nextInt();
	count+=score;
	}
	float average = count/10;
	System.out.println("your average score is: "+ average);
	System.out.println("your total score is: "+count);
	}	
} 