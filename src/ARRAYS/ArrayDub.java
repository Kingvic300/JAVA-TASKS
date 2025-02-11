import java.util.Arrays;

public class ArrayDub{
	public static void main(String[] args){
	System.out.println(Arrays.toString(Double()));

	}
	public static int[] Double(){
		int[] array = {13,7,9,5,7,8};
		int[] num = new int[array.length*2];
		for(int count = 0; count<array.length;count++){
			num[count] = array[count];
			num[count+array.length] = array[count]*2;

		}
		return num;
	}
}