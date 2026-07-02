/**
 * Task: Move all zeros to the end of the array (Optimal - In Place).
 * Time Complexity: O(N) where N is the length of the array.
 * Space Complexity: O(1) as swapping is done in place.
 */
import java.util.Arrays;
public class MovezeroToLast {
    public static void main(String[] args) {
        int[] arr = {1,0,3,0,5};
        move(arr);
    }
    public static void move(int[] arr){
        int j = 0;
        for(int i=0;i<arr.length;i++){
         if(arr[i]!=0){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j++;
         }
        }
        System.out.println(Arrays.toString(arr));
    }
    
}
