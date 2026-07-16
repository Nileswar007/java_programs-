/**
 * Task: Print an inverted right-angled triangle star pattern.
 * Pattern:
 * * * * * * 
 * * * * * 
 * * * * 
 * * * 
 * * 
 * * 
 * 
 * Time Complexity: O(N^2) where N is the starting number of stars (5 in this case).
 * Space Complexity: O(1) as we only use a constant amount of extra space.
 */
public class invertedRightTriangle {
    public static void main(String[] args){
        // Outer loop to handle the rows, counting down from 5 to 1
        for(int i=5; i>0; i--){
            // Inner loop to print stars for each row (i stars in row i)
            for(int j=0; j<i;j++){
                System.out.print("* ");
            }
            // Move to the next line after completing a row
            System.out.println();
        }
    }  
}
