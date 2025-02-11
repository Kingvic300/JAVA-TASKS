package codingChallenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MedianOfTwoSortedArrayTest {

    @Test
    public void testTheMedianOfTwoSortedArray() {
        int[] nums1 = {1,2,4};
        int[] nums2 = {3,6,7};
        //{1,2,3,4,6,7};
        int[] result = MedianOfTwoSortedArray.median(nums1,nums2);
        int[] expected = {3,4};
        assertArrayEquals(expected, result);

    }
}
