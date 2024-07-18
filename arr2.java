//Find the maximum & minimum number in an array of integers. 


import java.util.Scanner;

public class arr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        
        int size = sc.nextInt();

        // Initialize the array
        int arr[] = new int[size];
        
        // Take inputs
        System.out.println("Enter values:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Initialize min and max with the first element of the array
        int min = arr[0];
        int max = arr[0];
        
        // Find min and max values
        for (int i = 1; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        
        // Output min and max values
        System.out.println("The maximum value in the array is: " + max);
        System.out.println("The minimum value in the array is: " + min);
    }
}
