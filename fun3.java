//Write a function which takes in 2 numbers and returns the greater of those two.

import java.util.*;

class fun3{
    public static void greatNum(int a, int b){
        if(a > b){
            System.out.println("the greatest number is:" + a);
        }
        else{
            System.out.println("the greatest number is:" + b);
        }

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number:");
        int a = sc.nextInt();

        System.out.println("enter second number:");
        int b = sc.nextInt();

        greatNum(a,b);

    }
}