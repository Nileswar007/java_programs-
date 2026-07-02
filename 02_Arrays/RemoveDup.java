/**
 * Task: Remove duplicates from a sorted array.
 * Time Complexity: O(N) where N is the length of the array.
 * Space Complexity: O(1) as the array is modified in place.
 */
public class RemoveDup {
    public static void main(String[] args){
        int arr[] = {1,1,2,2,3,3};
        int result = removeDup(arr);
        printArr(arr,result);

    }
    public static int removeDup(int[] arr){
        int j = 0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                arr[j]=arr[i];
                j++;
            }
        }
            arr[j] = arr[arr.length-1];
            j++;
            return j;
    }
    public static void printArr(int[] arr,int length){
        System.out.print("[");
        for(int i=0;i<length;i++){
            System.out.print(arr[i]);
            if(i<length-1){
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
    
}
