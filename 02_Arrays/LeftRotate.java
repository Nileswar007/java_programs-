//left rotate by one place
public class LeftRotate {
    public static void main(String[] args) {
        int[] arr = {2,3};
        int result = lefRotate(arr);
        printArray(arr,result);
    }
    public static  int lefRotate(int[] arr){
        if (arr.length == 0) return 0;
        int temp = arr[0];

        for (int i=1;i<arr.length;i++){
            arr[i-1] = arr[i];
        }
         arr[arr.length-1] = temp;

    return arr.length;      
    }
    public static void printArray(int[] arr, int result){
        System.out.print("[");
        for(int i=0;i<result;i++){
            System.out.print(arr[i]);
            if(i<result-1){
                System.out.print(",");
            }
        }
        System.out.print("]");
    }       
    }
    

