/**
 * Task: Print a butterfly star pattern.
 * Pattern:
 * *      *
 * **    **
 * ***  ***
 * ********
 * ***  ***
 * **    **
 * *      *
 * 
 * Time Complexity: O(N^2) where N is the half height of the butterfly (4 in this case).
 * Space Complexity: O(1) as we only use a constant amount of extra space.
 */
public class butterfly {
    public static void main(String[] args){

        // Outer loop for the upper half of the butterfly (rows 1 to 4)
        for(int i=1; i<=4; i++){
            // Print left wing stars
            for(int k=0; k<i; k++){
                System.out.print("*");
            }
            // Print middle spaces
            for(int j=0; j<2*(4-i);j++){
                System.out.print(" ");
            }
            // Print right wing stars
            for(int k=0; k<i; k++){
                System.out.print("*");
            }
            // Move to the next row
            System.out.println();
        }

        // Outer loop for the lower half of the butterfly (rows 3 down to 1)
        for(int a=3; a>=1; a--){
            // Print left wing stars
            for(int b=0; b<a; b++){
                System.out.print("*");
            }
            // Print middle spaces
            for(int c=0; c<2*(4-a); c++){
                System.out.print(" ");
            }
            // Print right wing stars
            for(int b=0; b<a; b++){
                System.out.print("*");
            }
            // Move to the next row
            System.out.println();
        }
    }    
}
