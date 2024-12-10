package codingChallenges;

public class ArrayOfZerosAndOnes {
    public static int[] arrayOfZerosAndOnes(int[] numbers) {
        for(int index = 0; index < numbers.length; index++) {
            if(numbers[index] % 2 == 0) {
                numbers[index] = 0;
            }else{
                numbers[index] = 1;
            }
        }
        return numbers;
    }
}
