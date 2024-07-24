
/* write a program to remove specific element from array */
import java.util.*; 
public class arr15 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements:");
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter element to remove");
        int x = sc.nextInt();
        int index =0;
        int tempArr[] = new int[n];


        
         for( int i=0;i<n;i++){
            if(arr[i] !=x){
                tempArr[index++] = arr[i];


            }

        }

        int[] newArr = new int[index];
        for(int i = 0; i < index; i++){
            newArr[i] = tempArr[i];
        }

        System.out.println("Array after removing the element:");
        for(int i = 0; i < newArr.length; i++){
            System.out.print(newArr[i] + " ");
        }

        
    }
    
}
