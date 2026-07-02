public class ReverseArray {
    public static void main(String[] args){
    int[] arr = {1,2,3,4,5,6};
    
    System.out.println("before");
    printArray(arr);

    reverseArray(arr);

    System.out.println("after");
    printArray(arr);
  
    }
    public static void reverseArray(int[] arr){
        int left = 0;
        int right = arr.length-1;
     
            while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
          }
    }
    public static void printArray(int[] arr){
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
