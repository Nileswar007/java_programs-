import java.util.Scanner;

/**
 * The decimalToBinary class provides utility methods to convert
 * a decimal (Base 10) integer into its binary (Base 2) representation.
 */
public class decimalToBinary {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int num = input.nextInt();
        
        String binary = decimalToBin(num);
        System.out.println("the binary number of " + num + " is " + binary);
        
        // Close the scanner to release system resources
        input.close();
    }

    /**
     * Converts a non-negative decimal integer to its binary string representation.
     * 
     * @param decimal the decimal number to convert
     * @return the binary string representation of the decimal number
     */
    public static String decimalToBin(int decimal) {
        // Base case: if input is 0, the binary representation is "0"
        if (decimal == 0) {
            return "0";
        }
        
        StringBuilder result = new StringBuilder();                                                                     
        int temp = decimal; 
        
        // Repeatedly divide by 2 and collect remainders
        while (temp > 0) {
            int remainder = temp % 2;
            result.append(remainder);
            temp = temp / 2;
        }
        
        // The remainders are collected in reverse order, so we reverse to get the correct binary string
        return result.reverse().toString();
    }
}

