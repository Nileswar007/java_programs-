import java.util.Scanner;

/**
 * The GcdLcm class provides utility methods to calculate the
 * Greatest Common Divisor (GCD) and Least Common Multiple (LCM)
 * of two integers, and includes a main method for interactive user input.
 */
public class GcdLcm {

    /**
     * Entry point of the program. Prompts the user to enter two numbers,
     * calculates their GCD and LCM, and prints the results to the console.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Initialize Scanner to read input from console
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two numbers");
        int num1 = input.nextInt();
        int num2 = input.nextInt(); 

        // Calculate GCD and LCM
        int gcd = getGcd(num1, num2);
        int lcm = getLcm(num1, num2);

        // Display the results
        System.out.println("The GCD is: " + gcd);
        System.out.println("The LCM is: " + lcm);
        
        // Close scanner to release resources
        input.close();
    }

    /**
     * Calculates the Greatest Common Divisor (GCD) of two numbers
     * using the Euclidean algorithm recursively.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the greatest common divisor of a and b
     */
    public static int getGcd(int a, int b) {
        // Base case: if the second number is 0, the GCD is the first number
        if (b == 0) {
            return a;
        }
        // Recursive step: GCD(a, b) = GCD(b, a % b)
        return getGcd(b, a % b);
    }

    /**
     * Calculates the Least Common Multiple (LCM) of two numbers
     * using the relationship: LCM(a, b) = (|a * b|) / GCD(a, b).
     *
     * @param a the first integer
     * @param b the second integer
     * @return the least common multiple of a and b, or 0 if either is 0
     */
    public static int getLcm(int a, int b) {
        // If either number is 0, the LCM is 0
        if (a == 0 || b == 0) {
            return 0;
        }
        // Calculate LCM: divide first to prevent integer overflow
        return a / getGcd(a, b) * b;
    }
}

