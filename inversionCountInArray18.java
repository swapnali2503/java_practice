/*  Inversion count in array
Problem statement
Let j and k be two indices in an array A.
If j < K and A[j] > A[k], then the pair (j,k) is known as an “Inversion pair”.
You are required to implement the following function:
int InversionCount(int *A, int n);
The function accepts an array ‘A’ of ‘n’ unique integers as its argument. You are required to 
calculate the number of ‘Inversion pair’ in an array A, and return.
Note:
If ‘A’ is NULL (None in case of python), return -1
If ‘n’ <2, return 0*/

import java.util.*;
public class inversionCountInArray18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int A[] = new int[n];
        System.out.println("Enter elements of array:");
        for(int i =0;i<n;i++){
            A[i] = sc.nextInt();
        }
        int result = inversionCount(A,n);
        System.out.println("count is: " +result);

    }
    public static int inversionCount(int A[],int n){
        int inv_count=0;
        if( A == null){
            return -1;
        }
        if(n<2){
            return 0;
        }
        
        for(int j=0;j<n;j++){
            for(int k= j+1;k<n;k++){
                if(A[j]>A[k]){
                   inv_count++;
                }
            }
        }
        return inv_count;
    }

    
}
