import java.util.Random;
import java.util.Arrays;
public class DiceRollingGame{
	public static void main(String[] args){	
		Random input = new Random();
		int[] sum = new int[13];
		int dice = 0;
		for(int count = 0; count < 36_000_000; count++){
			int die1 = input.nextInt(6);
			int die2 = input.nextInt(6);
			dice = die1 + die2;
		}
		System.out.print(sum[dice]++);
	}
}