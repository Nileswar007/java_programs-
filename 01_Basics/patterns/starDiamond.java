public class starDiamond {
    public static void main(String[] args){
        //upper triangle
        for(int i=0; i<5; i++){
            for(int j=0; j<4-i; j++){
                System.out.print(" ");
            }
            for(int k=0; k<2*i+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
                for(int a=4; a>=0; a--){
            for(int b=0; b<4-a; b++){
                System.out.print(" ");
            }
            for(int c=2*a+1; c>0;c--){
                System.out.print("*");
            }
            System.out.println();
    }
    
}
}
