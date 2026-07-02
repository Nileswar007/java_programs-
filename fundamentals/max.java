public class max{
public static void main(String[] args){
    int arr[] = {3,7,2,9,4};
    int b = max(arr);
    System.out.println(b);

}
public static int max(int[] arr){
    int maximum = arr[0];
    for(int i=0;i<arr.length;i++){
        if (maximum<arr[i]){
         maximum = arr[i];
        }
    }
    return maximum;
}
}