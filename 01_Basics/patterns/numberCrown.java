/**
 * Task: Print a number crown pattern.
 * Pattern:
 * 1      1
 * 12    21
 * 123  321
 * 12344321
 * 
 * Time Complexity: O(N^2) where N is the height of the crown (4 in this case).
 * Space Complexity: O(1) as we only use a constant amount of extra space.
 */
public class numberCrown {
    public static void main(String[] args){
        // Outer loop to handle the number of rows (N = 4)
        for(int i=1;i<=4;i++){
            // Inner loop 1: Print left numbers from 1 to i
            for(int j=1;j<i+1;j++){
                System.out.print(j);
            } 
            // Inner loop 2: Print middle spaces (2 * (4 - i))
            for(int k=1;k<=(2*(4-i));k++){
                System.out.print(" ");
            }
            // Inner loop 3: Print right numbers from i down to 1
            for( int j=i;j>=1;j--){
                System.out.print(j);
            }
            // Move to the next line after completing the row
            System.out.println();                     
        }
    }
}
