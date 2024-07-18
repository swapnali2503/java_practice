/* Take an array of names as input from the user and print them on the screen. */

import java.util.*;
public class arr1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array:");
        int size = sc.nextInt();

        String array[] = new String[size];      //define array

        // taking inputs for array from user
        System.out.println("enter the names:");
        for(int i = 0; i<size;i++){
            array[i] = sc.next();


        }

        //output
        for(int i =0;i<size;i++){
            System.out.println(array[i]);
        }
            sc.close();

    }
    
}


