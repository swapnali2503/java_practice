//Write a function to print the sum of all odd numbers from 1 to n.

import java.util.*;
public class fun2 {
    public static void number(int n){
        int sum =0;
        for(int i=0;i<=n;i++){
            if(i != 0){
                System.out.println(i);   //print odd numbers
                sum = sum + i;
            }


        }
        System.out.println("the sum of odd number is:" + sum);

      
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("value of n:");
        int n = sc.nextInt();
         number(n);       
    }
    
}
