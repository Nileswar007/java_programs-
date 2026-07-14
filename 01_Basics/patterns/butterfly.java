//  For n = 4:                                                                                                                                                                                                                                   
//     *      *                                                                                                            
//     **    **                                                                                                            
//     ***  ***                                                                                                            
//     ********                                                                                                            
//     ***  ***                                                                                                            
//     **    **                                                                                                            
//     *      *  
public class butterfly {
    public static void main(String[] args){

        for(int i=1; i<=4; i++){
            for(int k=0; k<i; k++){
            System.out.print("*");
         }
            for(int j=0; j<2*(4-i);j++){
             
                System.out.print(" ");
            }
         for(int k=0; k<i; k++){
            System.out.print("*");
         }
           System.out.println();
        }

        for(int a=3; a>=1; a--){
            for(int b=0; b<a; b++){
                System.out.print("*");
            }
            for(int c=0; c<2*(4-a); c++){
                System.out.print(" ");
            }
                for(int b=0; b<a; b++){
                System.out.print("*");
            }
            System.out.println();
        }

    }    
}
