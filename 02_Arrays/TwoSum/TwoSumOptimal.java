import java.util.HashMap;
import java.util.Arrays;
public class TwoSum {
    public static void main(String[] args){
        int[] arr = {1,7,5,10,2};
        int target = 9;
        int[] result = twoSum(arr,target);
        System.out.println("indicies: " +Arrays.toString(result));

    }
    public static int[] twoSum(int[] nums,int target){
        HashMap<Integer,Integer> seen = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int current = nums[i];
            int diff = target - current;
            if(seen.containsKey(diff)){
             return new int[]{seen.get(diff),i};
            }
            seen.put(current,i);
        }
        return new int[]{};
    }   
}
