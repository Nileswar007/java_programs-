//return the indices of two sum from an array
import java.util.Arrays;
public class TwoSum {
    public static void main (String[] args){
        int[] arr = {1,7,4,5,2};
        int target = 9;
        int[] result = twoSum(arr,target);

        if(result.length==2){
            System.out.println("Indices: "+ Arrays.toString(result));
        }
        else{
            System.out.println("No pair found");
        }

    }
    public static int[] twoSum(int[] arr , int target){
        for (int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]== target){
                    return new int[] {i,j};

                }
            }
        }
        return new int[] {};
    }
    
}
