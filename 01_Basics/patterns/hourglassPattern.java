/**
 * Task: Print an hourglass star pattern.
 * Pattern:
 * *********
 *  *******
 *   *****
 *    ***
 *     *
 *    ***
 *   *****
 *  *******
 * *********
 * 
 * Time Complexity: O(N^2) where N is the half height of the hourglass (5 in this case).
 * Space Complexity: O(1) as we only use a constant amount of extra space.
 */
public class hourglassPattern {
    public static void main(String[] args){
        for(int i=5;i>=1;i--){
            //inverted triangle 
            //spaces
            for(int l=1;l<=5-i;l++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=2*i-1;j++)
            {
             System.out.print("*");
            }
            //spaces
            System.out.println();
        }
        //lowerhalf
        for (int i = 2; i <= 5; i++) {                                                                              
                // Print leading spaces                                                                                 
                for (int l = 1; l <= 5 - i; l++) {                                                                      
                    System.out.print(" ");                                                                              
                }                                                                                                       
                // Print stars                                                                                          
                for (int j = 1; j <= 2 * i - 1; j++) {                                                                  
                    System.out.print("*");                                                                              
                }                                                                                                       
                System.out.println(); 
            }
    }    
}
