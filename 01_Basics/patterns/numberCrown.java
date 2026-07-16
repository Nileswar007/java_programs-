public class numberCrown {
    public static void main(String[] args){
        for(int i=1;i<=4;i++){
            //left numbers
            for(int j=1;j<i+1;j++){
                System.out.print(j);
            } 
            //middle spaces
                for(int k=1;k<=(2*(4-i));k++){
                System.out.print(" ");
            }
            //right numbers 
            for( int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();                     
        }
        
    }
    
}
