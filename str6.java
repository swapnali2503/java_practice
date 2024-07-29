import java.util.*;
class str6{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();

        int result = revNum(n);
        System.out.println("reverse number is:" + result);
              
    }
    public static int revNum(int n ){
        int rem ;
        int rev =0;

        while(n>0){
            rem = n%10;
            rev = (rev*10) + rem;
            n = n/10;
        }

        return rev;

        
    }
    

} 