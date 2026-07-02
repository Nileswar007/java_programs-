public class SelectionSort {
    public static void main(String[] args) {
        int nums[] = {8,3,5,1,6};
        int size = nums.length;
        int temp = 0;
        int minIndex=-1;
        System.out.println("Before sorting: ");
        for(int num : nums){
            System.out.print(num + " ");
        }

        //Algorithm of Selection Sort
        for(int i=0;i<size-1;i++){
            minIndex = i;
            for(int j=i+1;j<size;j++){
                if(nums[minIndex]>nums[j]){
                    minIndex = j;
                }

            }

                temp = nums[minIndex];
                nums[minIndex]=nums[i];
                nums[i]=temp;
        }

        System.out.println("\nAfter sorting: ");
        for(int num : nums){
            System.out.print(num + " ");
        }
    }
}
    

