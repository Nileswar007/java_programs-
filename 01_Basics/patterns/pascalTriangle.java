public class pascalTriangle {
    public static void main(String[] args){
        int arr[][]= new int[4][];

        for(int i=0;i<4;i++){
        arr[i]= new int[i+1];

        //leading spaces 
        for(int s=0; s < 4 - 1 - i; s++) {                                                                      
         System.out.print(" ");                                                                              
        } 

        for(int j=0; j<i+1; j++){
            if(j==0 || j==i){
                arr[i][j]=1;
            }
            else{
            arr [i][j]= arr [i-1][j-1] + arr [i-1][j];
            }
             System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
}
}