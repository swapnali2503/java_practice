
/*  Given a number N . your task is to make No single digit number by performing these operations

1) If N is odd, make it floor (N12)

2) IF N is even, make it floor ((N-2)/2).

(3) if N is already a single digit print as it is.   */



import java.util.*;
class singleDigit{

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        int ans = Digit(n);
        System.out.println(ans);



    }
    public static int Digit(int n){
            
        if(n>=0 && n<=9){
            return n;

        }
        
        while(n>9){
            if(n %2 != 0){
                n = n/2;
            }
            if(n%2 ==0){
                n = ((n-2)/2);
            }
        }

        return n;
    }
}