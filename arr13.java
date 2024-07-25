/* take  char array from user and print only alphabets do not print special characters */
import java.util.*;
public class arr13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        
        char[] arr = new char[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++){
            arr[i] = sc.next().charAt(0);
        }
            

            /*for (int i = 0; i < n; i++) {
            if ((arr[i] >= 'a' && arr[i] <= 'z') || (arr[i] >= 'A' && arr[i] <= 'Z')) {
                System.out.println(arr[i]);
            } */
           System.out.println("array with only alphabets:");
        for(int i=0;i<n;i++){ 
            if((arr[i] >='a'  && arr[i] <= 'z' ) || (arr[i] >='A' && arr[i] <= 'Z')){
                System.out.println(arr[i]);
            }
        }
        
    }
    
}
