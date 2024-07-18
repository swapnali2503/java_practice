//find only repetitive elements between 1 to n

import java.util.*;
public class arr4 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n = sc.nextInt();

        //define array
        int arr[] = new int[n];

        //take inputs from user
        System.out.println("Enter values of array:");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();

        //traverse the array using outer for loop and check the repetitve elements using inner for loop
    
        int repeatedEle = 0;
        for(int i = 0 ;i<n;i++){
            for(int j = 0;j<n;j++){
                
                if(arr[i] == arr[j])
                repeatedEle = arr[i];
            }
        }
        System.out.println("the repeated element is:"+ repeatedEle);

        
    }
    
}
