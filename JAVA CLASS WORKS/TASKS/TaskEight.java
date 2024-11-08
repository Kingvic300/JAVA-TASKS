import java.util.Scanner; 	
public class TaskEight{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int count = 0;
	for(int number = 100;number<110;number++){
	System.out.println("Enter your score");
	int score = input.nextInt();
	if (score<0 || score>100)
		break;
	count+=score;
	}
	System.out.println("your total score is: "+count);
	 
	}	
} 