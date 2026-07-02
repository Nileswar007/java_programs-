/**
 * Task: Check if a given array is sorted in ascending order.
 * Time Complexity: O(N) where N is the length of the array.
 * Space Complexity: O(1) as no extra space is used.
 */
public class CheckSorted {
    public static void main(String[] args) {
        int arr[] = {1,3,4,5};
        int arr2[] ={5,2,1,6};
        
        printArray(arr);
       System.out.println("sorted?: " + checkSortedArr(arr));

        printArray(arr2);
        System.out.println("sorted?: " + checkSortedArr(arr2));

        
    }
    public static boolean checkSortedArr(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
       return true;
    }
   public static void printArray(int[] arr){
    for(int num : arr){
        System.out.print(num + " ");
    }
    System.out.println();
   }
    
}
