
//most frequent element in an array

import java.util.*;
public class arr3 {
    public static void main(String[] args) 
  { 
    Scanner sc = new Scanner(System.in);

    
    System.out.println("enter the size of an array:");
    int n = sc.nextInt();        //size of an array

    int[] arr = new int[n];     ///define array
    
    //enter values of array
    System.out.println("enter values of an array:");
    //int k ;
    for(int k = 0;k<n;k++){
        arr[k] = sc.nextInt();
        
    }

    sc.close();

    int maxcount = 0; 
    int element_having_max_freq = 0; 
    for (int i = 0; i < n; i++) { 
      int count = 0; 
      for (int j = 0; j < n; j++) { 
        if (arr[i] == arr[j]) { 
          count++; 
        } 
      } 
  
      if (count > maxcount) { 
        maxcount = count; 
        element_having_max_freq = arr[i]; 
      } 

      
      }
    
        
        System.out.println("frequnet element:"+element_having_max_freq);
        System.out.println("maxcount:" + maxcount);
}
}

