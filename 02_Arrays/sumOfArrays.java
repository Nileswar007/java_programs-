/**
 * Task: Calculate the sum of all elements in an array.
 * Time Complexity: O(N) where N is the length of the array.
 * Space Complexity: O(1) as only a sum variable is used.
 */
public class sumOfArrays {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int sum = sumArray(arr);
        System.out.println(sum);

    }
    public static int sumArray(int[] arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        return sum;
    }
}
