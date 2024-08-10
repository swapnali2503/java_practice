
import java.util.*;

public class arr19 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("m");
        int m = sc.nextInt();

        System.out.println("n");
        int n =sc.nextInt();

        if(m>n){
            System.out.println("value of m should be less than n");
        }

         evenOdd(m,n);
    }

    public static void evenOdd(int m,int n){

        double evenSqrt;
        double evenSum=0;
         double oddSqrt;
         double oddSum=0;

        for(int i=m;i<=n;i++){
            if(i % 2 ==0){
                evenSqrt = Math.sqrt(i);

                evenSum = evenSum + evenSqrt;

            }
            else{
                oddSqrt = Math.sqrt(i);
                oddSum = oddSum + oddSqrt;

            }

        }
        System.out.println("sum of even numbers is:" + evenSum);
        System.out.println("sum of odd numbers is:" + oddSum);

        double diff = evenSum - oddSum;
        System.out.println("difference is:" + diff); 
        

    }

    
}
