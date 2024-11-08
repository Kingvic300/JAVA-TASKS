import java.util.Scanner; 	
public class TaskFive{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int count = 0;
	for(int number = 1;number<=10;number+=1){
	System.out.println("Enter your score");
	int score = input.nextInt();
	if(score%2==0)
	count+=score;
	}
	System.out.println("your total score is: "+count);
	}	
} 