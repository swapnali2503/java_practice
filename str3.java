import java.util.*;
class arr16{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string:");
        String s1 = sc.nextLine();
        System.out.println("Enter second string:");
        String s2 = sc.nextLine();


        //call method
        areAnagrams(s1,s2);
        System.out.println("Are Strings Anagrams:");
        System.out.println(areAnagrams(s1,s2));


    }
    public static String areAnagrams(String s1,String s2){
        if(s1.length() != s2.length()){
            return "NO";
        }
        //convert into array
        char [] charArray1 = s1.toCharArray();
        char [] charArray2 = s2.toCharArray();

        //sort array
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        //check whether to arrays are equal or not
        return Arrays.equals(charArray1,charArray2)? "yes": "no";


    }
}