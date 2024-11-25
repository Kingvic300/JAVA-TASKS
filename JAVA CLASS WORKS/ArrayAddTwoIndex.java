import java.util.Arrays;
public class ArrayAddTwoIndex{

	public static void main(String[] args){
		TwoIndex();
	}
	public static void TwoIndex(){
		int[] array = {2,4,1,5,6,7};
		int sum = 0;
		for(int count = 0; count <  array.length; count++){
			if(array[count] % 2 != 0){
				sum+=array[count];
			System.out.print(sum);
			}
		}
	}
}