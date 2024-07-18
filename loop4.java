//print all even numbers till n

import java.util.*;
class loop4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of n:");
        int n = sc.nextInt();

        System.out.println("even numbers are:");

        for(int i=0;i<=n;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }

    }
    
}
