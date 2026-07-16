/**
 * Task: Print a right-aligned right-angled triangle star pattern.
 * Pattern:
 *       * 
 *     * * 
 *   * * * 
 * * * * * 
 * 
 * Time Complexity: O(N^2) where N is the number of rows (4 in this case).
 * Space Complexity: O(1) as we only use a constant amount of extra space.
 */
public class rightTriangle {
    public static void main(String[] args){
        // Outer loop to handle the number of rows (N = 4)
        for(int i=0; i<4; i++){
            // Inner loop 1: Print leading spaces for right-alignment
            for(int j=0; j<4-i; j++){
                System.out.print("  ");
            }
            // Inner loop 2: Print stars (i + 1 stars in row i)
            for(int k=0; k<i+1; k++){
                System.out.print("* ");
            }
            // Move to the next line after completing the row
            System.out.println();
        }
    }
}
