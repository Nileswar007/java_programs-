/**
 * Task: Sort an array using the Quick Sort algorithm (Alternate).
 * Time Complexity: O(N log N) on average, O(N^2) worst case.
 * Space Complexity: O(log N) for the recursive call stack.
 */
public class QuickSort1 {

    public static void QuickSort1(int[] arr,int low,int high){
        int pi = partition1(arr, low, high);
        QuickSort1(arr, low, pi-1);
        QuickSort1(arr, pi+1, high);

    }

    private static int partition1(int arr[],int low,int high){
        int pivot = arr[high];
        int i = low - 1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
                int temp = arr[i+1];
                arr[i+1] = arr[high];
                arr[high] = temp;
                return i+1;
    }
    public static void main(String[] args) {
        int arr1[] = {4,1,5,3,6,2};

         QuickSort1(arr1, 0, arr1.length-1);

         for(int num : arr1){
           System.out.println(num +" ");
         }
    }
    
}
