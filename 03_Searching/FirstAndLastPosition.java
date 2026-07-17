import java.util.Arrays;

/**
 * Task: Find the starting and ending position of a target value in a sorted array (First and Last Position).
 * Time Complexity: O(log N) using binary search.
 * Space Complexity: O(1) as no extra space is used.
 */
public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] result = searchRange(arr, target);
        System.out.println("First and Last Position of " + target + ": " + Arrays.toString(result));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1, -1};
        result[0] = findBoundary(nums, target, true);
        result[1] = findBoundary(nums, target, false);
        return result;
    }

    private static int findBoundary(int[] nums, int target, boolean isLeft) {
        int start = 0;
        int end = nums.length - 1;
        int index = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                index = mid;
                if (isLeft) {
                    end = mid - 1; // Look on the left side
                } else {
                    start = mid + 1; // Look on the right side
                }
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return index;
    }
}
