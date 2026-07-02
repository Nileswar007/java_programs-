/**
 * Task: Move all zeros to the end of the array (another approach).
 * Time Complexity: O(N) as we iterate through the array a couple of times.
 * Space Complexity: O(N) because a temporary array is used.
 */
import java.util.Arrays;
public class MoveZeroAlternate {
    public static void main(String[] args){
        int[] arr = {1,0,2,3,2,0,0,4,5,1};
        moveZero(arr);
    }
    public static void moveZero(int[] arr){
       int[] temp = new int[arr.length];
       int j = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                temp[j]=arr[i];
                j++; 
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i] = temp[i];
        }
        System.out.print(Arrays.toString(arr));       
  

    }
}
