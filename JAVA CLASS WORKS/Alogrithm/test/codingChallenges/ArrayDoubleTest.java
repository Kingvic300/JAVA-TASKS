package codingChallenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayDoubleTest {

    @Test
    public void arrayDoubleElementTest() {
        //given
        int[] numbers = {4,5,8};
        int[] num = new int[numbers.length * 2];
        //when
        numbers = ArrayDouble.arrayDoubleElement(numbers, num);
        int[] expected = {4,5,8,8,10,16};
        //check
        assertArrayEquals(expected, numbers);
    }
    @Test
    public void arrayDoubleIndexTest() {
        int[] numbers = {4,5,8};
        int[] num = new int[numbers.length * 2];
        numbers = ArrayDouble.arrayDoubleIndex(numbers, num);
        int[] expected = {4,5,8,4,5,8};
        assertArrayEquals(expected, numbers);
    }
}
