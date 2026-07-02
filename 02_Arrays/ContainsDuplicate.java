/**
 * Task: Check if an array contains any duplicate elements (Brute Force).
 * Time Complexity: O(N^2) because of the nested loops comparing each element.
 * Space Complexity: O(1) as no extra space is used.
 */
public class ContainsDuplicate {
    public static void main(String[] args){
        int[] arr = {9,2,3,4,1,9};
        boolean  isDup = conDup(arr);
        System.out.println("result: " + isDup );
    }
    public static boolean conDup(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
              if(arr[i]==arr[j]){
                return true;

              }
            }
        }
        return false;
    }    
}
