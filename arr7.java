/* Given an array of integers and a number "sum".print all pairs in array whose sum is equal to sum.
 input:arr[] = {1,5,7,-1,5}
 sum = 6
 output: (1,5) (7,-1) (1,5) 
 */
import java.util.*;
public class arr7 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter values of array:");
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();

        }

        System.out.println("sum:");
        int sum = sc.nextInt();
        for(int i =0;i<n;i++){
            for(int j =i+1;j<n;j++){
                if (arr[i]+arr[j] == sum){
                    System.out.println("("+arr[i]+","+arr[j]+")");
                }
            }
        }

    }
    
}
