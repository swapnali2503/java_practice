/* Two numbers are entered by the user, x and n. Write a function to find
the value of one number raised to the power of another i.e. 𝑥 .
 */

import java.util.Scanner;
class fun7 {
    
    // Function to calculate x raised to the power of n
    public static double power(double x, int n) {
        return Math.pow(x, n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the base number
        System.out.print("Enter the base number (x): ");
        double x = scanner.nextDouble();

        // Prompt the user to enter the exponent
        System.out.print("Enter the exponent (n): ");
        int n = scanner.nextInt();

        // Calculate the power
        double result = power(x, n);

        // Display the result
        System.out.println(x + " raised to the power of " + n + " is: " + result);
    }
}

    
