
import java.util.*;
class arr17{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter elements:");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter target element:");
        int target  = sc.nextInt();

        int result = findTarget(arr,target);
        if (result != -1){
            System.out.println("Target element is at index:" + result);
        }
        else{
            System.out.println("target element not found");
        }
    }
        

        public static int findTarget(int arr[],int target){
           
        //traverse array
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
            return i;
            }
            
        }


        return -1;
    }       

    }

    
