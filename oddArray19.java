/* An odd number is an integer which is not a multiple of 2.
You are required to implement the following function:
Int SumOddIntegers(int arr[], int n);
The function accepts an integer array ‘arr’ of length ‘n’ as its argument. You are required to 
calculate the sum of all odd integers in an array ‘an’ and return the same. */



import java.util.*;
public class oddArray19 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner (System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int arr[] = new int [n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int result = SumOddIntegers(arr, n);
        System.out.println("The sum of odd integers in an array is: " + result);
    }

    public static int SumOddIntegers(int arr[], int n){
        int sum=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2 !=0){
                sum = sum+arr[i];
                
            }
        }
        return sum;
    }
    
}
