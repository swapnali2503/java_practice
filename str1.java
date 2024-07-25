/* remove duplicate elements from array */

import java.util.*;
class str1{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter string:");
        String S = sc.nextLine();
        String rev ="";

        for(int i=S.length()-1;i>=0;i--){
            rev = rev+S.charAt(i);
        }
        System.out.println(rev);
         
        
    }

    
}