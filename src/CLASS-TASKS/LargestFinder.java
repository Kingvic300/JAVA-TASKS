import java.util.Arrays; 
public class LargestFinder{
	public static void main(String[] args){
		Index();
	}

	public static void Index(){
		int[] array = {3,9,4,1,6};
		int[] array2 = new int[2];
		int largest = array[0];
		int large = array[0];
		int num  = 0;

        for (int element : array) {
            num += element;
            if (largest < element) {
                largest = element;
            }
        }

        for (int element : array) {
            num += element;
            if (num < large) {
                large = element;
            }
        }
		array2[0] = largest;
		array2[1] = large;
			System.out.print(Arrays.toString(array2));
	}
}