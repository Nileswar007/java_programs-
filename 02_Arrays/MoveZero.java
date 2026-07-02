import java.util.Arrays;
public class MoveZero {
    public static void main(String[] args){
        int[] arr = {0,1,3,0,4,5};
        int[] result = moveZero(arr); 
        System.out.println("array after zero moved at the last: " + Arrays.toString(result));
    }
    public static int[] moveZero(int[] nums){
        int[] result = new int [nums.length];
        int index = 0;
        for(int i=0;i<nums.length;i++){        
            if(nums[i]!=0){
                result[index] = nums[i];
                index++;  
            }     
    }  
    return result;   
}
}
