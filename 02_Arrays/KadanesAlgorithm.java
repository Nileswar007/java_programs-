/**
 * Task: Find the contiguous subarray with the largest sum (Kadane's Algorithm).
 * Time Complexity: O(N) as we traverse the array only once.
 * Space Complexity: O(1) as no extra space is used.
 */
public class KadanesAlgorithm {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSubarraySum = maxSubArray(arr);
        System.out.println("Maximum contiguous subarray sum is: " + maxSubarraySum);
    }

    public static int maxSubArray(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        int maxSoFar = arr[0];
        int currentMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }

        return maxSoFar;
    }
}
