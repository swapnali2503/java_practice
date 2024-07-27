/* the given function has a string (str) and two characters ,ch1 and ch2.
   Execute the function in such a way that str returns to its original string,and all
   the events in ch1 are replaced by ch2 and vice versa
 */
import java.util.*;
public class str4 {

    

        public static String replaceCh(String str, char ch1, char ch2) {

            char temp = ' '; 
            
            // Replace ch1 with temp
            str = str.replace(ch1, temp);
            // Replace ch2 with ch1
            str = str.replace(ch2, ch1);
            // Replace temp with ch2
            str = str.replace(temp, ch2);
            
            return str;
        }
    
        public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
            System.out.println("Enter string:");
            
            String str = sc.nextLine();
            System.out.println("enter one character to replace");
            char ch1 = sc.next().charAt(0);

            System.out.println("Enter second character to replace:");
            char ch2 = sc.next().charAt(0);
    
            // Call the replaceCh method and store the result
            String result = replaceCh(str, ch1, ch2);
        
            // Print the result
            System.out.println(result); 
        }
    
    
    
}
