package codingChallenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayOfZerosAndOnesTest {
    @Test
    public void arrayOfZerosAndOnesTest() {
        int[] numbers = {4,5,8,8,8,2,9};
        numbers = ArrayOfZerosAndOnes.arrayOfZerosAndOnes(numbers);
        int[] expected = {0,1,0,0,0,0,1};
        assertArrayEquals(expected, numbers);
    }
}
