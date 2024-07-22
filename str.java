/* Alice has a collection of songs represented as a string S where each character represents a song.A playlist is a substring of 
 * given string with exactly k number of songs. She wants to create a playlist that contains maximum number of her favourite song
   which is 'a'.your task is to find and return an integer value representing maximum number of favourite songs that she can get 
   in a single playlist.
   INPUT SPECIFICATION:
   input1: A string value S representing collection of songs
   input2: an integer value K representing the number of songs in playlist
   
   OUTPUT SPECIFICATION
   return an integer value representing the maximum number of favourite songs that she can get in single playlist.

   example:
   input1:abaca
  */

  import java.util.Scanner;

public class str {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string S
        System.out.println("Enter the collection of songs (string S):");
        String S = scanner.nextLine();

        // Input the integer K
        System.out.println("Enter the number of songs in the playlist (integer K):");
        int K = scanner.nextInt();

        // Output the result
        System.out.println("Maximum number of favourite songs ('a') in a single playlist: " + maxFavouriteSongs(S, K));
    }

    public static int maxFavouriteSongs(String S, int K) {
        int maxCount = 0;
        int currentCount = 0;

        // Initial window
        for (int i = 0; i < K; i++) {
            if (S.charAt(i) == 'a') {
                currentCount++;
            }
        }
        maxCount = currentCount;

        // Sliding window
        for (int i = K; i < S.length(); i++) {
            if (S.charAt(i) == 'a') {
                currentCount++;
            }
            if (S.charAt(i - K) == 'a') {
                currentCount--;
            }
            maxCount = Math.max(maxCount, currentCount);
        }

        return maxCount;
    }
}
