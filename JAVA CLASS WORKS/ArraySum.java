import java.util.Arrays;
public class ArraySum{
	public static void main(String[] args){
		System.out.print(Arrays.toString(Index()));

	}
	public static int[] Index(){
		int[] array = {5,10,2,1,7,10,13,45};
		int[] array2 = new int[array.length];
		int[] array3 = new int[2];
		int sum = 0;
		int large = 0;
		int small = 0;
		for(int count = 0;count<array.length;count++){
			sum+=array[count];	
		}
		for(int count = 0;count<array.length;count++){
			array2[count] = sum-array[count]; 
		}
		for (int count = 0;count<array.length;count++){
			small = array2[0];
			large = array2[0];
			if(array2[count]>large)
				large = array2[count];
			if(array2[count]<small)
				small = array2[count];
			
		}
		array3[0] = large;
		array3[1] = small;
			return array3;
	}
}