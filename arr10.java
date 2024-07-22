/* program to create an array of 'n' integer elements.where n value should be taken from user.insert tha values from user
   and find min number from array
   input: n=6
   enter elements in array
   2  3  6 9 5 1
   output :1

 */


import java.util.*;
public class arr10 {
    

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter elements of array:");
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        for(int i =0;i<n;i++){
            if(arr[i]<=min){
                min = arr[i];
            }
        }
        System.out.println("The minimum element is:" + min);
    }
    
}

    
