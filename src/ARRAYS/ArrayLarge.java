package ARRAYS;

import java.util.Arrays;
public class ArrayLarge{
	public static void main(String[] args){
	System.out.println(Arrays.toString(Large()));
}
	public static int[] Large(){
		int [] array = {2,3,5,6,7};
		int[] array1 = new int [2];
		int large = array[0];
		int low = array[0];
		int num = 0;
		for(int count = 0; count<array.length;count++){	
			num += array[count];
			if (large<array[count]){
				large = array[count];
			}	
			if (low>array[count]){
				low = array[count];
			}
		}
		array1[0] = large;
		array1[1] = low;
			return array1;
	}
}