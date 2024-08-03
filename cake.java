

import java.util.*;
public class cake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of cuts:");
        int n = sc.nextInt();

        int ans = Cuts(n);
        System.out.println("Number of pieces:" + ans);
    }

    public static int Cuts(int n){
        if(n ==0){
            return 1;
        }

        int result;
        result = (n*(n+1)/2)+1;

        result = result % 1000000007;

        return result;

    }

    
}
