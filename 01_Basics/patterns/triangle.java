/**
 * Task: Print a right-angled triangle star pattern.
 * Pattern:
 * *
 * **
 * ***
 * ****
 * 
 * Time Complexity: O(N^2) where N is the number of rows (4 in this case).
 * Space Complexity: O(1) as we only use a constant amount of extra space.
 */
public class triangle {
    public static void main(String[] args){
        // Outer loop to handle the number of rows (N = 4)
        for(int i=0; i<4; i++){
            // Inner loop to print stars (i + 1 stars in row i)
            for(int j=0; j<i+1; j++){
                System.out.print("*");
            }
            // Move to the next line after finishing the row
            System.out.println();
        }
    }
}
