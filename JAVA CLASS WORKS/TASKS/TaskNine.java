import java.util.Scanner; 	
public class TaskNine{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int count = 0;
	for(int number = 100;number<110;number++){
	System.out.println("Enter your score");
	int score = input.nextInt();
	if (score>0&&score<100)
	count+=score;
	}
	System.out.println("your total score is: "+count); 
	}	
} 