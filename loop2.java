//print the sum of first n natural numbers


import java.util.*;
class loop2 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the value of n:");
            int n = sc.nextInt();           //take input from user
            int sum = 0;

            for(int i =1;i<=n;i++){

                sum = sum+i;               

            }
            System.out.println("the sum of the numbers is:" +sum);







    }

    
}
