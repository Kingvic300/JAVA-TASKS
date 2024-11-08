import java.util.Scanner; 	
public class TaskSix{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int count = 0;
	for(int number = 1;number<=10;number+=1){
	System.out.println("Enter your score");
	int score = input.nextInt();
	if(score%2==0)
	count+=score;
	}
	float average = count/10;
	System.out.println("your average score is: "+ average);

	}	
} 