import java.util.Arrays; 
public class IndexFinder{
	public static void main(String[] args){
		Index();
	}
	public static void Index(){
		int[] array = {3,4,1,9,6};
		int[] array2 = new int[2];
		int sum  = 15;
		int add = 0;
		for(int count = 0; count < array.length; count++){
			add = array[count];
			for(int counter = 1; counter < array.length; counter++ ){
				int adds = add + array[counter];
				if(adds == sum){
					array2[0] = counter;
					array2[1] = count;
				}
			}	
		}
			System.out.print(Arrays.toString(array2)); 	
	}
}