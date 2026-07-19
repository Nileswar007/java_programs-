import java.util.Scanner;
public class GcdLcm{
    public static void main(String[] args){
        
        Scanner input= new Scanner(System.in);

        System.out.println("Enter two numbers");
        int num1=input.nextInt();
        int num2=input.nextInt(); 

         int gcd = getGcd(num1,num2);
         int lcm = getLcm(num1,num2);

         System.out.println("The GCD is: " + gcd);
         System.out.println("The LCM is: " + lcm);
         input.close();
        }
                public static int getGcd(int a, int b){
                  if (b==0){
                    return a;
                  }
                return getGcd(b,a % b);
        }
        public static int getLcm(int a, int b)
        {
            if(a ==0 || b==0){
                return 0;
            }
            return a/getGcd(a,b)*b;
        }
    }
