//Enter 3 numbers from the user & make a function to print their average.


import java.util.Scanner;

public class fun {
    public static int average(int a,int b,int c) {
        int avg = ((a + b + c) / 3);
        System.out.println("Average of three numbers: " + avg);
        return avg;
    }

    public static void main(String[] args) {
        System.out.println("Enter the value of three numbers:");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int avg1 = average(a,b,c);
    }
}
