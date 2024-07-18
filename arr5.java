/* Given two sets represented by two arrays, how to check if the given two sets are disjoint or not? It may be assumed that the given arrays have no duplicates.

Input: set1[] = {12, 34, 11, 9, 3}
       set2[] = {2, 1, 3, 5}
Output: Not Disjoint
3 is common in two sets.
Input: set1[] = {12, 34, 11, 9, 3}
       set2[] = {7, 2, 1, 5}
Output: Yes, Disjoint
There is no common element in two sets. */


import java.util.*;
public class arr5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of set1:");
        int size1 = sc.nextInt();

        int set1[] = new int[size1];           //initialise array1

        //take inputs for 1st array
        System.out.println("Enter the values of set1:");
        for(int i = 0;i<size1;i++){
            set1[i] = sc.nextInt();
        }

        //2nd array
        System.out.println("Enter the size of set2");
        int size2 = sc.nextInt();

        int set2[] = new int[size2];

        //take inputs from user
        System.out.println("Enter the values of set2:");
        for(int i =0;i<size2;i++){
            set2[i] = sc.nextInt();
        }

        //traverse both arrays to check there is any common element or not
        boolean isDisjoint = false;

        for(int i =0;i<size1;i++){
            for(int j = 0;j<size2;j++){
                if(set1[i] == set2[j]){
                    isDisjoint = false;
                    
                }
                else{
                    //System.out.println("there is no common element,it is DISJOINT!");
                    isDisjoint = true;
                }
            }

        }
        if(isDisjoint){
            System.out.println("there is no common element.sets are NOT DISJOINT!!");
        }
        else{
            System.out.println("there is common element.sets are DISJOINT!!");
        }
        
        
    }
    
}
