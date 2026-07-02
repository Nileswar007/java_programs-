//Task: Write a method that takes an array and returns how many even numbers it contains.
//Example: {1, 2, 3, 4, 5, 6} → 3

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
