/* the function accept 2 positive integers m and n as its arguments.you are required to calculate the sum of numbers divisible 
both by 3 and 5,between m and n both inclusive and return the same
input:
m:12
n:50
output :90  */

import java.util.*;
public class arr6 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("n:");
        int n = sc.nextInt();
        System.out.print("m:");
        int m = sc.nextInt();

        fun(n,m);
        System.out.print("output:");
        System.out.println(fun( n,m));

        
    }

    public static int fun(int n ,int m){

        int sum = 0;
        for(int i =n;i<=m;i++){
            if(i%3 == 0 && i%5 == 0 ){
                
                sum = sum + i;
            }

        }
        return sum;
    }

}
    

