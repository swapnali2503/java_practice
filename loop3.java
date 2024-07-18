//print the table of input by user

import java.util.Scanner;

class loop3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print its multiplication table:");
        int n = sc.nextInt();

        for (int mult = 1; mult <= 10; mult++) {
            System.out.println(n + " * " + mult + " = " + (n * mult));
        }
    }
}
