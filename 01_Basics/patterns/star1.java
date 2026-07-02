/**
 * Task: Print a 4x4 square star pattern.
 * Time Complexity: O(N^2) where N is the number of rows/cols (4 in this case).
 * Space Complexity: O(1) as we just print to standard output.
 */
public class star1 {
    public static void main(String[] args){
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
