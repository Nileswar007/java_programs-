/**
 * Task: Perform Linear Search to find a target element in an array.
 * Time Complexity: O(N) where N is the length of the array.
 * Space Complexity: O(1) as no extra space is used.
 */
public class linearSearch {
    public static void main(String[] args) {
        int nums[] = {5,7,9,11,17};
        int target = 11;

        int result = linearSearch(nums, target);
        if (result != -1){
        System.out.println("Elemment Found at index: " + result);
        }
        else
            System.out.println("Element not found ");

    }

    public static int linearSearch(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target)
                return  i;
        }
        return -1;

    }
}
