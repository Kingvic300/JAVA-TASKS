import java.util.Arrays;

public class Concatenates {
	public static void main(String[] args) {
        concatenates();
	}

	public static void concatenates() {

		int[][] array = {{1, 2, 3, 4}, {5, 6, 7, 8, 9}};
		int length = 0;
		for (int count = 0; count < array.length; count++) {
			length += array[count].length;
		}
		int[] concatenated = new int[length];
		int sum = 0;
		for (int count = 0;count < array.length; count++) {
			for (int counter = 0;counter < array[count].length;counter++) {
				concatenated[sum++] = array[count][counter];
			}
		}
		System.out.println(Arrays.toString(concatenated));
	}
}
