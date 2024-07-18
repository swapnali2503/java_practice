/*5.	Write a function that takes in age as input and returns if that
 person is eligible to vote or not. A person of age > 18 is eligible to vote. */

import java.util.*;
public class fun5 {

    public static void voter(int age){
        if(age > 18){
            System.out.println("the person is eligible to vote!");
        }
        else{
            System.out.println("the person can't vote!");
        }


    }

    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter age of person:");
        int age = sc.nextInt();

        voter(age);


    }
    
}
