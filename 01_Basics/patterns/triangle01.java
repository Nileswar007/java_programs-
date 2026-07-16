/**
 * Task: Print a binary (0-1) triangle pattern.
 * Pattern:
 * 1 
 * 0 1 
 * 1 0 1 
 * 0 1 0 1 
 * 1 0 1 0 1 
 * 
 * Time Complexity: O(N^2) where N is the number of rows (5 in this case).
 * Space Complexity: O(1) as we only use a constant amount of extra space.
 */
public class triangle01 {
    public static void main(String[] args){
        // Outer loop to handle the number of rows (N = 5)
        for(int i=0; i<5; i++){
            // Inner loop to print values across columns in each row
            for(int j=0; j<i+1; j++){
                // If sum of row and column index is even, print 1, else 0
                if((i+j)%2==0){
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            // Move to the next line after completing the row
            System.out.println();
        }
    }
}
