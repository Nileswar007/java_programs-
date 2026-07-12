/**
 * Task: Print a downward pyramid star pattern.
 * Pattern:
 * * * * *
 *  * * *
 *   * *
 *    *
 * 
 * Time Complexity: O(N^2) where N is the number of rows (4 in this case).
 * Space Complexity: O(1) as we only use a constant amount of extra space.
 */
public class downwardPyramid {
    public static void main(String[] args){
        // Outer loop to handle the number of rows (N = 4)
        for(int i=0; i<4; i++){
            // Inner loop to print leading spaces for alignment in each row
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            // Inner loop to print stars separated by space
            for(int k=4-i; k>0; k--){
                System.out.print("* ");
            }
            // Move to the next line after finishing the row
            System.out.println();
        }
    }
}
