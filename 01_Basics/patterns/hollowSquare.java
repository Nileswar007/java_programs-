/**
 * Task: Print a 4x4 hollow square star pattern.
 * Pattern:
 * * * * * 
 * *     * 
 * *     * 
 * * * * * 
 * 
 * Time Complexity: O(N^2) where N is the side length (4 in this case).
 * Space Complexity: O(1) as we only use a constant amount of extra space.
 */
public class hollowSquare {
    public static void main(String[] args){
        // Outer loop to handle the number of rows (N = 4)
        for(int i=0; i<4; i++){
            // Inner loop to handle the columns (N = 4)
            for(int j=0; j<4; j++){
                // Print star only on the boundary rows and columns
                if(i==0 || i==3 || j==0 || j==3) {
                    System.out.print("* ");
                } else {
                    // Print spaces for the hollow center of the square
                    System.out.print("  ");
                }
            }
            // Move to the next line after completing a row
            System.out.println();
        }
    }
}
