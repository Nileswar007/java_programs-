/**
 * Task: Print a 4x4 square star pattern.
 * Pattern:
 * ****
 * ****
 * ****
 * ****
 * 
 * Time Complexity: O(N^2) where N is the side length (4 in this case).
 * Space Complexity: O(1) as we only use a constant amount of extra space.
 */
public class star1 {
    public static void main(String[] args){
        // Outer loop to handle the number of rows (N = 4)
        for(int i=0; i<4; i++){
            // Inner loop to print stars across columns in each row
            for(int j=0; j<4; j++){
                System.out.print("*");
            }
            // Move to the next line after finishing the row
            System.out.println("");
        }
    }
}
