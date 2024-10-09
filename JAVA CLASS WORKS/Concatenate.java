import java.util.Arrays; 
public class Concatenate {
	public static void main(String[] args) {
	concatenates();
}
	public static void concatenates(){
	int[][] array = {{1, 2, 3,4,},{7, 5, 8, 9, 21}};

	int[] concatenated = new int[array.length];

	int count = 0;
	for (int counts : array) {
	concatenated[count++] = counts;
	}	
	System.out.println(Arrays.toString(concatenated));
	}
}