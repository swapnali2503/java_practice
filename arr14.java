

import java.util.*;
public class arr14 {
    private static int[][] arr1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1st array
        System.out.println("Enter size of 1st array:");
        int n = sc.nextInt();
        int [] arr1 = new int[n];
        System.out.println("Enter elements of 1st array:");
        for(int i=0;i<n;i++){
            arr1[i] = sc.nextInt();
        }
        //2nd array
        System.out.println("Enter size of 2nd array:");
        int m = sc.nextInt();
        int [] arr2 = new int[m];
        System.out.println("Enter elements of 2nd array:");
        for(int i=0;i<m;i++){
            arr2[i] = sc.nextInt();
        }

int x = n+m;
int mergeArray[] = new int [x];

//for merging 1st array
for(int i =0;i<n;i++){
     mergeArray[i] = arr1[i];
}
//for merging 2nd array
for(int i =0;i<m;i++){
     mergeArray[n+i] = arr2[i];
}

//print merged array
System.out.println("merged array is:");
System.out.print("{");
for(int i=0;i<x;i++){
    System.out.print( mergeArray[i] +","+ " ");
}
System.out.print("}");



    }
    
}
