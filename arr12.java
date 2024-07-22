/* write a program to create an array of 'n' integer elements .where n value should be taken from user.insert tha values from 
   the user.insert the values from user and find frequency of digit.
   input:
   n=5
   enter elements of array
   3
   5
   6
   7
   3
   output:
   frequency of digit 3 is 2
   frequency of digit 5 is 1
   frequency of digit 6 is 1
   frequency of digit 7 is 1
   
 */

 import java.util.Scanner;

 public class arr12 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         // Input: size of the array
         System.out.println("Enter size of array:");
         int n = sc.nextInt();
 
         // Input: elements of the array
         int arr[] = new int[n];
         System.out.println("Enter elements of array:");
         for (int i = 0; i < n; i++) {
             arr[i] = sc.nextInt();
         }
 
         // Array to keep track of counted elements
         boolean[] counted = new boolean[n];
 
         // Counting frequencies
         for (int i = 0; i < n; i++) {
             if (!counted[i]) { // Only count if this element hasn't been counted yet
                 int count = 1;
                 for (int j = i + 1; j < n; j++) {
                     if (arr[i] == arr[j]) {
                         count++;
                         counted[j] = true; // Mark this element as counted
                     }
                 }
                 System.out.println("Frequency of " + arr[i] + " is " + count);
             }
         }
     }
 }
 