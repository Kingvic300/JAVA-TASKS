package codingChallenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class QuicksortTest {

    @Test
    public void quicksortTest(){
        int[] numbers = {9,2,1,7,4};
        int start = 0;
        int end = numbers.length - 1;
        numbers = Quicksort.quicksort(numbers, start, end);
        int[] expected = {1,2,4,7,9};
        assertArrayEquals(expected, numbers);
    }
    @Test
    public void findTheMaximumProductTest(){
        int[] numbers = {-9,2,1,7,4,-8};
        numbers = Quicksort.findTheMaximumProduct(numbers);
        int[] expected  = {-9,-8};
        assertArrayEquals(expected, numbers);
    }
}
