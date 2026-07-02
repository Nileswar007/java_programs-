/**
 * Task: Perform Binary Search to find a target element in a sorted array.
 * Time Complexity: O(log N) where N is the length of the array.
 * Space Complexity: O(1) as it is implemented iteratively.
 */
public class BinarySearch {
    public static void main(String[] args) {
        int nums[] = {5,7,9,11,17};
        int target = 11;

        int result = binarySearch(nums, target);
        if (result != -1){
        System.out.println("Elemment Found at index: " + result);
        }
        else
            System.out.println("Element not found ");

    }

    public static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        
        while(left <= right){
            int mid = (left + right)/2;

            if(nums[mid] == target){
                return mid;
            }
            else if (nums[mid] < target){
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return -1;

    }
}
