/**
 * Task: Print a number pyramid pattern.
 * Pattern:
 *    1
 *   2 2
 *  3 3 3
 * 4 4 4 4
 * 
 * Time Complexity: O(N^2) where N is the number of rows (4 in this case).
 * Space Complexity: O(1) as we only use a constant amount of extra space.
 */
public class numberPyramid {
    public static void main(String[] args){
        // Outer loop to handle the number of rows (N = 4)
        for(int i=0; i<4; i++){
            // Inner loop to print leading spaces for alignment in each row
            for(int j=0; j<4-i; j++){
                System.out.print(" ");
            }
            // Inner loop to print the current row number (1-based index) followed by a space
            for(int k=0; k<i+1; k++){
                System.out.print((i + 1) + " ");
            }
            // Move to the next line after finishing the row
            System.out.println();
        }
    }   
}
