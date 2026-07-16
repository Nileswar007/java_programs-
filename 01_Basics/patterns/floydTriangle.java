/**
 * Task: Print Floyd's Triangle pattern.
 * Pattern:
 * 1 
 * 2 3 
 * 4 5 6 
 * 7 8 9 10 
 * 11 12 13 14 15 
 * 
 * Time Complexity: O(N^2) where N is the number of rows (5 in this case).
 * Space Complexity: O(1) as we only use a constant amount of extra space.
 */
public class floydTriangle {
    public static void main(String[] args){
        int counter=1; // Start counter at 1
        
        // Outer loop to handle the number of rows (N = 5)
        for(int i=0; i<5; i++){
            // Inner loop to print values in each column of row i
            for(int j=0; j<i+1;j++){              
                System.out.print(counter+" ");
                counter++; // Increment the counter
            }     
            // Move to the next line after completing the row
            System.out.println();
        }
    }
}
