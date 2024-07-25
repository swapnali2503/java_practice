/* check wheter given string is palindrome or not */

import java.util.*;
public class str2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter string:");
        String s = sc.nextLine();
        String rev ="";

        for(int i =s.length()-1;i>=0;i--){
            rev =rev+s.charAt(i);
        }

        if(rev.equals(s)){
          
            System.out.println("given string is palindrome");
        }

        else{
            System.out.println("given string is not palindrome");
        }
    }
    
}
