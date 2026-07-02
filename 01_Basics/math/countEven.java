/**
 * Task: Count the number of even elements in an array.
 * Time Complexity: O(N) where N is the length of the array, as we iterate through it once.
 * Space Complexity: O(1) as we only use a counter variable.
 */
public class countEven {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int Num = countEvenNum(arr);
        System.out.println(Num);
    }
    public static int countEvenNum(int[] arr){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] % 2==0){
                count++;
            }
        }
        return count;
    } 
}
