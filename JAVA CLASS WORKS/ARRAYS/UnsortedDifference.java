import java.util.Arrays;

public class UnsortedDifference {
    public static void main(String[] args) {
        int[] arr = {1,5,2,2,2,5,5,4};
        int k = 3;
        int[] arr2 = new int[4];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum -= arr[i];
            if(sum == k ){
                arr2[1] = sum;
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}
