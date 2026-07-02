/**
 * Task: Sort an array using the Bubble Sort algorithm.
 * Time Complexity: O(N^2) in the worst and average cases.
 * Space Complexity: O(1) as sorting is done in place.
 */
public class BubbleSort
{
    public static void main(String[] args) {
        
        int nums[] = {5,7,1,11,23};
        int size = nums.length;
        int temp = 0;

        System.out.println("Before sorting: ");
        for (int num : nums){
            System.out.print(num + " ");
        }
// algorithm
            for(int i=0;i<size-1;i++){
                for(int j=0;j<size-i-1;j++){
                    if (nums[j] > nums[j+1]){
                        temp = nums[j];
                        nums[j] = nums[j+1];
                        nums[j+1] = temp;
                    }
                }      
            }
         System.out.println("\nafter sorting: ");
        for ( int num : nums){
            System.out.print(num + " ");
        }
    }  
}
