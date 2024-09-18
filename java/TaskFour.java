import java.util.Scanner; 	
public class TaskFour{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int count = 0;
	int total = 0;
	for(int number = 1;number<=10;number+=1){
	System.out.println("Enter your score");
	int score = input.nextInt();
	if(number%2==0)
	total+=score;
	}
	System.out.println("your total score is: "+total);
	}	
} 