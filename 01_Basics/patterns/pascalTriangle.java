/**
 * Task: Print Pascal's Triangle pattern.
 * Pattern:
 *    1 
 *   1 1 
 *  1 2 1 
 * 1 3 3 1 
 * 
 * Time Complexity: O(N^2) where N is the number of rows (4 in this case).
 * Space Complexity: O(N^2) for the 2D array storing the values.
 */
public class pascalTriangle {
    public static void main(String[] args){
        int arr[][]= new int[4][]; // 2D array to store Pascal's Triangle values

        // Outer loop to handle the number of rows (N = 4)
        for(int i=0;i<4;i++){
            arr[i]= new int[i+1]; // Initialize current row size

            // Inner loop 1: Print leading spaces for alignment
            for(int s=0; s < 4 - 1 - i; s++) {                                                                      
                System.out.print(" ");                                                                              
            } 

            // Inner loop 2: Calculate and print Pascal's Triangle values
            for(int j=0; j<i+1; j++){
                // First and last values of any row are always 1
                if(j==0 || j==i){
                    arr[i][j]=1;
                }
                else{
                    // Calculate value based on sum of the two values above it
                    arr[i][j]= arr[i-1][j-1] + arr[i-1][j];
                }
                System.out.print(arr[i][j]+" ");
            }
            // Move to the next line after completing the row
            System.out.println();
        }
    }
}