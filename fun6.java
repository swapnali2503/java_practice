/*	Write a program to enter the numbers till the user wants and 
at the end it should display the count of positive, negative and zeros entered. */

import java.util.*;
public class fun6 {

    public static void userInput(int n){
        int countPositive = 0;
        int countNegative = 0;
        int countZeros = 0 ;

        for(int i =0;i<=n;i++){
            if(i == 1 || i > 1){
                 countPositive++;
            }

            if (i < 0){
                 countNegative++;
                
            }

            else{
                 countZeros++;
            }

        }
        System.out.println("count of positive numbers:" + countPositive);
        System.out.println("count of negative numbers:" + countNegative);
        System.out.println("count of zeros:" + countZeros);

    }

    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the value of n:");
      int n = sc.nextInt();


      //function call
      userInput(n);

    }
    
}
