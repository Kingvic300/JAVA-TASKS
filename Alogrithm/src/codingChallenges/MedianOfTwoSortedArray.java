package codingChallenges;

public class MedianOfTwoSortedArray {
    public static int[] median(int[] nums1, int[] nums2) {
        int[] concatenates = new int[nums1.length + nums2.length];
        int counter = 0;
        int[] evenMedian = new int[1];
        int[] oddMedian = new int[2];
        for (int count = 0; count < nums1.length; count++) {
            concatenates[counter++] = nums1[count];
        }
        for (int count = 0; count < nums2.length; count++) {
            concatenates[counter++] = nums2[count];
        }
            for (int count = 0; count < concatenates.length; count++) {
                for (int index = 1; index < concatenates.length; index++) {
                    int temp = concatenates[index - 1];
                    if (concatenates[index - 1] > concatenates[index]) {
                        concatenates[index - 1] = concatenates[index];
                        concatenates[index] = temp;
                    }
                }
            }

            int median = concatenates.length;
            if (median % 2 == 1) {
                int middle = concatenates[median / 2];
                evenMedian[0] = middle;
                return evenMedian;
            } else {
                int middle1 = concatenates[median / 2 - 1];
                int middle2 = concatenates[median / 2];
                oddMedian[0] = middle1;
                oddMedian[1] = middle2;
            }
            return oddMedian;
        }
    }

