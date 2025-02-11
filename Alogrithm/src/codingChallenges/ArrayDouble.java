package codingChallenges;

public class ArrayDouble {

    public static int[] arrayDoubleElement(int[] numbers, int[] num){
        for(int count = 0; count<numbers.length; count++){
        num[count] = numbers[count];
            num[count + numbers.length] = numbers[count] * 2;
        }
        return num;
    }

    public static int[] arrayDoubleIndex(int[] numbers, int[] num) {
        for(int count = 0; count<numbers.length; count++){
            num[count] = numbers[count];
            num[count + numbers.length] = numbers[count];
        }
        return num;
    }
}
