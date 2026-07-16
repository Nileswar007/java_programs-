/**
 * Task: Print a star diamond pattern.
 * Pattern:
 *     *
 *    ***
 *   *****
 *  *******
 * *********
 *  *******
 *   *****
 *    ***
 *     *
 * 
 * Time Complexity: O(N^2) where N is the half height of the diamond (5 in this case).
 * Space Complexity: O(1) as we only use a constant amount of extra space.
 */
public class starDiamond {
    public static void main(String[] args){
        // Outer loop 1: Handle upper half of the diamond (rows 0 to 4)
        for(int i=0; i<5; i++){
            // Inner loop 1: Print leading spaces
            for(int j=0; j<4-i; j++){
                System.out.print(" ");
            }
            // Inner loop 2: Print stars (2 * i + 1 stars)
            for(int k=0; k<2*i+1;k++){
                System.out.print("*");
            }
            // Move to the next row
            System.out.println();
        }
        
        // Outer loop 2: Handle lower half of the diamond (rows 4 down to 0)
        for(int a=4; a>=0; a--){
            // Inner loop 1: Print leading spaces
            for(int b=0; b<4-a; b++){
                System.out.print(" ");
            }
            // Inner loop 2: Print stars (2 * a + 1 stars)
            for(int c=2*a+1; c>0;c--){
                System.out.print("*");
            }
            // Move to the next row
            System.out.println();
        }
    }
}
