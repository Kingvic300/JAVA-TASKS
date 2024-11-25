package ARRAYS;

import java.util.Arrays;
public class ArraySortedSquare{
	public static void main(String[] args){
	System.out.println(Arrays.toString(Sort()));
	}
	public static int[] Integers(){
		int[] array = {2,1,3,4,9,5};
		int[] square = new int[array.length];
		for(int count = 0;count<array.length;count++){
			square[count] = array[count]*array[count];
				
		}
		return square;
	}
	public static int[] Sort(){
		int[] array = Integers();
		for(int count = 0;count<array.length;count++){ 
			for(int counter = 1; counter<array.length;counter++){
				int temp = array[counter-1];
				if(array[counter-1] > array[counter]){
					array[counter-1] = array[counter];
					array[counter] = temp;
				}	
			}
		}
		return array;
	}
}



